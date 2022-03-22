package com.angularapi.pestservapi.Resource;

import com.angularapi.pestservapi.WebService.ChefProjetService;
import com.angularapi.pestservapi.entities.ChefProjet;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ChefProjet")
public class ChefProjetResource {
    private final ChefProjetService chefProjetService;

    public ChefProjetResource(ChefProjetService chefProjetService) {
        this.chefProjetService = chefProjetService;
    }
    @GetMapping("/All")
    public ResponseEntity<List<ChefProjet>> getAllChefProjet(){
        List<ChefProjet> ChefProjet =chefProjetService.FindAllChefProjet();
        return new ResponseEntity<>(ChefProjet, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<ChefProjet> getChefProjetById(@PathVariable("id") Long id){
        ChefProjet chefProjet =chefProjetService.getChefProjetById(id);
        return new ResponseEntity<>(chefProjet, HttpStatus.OK);
    }
//    @GetMapping("/findByS/")
//    public ResponseEntity<ChefProjet> getChefProjetByService(@RequestBody GService gService){
//        ChefProjet chefProjets = (ChefProjet) chefProjetService.FindAllChefProjetByService(gService);
//        return new ResponseEntity<>(chefProjets, HttpStatus.OK);
//    }
    @PostMapping("/add")
    public ResponseEntity<ChefProjet> addChefProjet(@RequestBody ChefProjet chefProjet){
        ChefProjet newchefProjet =chefProjetService.addChefProjet(chefProjet);
        return new ResponseEntity<>(newchefProjet, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<ChefProjet> updateChefProjet(@RequestBody ChefProjet chefProjet){
        ChefProjet updatechefProjet =chefProjetService.updateChefProjet(chefProjet);
        return new ResponseEntity<>(updatechefProjet, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> DeleteChefProjet(@PathVariable("id") Long id){
        chefProjetService.deleteChefProjet(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }
}
