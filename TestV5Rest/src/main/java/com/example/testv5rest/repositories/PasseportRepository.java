package com.example.testv5rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.testv5rest.models.Passeport;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import com.example.testv5rest.models.Personne;



public interface PasseportRepository extends JpaRepository<Passeport, Integer>, JpaSpecificationExecutor<Passeport> {

List<Passeport> findByIdpersonnePersonne(Personne idpersonnePersonne);



}
