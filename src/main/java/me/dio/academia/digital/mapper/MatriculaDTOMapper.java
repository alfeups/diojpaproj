package me.dio.academia.digital.mapper;

import me.dio.academia.digital.dto.MatriculaDTO;
import me.dio.academia.digital.entity.Matricula;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface MatriculaDTOMapper {

    Matricula toModel(MatriculaDTO dto);

    MatriculaDTO toDto(Matricula model);
}
