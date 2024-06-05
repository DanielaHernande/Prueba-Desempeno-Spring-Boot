package com.riwi.riwi_multimedia.api.dto.response;

import java.time.LocalDateTime;

import com.riwi.riwi_multimedia.utils.enums.Contenido;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MultimediaResponse {
    
    private Long id;
    private Contenido type;
    private String url;
    private LessonResponse lessonId;
    private LocalDateTime createdId;
    private boolean active;
}
