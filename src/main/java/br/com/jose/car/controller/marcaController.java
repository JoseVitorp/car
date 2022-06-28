package br.com.jose.car.controller;

import br.com.jose.car.model.marcaModel;
import br.com.jose.car.service.marcaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/marca")
public class marcaController {

    @Autowired
    private marcaServices services;

    @GetMapping
    public List<marcaModel> findAll(){
        return services.findAll();
    }

    @GetMapping("/{id}")
    public marcaModel findById(@PathVariable("id") long id) throws Exception{
        return services.findById(id);
    }

    @PostMapping
    public marcaModel save(@RequestBody marcaModel marca){
        return services.save(marca);
    }

    @PutMapping
    public marcaModel update(@RequestBody marcaModel marca) throws Exception{
        return services.update(marca);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) throws Exception{
        services.delete(id);
        return ResponseEntity.ok().build();
    }

}
