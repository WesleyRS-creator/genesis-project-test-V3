package com.example.testv5rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.testv5rest.models.Adresse;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import com.example.testv5rest.models.Personne;



public interface AdresseRepository extends JpaRepository<Adresse, Integer>, JpaSpecificationExecutor<Adresse> {

List<Adresse> findByIdpersonnePersonne(Personne idpersonnePersonne);



}
