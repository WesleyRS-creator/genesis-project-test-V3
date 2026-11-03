package com.example.testv5rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.testv5rest.models.VProjetsEtEquipe;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface VProjetsEtEquipeRepository extends JpaRepository<VProjetsEtEquipe, Integer>, JpaSpecificationExecutor<VProjetsEtEquipe> {

}
