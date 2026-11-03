package com.example.testv5rest.services.interfaces;

import com.example.testv5rest.models.Projet;
import com.example.testv5rest.models.dto.ProjetSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;    
import java.util.List;


public interface ProjetService {
    Page<Projet> getAllProjet(Pageable pageable);

    Page<Projet> getAllProjet(Pageable pageable, ProjetSearch object);

    Projet getProjetById(Integer id);

    public String exportProjetToCSV(List<Projet> projet);

    

    Projet createProjet(Projet projet);

    Projet updateProjet(Integer id, Projet projet);

    void deleteProjet(Integer id);
    

}
