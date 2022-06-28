package br.com.jose.car.repository;

import br.com.jose.car.model.modeloModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface modeloRepository extends JpaRepository<modeloModel, Long> {

}
