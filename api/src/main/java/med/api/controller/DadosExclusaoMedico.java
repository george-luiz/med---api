package med.api.controller;

import jakarta.validation.constraints.NotNull;

public record DadosExclusaoMedico(
        @NotNull
        Long id
) {
}
