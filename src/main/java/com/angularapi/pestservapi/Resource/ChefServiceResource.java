package com.angularapi.pestservapi.Resource;

import com.angularapi.pestservapi.WebService.ChefServiceService;
import com.angularapi.pestservapi.entities.ChefService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ChefService")
public class ChefServiceResource {
    private final ChefServiceService chefServiceService;

    public ChefServiceResource(ChefServiceService chefServiceService) {
        this.chefServiceService = chefServiceService;
    }


    @GetMapping("/All")
    public ResponseEntity<List<ChefService>> getAllChefService(){
        List<ChefService> Chefservices =chefServiceService.FindAllChefService();
        return new ResponseEntity<>(Chefservices, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<ChefService> getChefServiceById(@PathVariable("id") Long id){
        ChefService chefservice =chefServiceService.getChefServiceById(id);
        return new ResponseEntity<>(chefservice, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<ChefService> addService(@RequestBody ChefService chefService){
        ChefService newChefServices =chefServiceService.addChefService(chefService);
        return new ResponseEntity<>(newChefServices, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<ChefService> updateService(@RequestBody ChefService chefService){
        ChefService newChefServices =chefServiceService.updateChefService(chefService);
        return new ResponseEntity<>(newChefServices, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> DeleteService(@PathVariable("id") Long id){
        chefServiceService.deleteChefService(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }
}
