package br.com.jose.car.service;

import br.com.jose.car.model.modeloModel;
import br.com.jose.car.repository.modeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class modeloServices {

    @Autowired
    modeloRepository repository;
    public modeloModel save(modeloModel modelo){
        return repository.save(modelo);
    }

    public modeloModel findById(long id) throws Exception{
        return repository.findById(id).orElseThrow(() -> new Exception("Not Found"));
    }

    public modeloModel update(modeloModel marca) throws Exception{
        modeloModel found = repository.findById(marca.getId()).orElseThrow(() -> new Exception("Not Found"));
        found.setNome(marca.getNome());
        found.setAno(marca.getAno());
        return repository.save(found);
    }

    public List<modeloModel> findAll(){
        return repository.findAll();
    }

    public void delete(Long id) throws Exception{
        modeloModel found = repository.findById(id).orElseThrow( () -> new Exception("Not Found!"));
        repository.delete(found);
    }

}
