package com.angularapi.pestservapi.WebService;

import com.angularapi.pestservapi.Exception.notFoundException;
import com.angularapi.pestservapi.Repository.AccueilleurRepo;
import com.angularapi.pestservapi.entities.Accueilleur;
import com.angularapi.pestservapi.entities.GService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AcceilleurService {
    private final AccueilleurRepo accueilleurRepo;
    @Autowired
    public AcceilleurService(AccueilleurRepo accueilleurRepo) {
        this.accueilleurRepo = accueilleurRepo;
    }

    public Accueilleur addAccueilleur(Accueilleur accueilleur){
        return  accueilleurRepo.save(accueilleur);
    }

    public List<Accueilleur> FindAllAccueilleur(){
        return accueilleurRepo.findAll();
    }

    public Accueilleur getAccueilleurById(Long id){
        return accueilleurRepo.findAccueilleurById(id).orElseThrow(()-> new notFoundException("Accueilleur not fund"));
    }

    public Accueilleur updateAccueilleur(Accueilleur accueilleur){
        return accueilleurRepo.save(accueilleur);
    }

    public void deleteAccueilleur(Long id){
        accueilleurRepo.deleteAccueilleurById(id);
    }
}
