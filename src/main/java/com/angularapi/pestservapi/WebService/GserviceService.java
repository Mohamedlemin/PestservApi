package com.angularapi.pestservapi.WebService;

import com.angularapi.pestservapi.Exception.notFoundException;
import com.angularapi.pestservapi.Repository.ServiceRepository;
import com.angularapi.pestservapi.entities.GService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class GserviceService {
    private final ServiceRepository serviceReposiotory;
    @Autowired
    public GserviceService(ServiceRepository serviceReposiotory) {
        this.serviceReposiotory = serviceReposiotory;
    }

    public GService addService(GService gservice){
        return  serviceReposiotory.save(gservice);
    }

    public List<GService> FindAllService(){
        return serviceReposiotory.findAll();
    }

    public GService getServiceById(Long id){
        return serviceReposiotory.findGServiceById(id).orElseThrow(()-> new notFoundException("service not fund"));
    }

    public GService updateService(GService gservice){
        return serviceReposiotory.save(gservice);
    }

    public void deleteService(Long id){
        serviceReposiotory.deleteGServiceById(id);
    }
}
