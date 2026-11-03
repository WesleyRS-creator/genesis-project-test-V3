package com.example.testv5rest.services.interfaces;

import com.example.testv5rest.models.Passeport;
import com.example.testv5rest.models.dto.PasseportSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;    
import java.util.List;


public interface PasseportService {
    Page<Passeport> getAllPasseport(Pageable pageable);

    Page<Passeport> getAllPasseport(Pageable pageable, PasseportSearch object);

    Passeport getPasseportById(Integer id);

    public String exportPasseportToCSV(List<Passeport> passeport);

    

    Passeport createPasseport(Passeport passeport);

    Passeport updatePasseport(Integer id, Passeport passeport);

    void deletePasseport(Integer id);
    

}
