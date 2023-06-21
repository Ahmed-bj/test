package com.project.GestionPersonne.mapper;

import com.project.GestionPersonne.dots.PersonneRequestDTO;
import com.project.GestionPersonne.model.Personne;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoPersonneMapper {

    AutoPersonneMapper MAPPER = Mappers.getMapper(AutoPersonneMapper.class);

    PersonneRequestDTO mapToPersonneDto(Personne user);

    Personne mapToPersonne(PersonneRequestDTO userDto);
}
