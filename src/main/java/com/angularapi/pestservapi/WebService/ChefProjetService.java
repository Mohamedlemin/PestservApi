package com.angularapi.pestservapi.WebService;

import com.angularapi.pestservapi.Exception.notFoundException;
import com.angularapi.pestservapi.Repository.ChefProjetRepository;
import com.angularapi.pestservapi.entities.ChefProjet;
import com.angularapi.pestservapi.entities.GService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ChefProjetService {
    private final ChefProjetRepository chefProjetReposiotory;
    @Autowired
    public ChefProjetService(ChefProjetRepository chefProjetReposiotory) {
        this.chefProjetReposiotory = chefProjetReposiotory;
    }


    //add
    public ChefProjet addChefProjet(ChefProjet chefProjet){
        return  chefProjetReposiotory.save(chefProjet);
    }
    //list
    public List<ChefProjet> FindAllChefProjet(){
        return chefProjetReposiotory.findAll();
    }
    //List by service
    public List<ChefProjet> FindAllChefProjetByService(GService gService){
        return chefProjetReposiotory.ChefProjetParS(gService);
    }
    //find by Id
    public ChefProjet getChefProjetById(Long id){
        return chefProjetReposiotory.findChefProjetById(id).orElseThrow(()-> new notFoundException("Chef de projet not fund"));
    }
    //update
    public ChefProjet updateChefProjet(ChefProjet chefProjet){
        return chefProjetReposiotory.save(chefProjet);
    }
    //delete
    public void deleteChefProjet(Long id){
        chefProjetReposiotory.deleteChefProjetById(id);
    }
}
