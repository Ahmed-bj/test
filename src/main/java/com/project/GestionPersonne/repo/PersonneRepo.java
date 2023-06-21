package com.project.GestionPersonne.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.GestionPersonne.model.Personne;

import java.util.Optional;

public interface PersonneRepo extends JpaRepository<Personne, Long> {
    void deletePersonneById(Long id);

    Optional<Personne> findPersonneById(Long id);
}
