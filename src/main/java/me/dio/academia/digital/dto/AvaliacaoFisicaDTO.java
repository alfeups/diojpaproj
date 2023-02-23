package me.dio.academia.digital.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import me.dio.academia.digital.entity.Aluno;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class AvaliacaoFisicaDTO {

    @JsonProperty("id_avalicao")
    @NotBlank
    @NotNull
    private Long id;

    @JsonProperty("aluno")
    @NotBlank
    @NotNull
    private Aluno aluno;

    @JsonProperty("data_avalicao")
    private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

    @JsonProperty("peso_atual")
    @NotBlank
    @NotNull
    private double peso;

    @JsonProperty("altura_atual")
    @NotBlank
    @NotNull
    private double altura;
}
