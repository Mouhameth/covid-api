package com.covid.covid;

import com.covid.covid.controllers.UtilisateurRestJaxRSApi;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public ResourceConfig resourceConfig(){
        ResourceConfig jersey = new ResourceConfig();
        jersey.register(UtilisateurRestJaxRSApi.class);
        return jersey;
    }

}
