package com.riwi.riwi_multimedia.api.dto.request;

import java.time.LocalDateTime;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequest {
    
    @NotBlank(message = "El nombre del estudiante es requerido")
    private String name;

    @NotBlank(message = "EL correo del estudiante es requerido")
    private String email;

    @NotNull(message = "EL id de la clase es requerida")
    private Long classId;

    @NotBlank(message = "La activacion es requerida")
    private boolean active;
}
