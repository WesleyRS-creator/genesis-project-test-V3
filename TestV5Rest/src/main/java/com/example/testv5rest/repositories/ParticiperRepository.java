package com.example.testv5rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.testv5rest.models.Participer;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import com.example.testv5rest.models.Personne;
import com.example.testv5rest.models.Projet;



public interface ParticiperRepository extends JpaRepository<Participer, Integer>, JpaSpecificationExecutor<Participer> {

List<Participer> findByIdpersonnePersonne(Personne idpersonnePersonne);
List<Participer> findByIdprojetProjet(Projet idprojetProjet);



}
