package com.pep3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pep3.entity.CalcularNuevosPrecios;

@Repository
public interface CalcularNuevosPreciosRepository extends JpaRepository<CalcularNuevosPrecios, Integer>{
	List<CalcularNuevosPrecios> findByProductoId(int productoId);
}
