package com.example.testv5rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.testv5rest.models.Personne;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PersonneRepository extends JpaRepository<Personne, Integer>, JpaSpecificationExecutor<Personne> {

}
