package com.pep3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pep3.entity.CalcularNuevosPrecios;
import com.pep3.repository.CalcularNuevosPreciosRepository;

@Service
public class CalcularNuevosPreciosService {
	@Autowired
	CalcularNuevosPreciosRepository calcularNuevosPreciosRepository;
	
	public List<CalcularNuevosPrecios> getAll(){
		return calcularNuevosPreciosRepository.findAll();
	}
	
	public CalcularNuevosPrecios getCalcularNuevosPreciosById(int id) {
		return calcularNuevosPreciosRepository.findById(id).orElse(null);
	}

	public CalcularNuevosPrecios save(CalcularNuevosPrecios calcularNuevosPrecios) {
		CalcularNuevosPrecios calcularNuevosPreciosNew = calcularNuevosPreciosRepository.save(calcularNuevosPrecios);
		return calcularNuevosPreciosNew;
	}
	
	public List<CalcularNuevosPrecios> byProductoId(int productoId){
		return calcularNuevosPreciosRepository.findByProductoId(productoId);
	}


}
