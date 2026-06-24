package com.aqsa.devtrack.dto;

import lombok.Data;

import java.util.List;

@Data
public class PaginatedActivityResponseDTO {

    private List<ActivityResponseDTO> activities;

    private int currentPage;

    private int pageSize;

    private long totalElements;

    private int totalPages;

    private boolean last;
}