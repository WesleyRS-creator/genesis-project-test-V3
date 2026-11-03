package com.example.testv5rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.testv5rest.models.VSynthetiseGlobal;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface VSynthetiseGlobalRepository extends JpaRepository<VSynthetiseGlobal, Integer>, JpaSpecificationExecutor<VSynthetiseGlobal> {

}
