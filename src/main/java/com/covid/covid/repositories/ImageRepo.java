package com.covid.covid.repositories;

import com.covid.covid.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepo extends JpaRepository<Product, Long> {
}
