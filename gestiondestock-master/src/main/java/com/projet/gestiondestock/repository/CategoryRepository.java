package com.projet.gestiondestock.repository;

import com.projet.gestiondestock.model.Category;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    Optional<Category> findCategoryByCode(String code);

}
