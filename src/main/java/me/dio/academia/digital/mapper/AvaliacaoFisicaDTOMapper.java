package me.dio.academia.digital.mapper;

import me.dio.academia.digital.dto.AvaliacaoFisicaDTO;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface AvaliacaoFisicaDTOMapper {

    AvaliacaoFisica toModel(AvaliacaoFisicaDTO dto);

    AvaliacaoFisicaDTO toDto(AvaliacaoFisica model);

}
