package com.pep3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pep3.entity.CalcularNuevosPrecios;
import com.pep3.service.CalcularNuevosPreciosService;


@RestController
@RequestMapping("/calcularNuevosPrecios")
public class CalcularNuevosPreciosController {
	@Autowired
	CalcularNuevosPreciosService calcularNuevosPreciosService;
	
	@GetMapping
	public ResponseEntity<List<CalcularNuevosPrecios>> getAll(){
		List<CalcularNuevosPrecios> calcularNuevosPreciosList = calcularNuevosPreciosService.getAll();
		if(calcularNuevosPreciosList.isEmpty())
			return ResponseEntity.noContent().build();
		return ResponseEntity.ok(calcularNuevosPreciosList);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CalcularNuevosPrecios> getById(@PathVariable("id") int id){
		CalcularNuevosPrecios calcularNuevosPrecios = calcularNuevosPreciosService.getCalcularNuevosPreciosById(id);
		if(calcularNuevosPrecios == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(calcularNuevosPrecios);
	}
	
	@PostMapping()
	public ResponseEntity<CalcularNuevosPrecios> save(@RequestBody CalcularNuevosPrecios calcularNuevosPrecios){
		CalcularNuevosPrecios calcularNuevosPreciosNew = calcularNuevosPreciosService.save(calcularNuevosPrecios);
		return ResponseEntity.ok(calcularNuevosPreciosNew);
	}
	
	@GetMapping("/byproducto/{productoId}")
	public ResponseEntity<List<CalcularNuevosPrecios>> getByProductoId(@PathVariable("productoId") int productoId){
		List<CalcularNuevosPrecios> calcularNuevosPreciosList = calcularNuevosPreciosService.byProductoId(productoId);
		return ResponseEntity.ok(calcularNuevosPreciosList);
	}

}
