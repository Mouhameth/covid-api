package com.covid.covid.repositories;

import com.covid.covid.entities.Structure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StructureRepo extends JpaRepository<Structure,Long> {
    Structure getStructureByNom(String nom);
}
