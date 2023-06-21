package com.project.GestionPersonne.service;

import com.project.GestionPersonne.dots.PersonneRequestDTO;
import com.project.GestionPersonne.mapper.AutoPersonneMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.GestionPersonne.exception.PersonneNotFoundException;
import com.project.GestionPersonne.model.Personne;
import com.project.GestionPersonne.repo.PersonneRepo;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
public class PersonneService {
    private final PersonneRepo personneRepo;

    @Autowired
    public PersonneService(PersonneRepo personneRepo) {
        this.personneRepo = personneRepo;
    }

    public PersonneRequestDTO addPersonne(PersonneRequestDTO personneRequestDTO) {
        Personne newPersonne = AutoPersonneMapper.MAPPER.mapToPersonne(personneRequestDTO);
        Personne personne = personneRepo.save(newPersonne);
        return  AutoPersonneMapper.MAPPER.mapToPersonneDto(personne);
    }

    public List<PersonneRequestDTO> findAllPersonnes() {
        return personneRepo.findAll().stream().map(AutoPersonneMapper.MAPPER::mapToPersonneDto).collect(Collectors.toList());
    }

}
