package br.com.jose.car.repository;

import br.com.jose.car.model.marcaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface marcaRepository extends JpaRepository<marcaModel, Long> {

}
