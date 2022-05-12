package com.covid.covid.repositories;

import com.covid.covid.entities.Admins;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminsRepo extends JpaRepository<Admins,Long> {

}
