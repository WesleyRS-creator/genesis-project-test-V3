package com.example.testv5rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.testv5rest.models.Projet;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProjetRepository extends JpaRepository<Projet, Integer>, JpaSpecificationExecutor<Projet> {

}
