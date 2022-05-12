package com.covid.covid.controllers;

import com.covid.covid.entities.Admins;
import com.covid.covid.entities.Rv;
import com.covid.covid.entities.Structure;
import com.covid.covid.entities.Product;
import com.covid.covid.repositories.AdminsRepo;
import com.covid.covid.repositories.RvRepo;
import com.covid.covid.repositories.StructureRepo;
import com.covid.covid.repositories.UtilisateurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component// permet de ressoudre le problème de l'injection de dépendance
@Path("/products")
public class UtilisateurRestJaxRSApi {

    @Autowired
    private UtilisateurRepo utilisateurRepo;
    @Autowired
    private AdminsRepo adminsRepo;
    @Autowired
    private StructureRepo structureRepo;
    @Autowired
    private RvRepo rvRepo;
    @Path("/all")
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Product> getUsers(){
      return utilisateurRepo.findAll();
    }

    /*@Path("/user/{login}")
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Product getUser(@PathParam("login") String login){
        return utilisateurRepo.findUtilisateurByLogin(login);
    }
    */
    @Path("/add")
    @POST
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Product addUser(Product utilisateur){
        return utilisateurRepo.save(utilisateur);
    }

    @Path("/updateUser")
    @PUT
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Product updateUser(Product utilisateur){
        return utilisateurRepo.save(utilisateur);
    }

    @Path("/deleteUser/{id}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public void deleteUser(@PathParam("id") Long id){
        utilisateurRepo.deleteById(id);
    }
    /*
    @Path("/login/{login}/{password}")
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Product getUserByLoginANDPassword(@PathParam("login") String login, @PathParam("password") String password){
        return utilisateurRepo.findUtilisateurByLoginAndPassword(login,password);
    }
    */
    @Path("/addAdmin")
    @POST
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Admins add(Admins admins){
        return adminsRepo.save(admins);
    }

    @Path("/admins")
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Admins> getAdmins(){
        return adminsRepo.findAll();
    }

    @Path("/admin/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Admins getAdmin(@PathParam("id") Long id){
        return adminsRepo.getById(id);
    }

    @Path("/updateAdmin")
    @PUT
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Admins update(Admins admins){
        return adminsRepo.save(admins);
    }

    @Path("/deleteAdmin/{id}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public void delete(@PathParam("id") Long id){
        adminsRepo.deleteById(id);
    }

    @Path("/addStructure")
    @POST
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Structure add(Structure structure){
        return structureRepo.save(structure);
    }

    @Path("/structures")
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Structure> getStructures(){
        return structureRepo.findAll();
    }

    @Path("/structure/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Structure getStructure(@PathParam("id") Long id){
       return structureRepo.getById(id);
    }

    @Path("/updateStructure")
    @PUT
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Structure update(Structure structure){
        return structureRepo.save(structure);
    }

    @Path("/deleteStructure/{id}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public void deleteStructure(@PathParam("id") Long id){
        structureRepo.deleteById(id);
    }

    @Path("/structureNom/{nom}")
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Structure getStructureByNom(@PathParam("nom") String nom){
        return structureRepo.getStructureByNom(nom);
    }

    @Path("/addRv")
    @POST
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Rv add(Rv rv){
        return rvRepo.save(rv);
    }

    @Path("/allrvs")
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Rv> getRvs(){
        return rvRepo.findAll();
    }

    @Path("/rv/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Rv getRv(@PathParam("id") Long id){
        return rvRepo.getById(id);
    }

    @Path("/updateRv")
    @PUT
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Rv update(Rv rv){
        return rvRepo.save(rv);
    }

    @Path("/deleteRv/{id}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public void deleteRv(@PathParam("id") Long id){
        rvRepo.deleteById(id);
    }

    @Path("/rvs/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Rv> getUserRv(@PathParam("id") Long id){
        return rvRepo.getRvByIdUser(id);
    }


}
