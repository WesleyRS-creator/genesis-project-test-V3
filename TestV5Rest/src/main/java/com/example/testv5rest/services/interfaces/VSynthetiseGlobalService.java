package com.example.testv5rest.services.interfaces;

import com.example.testv5rest.models.VSynthetiseGlobal;
import com.example.testv5rest.models.dto.VSynthetiseGlobalSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;    
import java.util.List;


public interface VSynthetiseGlobalService {
    Page<VSynthetiseGlobal> getAllVSynthetiseGlobal(Pageable pageable);

    Page<VSynthetiseGlobal> getAllVSynthetiseGlobal(Pageable pageable, VSynthetiseGlobalSearch object);

    VSynthetiseGlobal getVSynthetiseGlobalById(Integer idPersonne);

    public String exportVSynthetiseGlobalToCSV(List<VSynthetiseGlobal> vSynthetiseGlobal);


}
