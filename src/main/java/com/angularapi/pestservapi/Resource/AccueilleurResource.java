package com.angularapi.pestservapi.Resource;

import com.angularapi.pestservapi.WebService.AcceilleurService;
import com.angularapi.pestservapi.entities.Accueilleur;
import com.angularapi.pestservapi.entities.GService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Accueilleur")
public class AccueilleurResource {
    private final AcceilleurService acceilleurService;

    public AccueilleurResource(AcceilleurService acceilleurService) {
        this.acceilleurService = acceilleurService;
    }

    @GetMapping("/All")
    public ResponseEntity<List<Accueilleur>> getAllAccueilleur(){
        List<Accueilleur> Accueilleurs =acceilleurService.FindAllAccueilleur();
        return new ResponseEntity<>(Accueilleurs, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Accueilleur> getAccueilleurById(@PathVariable("id") Long id){
        Accueilleur accueilleurs =acceilleurService.getAccueilleurById(id);
        return new ResponseEntity<>(accueilleurs, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Accueilleur> addAccueilleur(@RequestBody Accueilleur accueilleur){
        Accueilleur newAccueilleur =acceilleurService.addAccueilleur(accueilleur);
        return new ResponseEntity<>(newAccueilleur, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Accueilleur> updateAccueilleur(@RequestBody Accueilleur accueilleur){
        Accueilleur updateAccueilleur =acceilleurService.updateAccueilleur(accueilleur);
        return new ResponseEntity<>(updateAccueilleur, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> DeleteService(@PathVariable("id") Long id){
        acceilleurService.deleteAccueilleur(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }
}
