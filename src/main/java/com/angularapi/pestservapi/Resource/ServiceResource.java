package com.angularapi.pestservapi.Resource;

import com.angularapi.pestservapi.WebService.GserviceService;
import com.angularapi.pestservapi.entities.GService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Service")

public class ServiceResource {
    private final GserviceService gserviceService;

    public ServiceResource(GserviceService gserviceService) {
        this.gserviceService = gserviceService;
    }
    @GetMapping("/All")
    public ResponseEntity<List<GService>> getAllService(){
        List<GService> services =gserviceService.FindAllService();
        return new ResponseEntity<>(services, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<GService> getServiceById(@PathVariable("id") Long id){
        GService service =gserviceService.getServiceById(id);
        return new ResponseEntity<>(service, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<GService> addService(@RequestBody GService gService){
        GService newService =gserviceService.addService(gService);
        return new ResponseEntity<>(newService, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<GService> updateService(@RequestBody GService gService){
        GService updateService =gserviceService.updateService(gService);
        return new ResponseEntity<>(updateService, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> DeleteService(@PathVariable("id") Long id){
        gserviceService.deleteService(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }

}
