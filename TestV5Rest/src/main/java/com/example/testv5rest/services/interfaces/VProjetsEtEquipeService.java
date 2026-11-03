package com.example.testv5rest.services.interfaces;

import com.example.testv5rest.models.VProjetsEtEquipe;
import com.example.testv5rest.models.dto.VProjetsEtEquipeSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;    
import java.util.List;


public interface VProjetsEtEquipeService {
    Page<VProjetsEtEquipe> getAllVProjetsEtEquipe(Pageable pageable);

    Page<VProjetsEtEquipe> getAllVProjetsEtEquipe(Pageable pageable, VProjetsEtEquipeSearch object);

    VProjetsEtEquipe getVProjetsEtEquipeById(Integer idProjet);

    public String exportVProjetsEtEquipeToCSV(List<VProjetsEtEquipe> vProjetsEtEquipe);


}
