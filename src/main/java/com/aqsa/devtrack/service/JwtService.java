package com.aqsa.devtrack.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;

@Service
public class JwtService {

    // ⚠️ In production: move this to application.properties / env variable
    private static final String SECRET =
            "devtrack_super_secure_secret_key_which_should_be_long_enough_12345";

    // Token validity: 1 hour
    private static final long EXPIRATION_TIME = 1000 * 60 * 60;

    private final Key key = Keys.hmacShaKeyFor(SECRET.getBytes());

    // 🔵 GENERATE TOKEN
    public String generateToken(String email) {

        return Jwts.builder()
                .setSubject(email)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    // 🔵 EXTRACT EMAIL FROM TOKEN
    public String extractEmail(String token) {

        Claims claims = Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();

        return claims.getSubject();
    }

    // 🔵 VALIDATE TOKEN
    public boolean isTokenValid(String token) {

        try {
            Jwts.parserBuilder()
                    .setSigningKey(key)
                    .build()
                    .parseClaimsJws(token);

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}