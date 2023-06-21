package com.project.GestionPersonne.resource;

import com.project.GestionPersonne.dots.PersonneRequestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.project.GestionPersonne.model.Personne;
import com.project.GestionPersonne.service.PersonneService;
import javax.validation.Valid;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/personne")
public class PersonneResource {
    private final PersonneService personneService;

    public PersonneResource(PersonneService personneService) {
        this.personneService = personneService;
    }

    @GetMapping
    public ResponseEntity<List<PersonneRequestDTO>> getAllPersonness () {
        return new ResponseEntity<>(personneService.findAllPersonnes(), HttpStatus.OK); // new ResponseEntity<>(PersonneRequestDTO, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PersonneRequestDTO> addPersonne(@Valid @RequestBody PersonneRequestDTO personne) {
        PersonneRequestDTO newPersonne = personneService.addPersonne(personne);
        return new ResponseEntity<>(newPersonne, HttpStatus.CREATED);
    }

}
