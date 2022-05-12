package com.covid.covid.repositories;

import com.covid.covid.entities.Rv;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RvRepo extends JpaRepository<Rv,Long> {
    List<Rv> getRvByIdUser(Long id);
}
