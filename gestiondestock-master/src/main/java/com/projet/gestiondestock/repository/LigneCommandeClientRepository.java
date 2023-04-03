package com.projet.gestiondestock.repository;

import com.projet.gestiondestock.model.LigneCommandeClient;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneCommandeClientRepository extends JpaRepository<LigneCommandeClient, Integer> {


    List<LigneCommandeClient> findAllByCommandeClientId(Integer id);

    List<LigneCommandeClient> findAllByArticleId(Integer id);
}
