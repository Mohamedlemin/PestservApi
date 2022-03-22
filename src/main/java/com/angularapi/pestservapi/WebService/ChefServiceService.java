package com.angularapi.pestservapi.WebService;

import com.angularapi.pestservapi.Exception.notFoundException;
import com.angularapi.pestservapi.Repository.ChefServiceRepository;
import com.angularapi.pestservapi.entities.ChefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ChefServiceService {
    private final ChefServiceRepository chefServiceRepository;
    @Autowired
    public ChefServiceService(ChefServiceRepository chefServiceRepository) {
        this.chefServiceRepository = chefServiceRepository;
    }
    //add
    public ChefService addChefService(ChefService chefService){
        return  chefServiceRepository.save(chefService);
    }
    //list
    public List<ChefService> FindAllChefService(){
        return chefServiceRepository.findAll();
    }
    //find by Id
    public ChefService getChefServiceById(Long id){
        return chefServiceRepository.findChefServiceById(id).orElseThrow(()-> new notFoundException("Chef service not fund"));
    }
    //update
    public ChefService updateChefService(ChefService chefService){
        return chefServiceRepository.save(chefService);
    }
    //delete
    public void deleteChefService(Long id){
        chefServiceRepository.deleteChefServiceById(id);
    }
}
