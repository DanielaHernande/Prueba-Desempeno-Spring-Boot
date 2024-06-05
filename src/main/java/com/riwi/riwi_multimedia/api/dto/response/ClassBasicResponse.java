package com.riwi.riwi_multimedia.api.dto.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClassBasicResponse {
    
    private Long id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private boolean active;
}
