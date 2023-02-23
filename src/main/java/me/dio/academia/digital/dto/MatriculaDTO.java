package me.dio.academia.digital.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import me.dio.academia.digital.entity.Aluno;

import java.time.LocalDateTime;

public class MatriculaDTO {

    @JsonProperty("id_matricula")
    private Long id;

    @JsonProperty("aluno_id")
    private Aluno aluno;
    @JsonProperty("data_matricula")
    private LocalDateTime dataDaMatricula = LocalDateTime.now();
}
