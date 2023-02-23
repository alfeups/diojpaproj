package me.dio.academia.digital.mapper;

import me.dio.academia.digital.dto.AlunoFormDTO;
import me.dio.academia.digital.entity.form.AlunoForm;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface AlunoFormDTOMapper {

    AlunoForm toModel(AlunoFormDTO dto);

    AlunoFormDTO toDto(AlunoForm model);
}
