package me.dio.academia.digital.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import me.dio.academia.digital.dto.AlunoFormDTO;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.mapper.AlunoFormDTOMapper;
import me.dio.academia.digital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/alunos")
public class AlunoController {

  private AlunoServiceImpl service;
  private AlunoFormDTOMapper dtoMapper;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Aluno create(@Valid @RequestBody AlunoFormDTO formDTO) {
    return service.create(
            this.dtoMapper.toModel(formDTO));
  }

  @GetMapping("/avaliacoes/{id}")
  @ResponseStatus(HttpStatus.OK)
  public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id) {
    return service.getAllAvaliacaoFisicaId(id);
  }

  @GetMapping
  public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false)
                                  String dataDeNacimento){
    return service.getAll(dataDeNacimento);
  }


}
