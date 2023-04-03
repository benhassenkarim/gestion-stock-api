package com.projet.gestiondestock.repository;

import com.projet.gestiondestock.model.Ventes;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VentesRepository extends JpaRepository<Ventes, Integer> {

    Optional<Ventes> findVentesByCode(String code);
}
