package com.covid.covid.repositories;

import com.covid.covid.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepo extends JpaRepository<Product,Long> {
    //Product findUtilisateurByLogin(String login);

    //Product findUtilisateurByLoginAndPassword(String login, String password);
}
