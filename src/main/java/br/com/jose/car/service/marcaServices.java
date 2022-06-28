package br.com.jose.car.service;

import br.com.jose.car.model.marcaModel;
import br.com.jose.car.repository.marcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class marcaServices {

    @Autowired
    marcaRepository repository;
    public marcaModel save(marcaModel marca){
        return repository.save(marca);
    }

    public marcaModel findById(long id) throws Exception{
        return repository.findById(id).orElseThrow(() -> new Exception("Not Found"));
    }

    public marcaModel update(marcaModel marca) throws Exception{
        marcaModel found = repository.findById(marca.getId()).orElseThrow(() -> new Exception("Not Found"));
        found.setNome(marca.getNome());
        found.setPais(marca.getPais());
        return repository.save(found);
    }

    public List<marcaModel> findAll(){
        return repository.findAll();
    }

    public void delete(Long id) throws Exception{
        marcaModel found = repository.findById(id).orElseThrow( () -> new Exception("Not Found!"));
        repository.delete(found);
    }

}

