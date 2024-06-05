package com.riwi.riwi_multimedia.api.dto.request;

import java.time.LocalDateTime;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClassRequest {
    
    @NotBlank(message = "El nombre de la clase es requerido")
    @Size(
        min = 2,
        max = 255,
        message = "EL nombre de la clase debe de tener entre 3 y 255 caracteres"
    )
    private String name;

    @NotBlank(message = "La descripcion de la clase es requerida")
    @Size(
        min = 10,
        message = "EL nombre de la clase debe de tener minimo 10 caracteres"
    )
    private String description;

    @NotBlank(message = "La activscion es requerida")
    private boolean active;
}
