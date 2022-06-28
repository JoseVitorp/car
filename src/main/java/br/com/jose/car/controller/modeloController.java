package br.com.jose.car.controller;

import br.com.jose.car.model.modeloModel;
import br.com.jose.car.service.modeloServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/modelo")
public class modeloController {

    @Autowired
    private modeloServices services;

    @GetMapping
    public List<modeloModel> findAll(){
        return services.findAll();
    }

    @GetMapping("/{id}")
    public modeloModel findById(@PathVariable("id") long id) throws Exception{
        return services.findById(id);
    }

    @PostMapping
    public modeloModel save(@RequestBody modeloModel modelo){
        return services.save(modelo);
    }

    @PutMapping
    public modeloModel update(@RequestBody modeloModel modelo) throws Exception{
        return services.update(modelo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) throws Exception{
        services.delete(id);
        return ResponseEntity.ok().build();
    }

}
