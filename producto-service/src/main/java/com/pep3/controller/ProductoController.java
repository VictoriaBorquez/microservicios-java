package com.pep3.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pep3.entity.Producto;
import com.pep3.service.ProductoService;

import model.CalcularNuevosPrecios;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	@Autowired
	ProductoService productoService;
	
	@GetMapping
	public ResponseEntity<List<Producto>> getAll(){
		List<Producto> productos = productoService.getAll();
		if(productos.isEmpty())
			return ResponseEntity.noContent().build();
		return ResponseEntity.ok(productos);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Producto> getById(@PathVariable("id") int id){
		Producto producto = productoService.getProductoById(id);
		if(producto == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(producto);
	}
	
	@PostMapping()
	public ResponseEntity<Producto> save(@RequestBody Producto producto){
		Producto productoNew = productoService.save(producto);
		return ResponseEntity.ok(productoNew);
	}
	
	@GetMapping("/calcularNuevosPrecios/{productoId}")
	public ResponseEntity<List<CalcularNuevosPrecios>> getCalcularNuevosPrecios(@PathVariable("productoId") int productoId){
		Producto producto = productoService.getProductoById(productoId);
		if(producto == null)
			return ResponseEntity.notFound().build();
		List<CalcularNuevosPrecios> calcularNuevosPrecios = productoService.getCalcularNuevosPrecios(productoId);
		return ResponseEntity.ok(calcularNuevosPrecios);
	}
	
	@PostMapping("/savecalcularNuevosPrecios/{productoId}")
	public ResponseEntity<CalcularNuevosPrecios> saveCalcularNuevosPrecios(@PathVariable("productoId") int productoId, @RequestBody CalcularNuevosPrecios calcularNuevosPrecios){
		if(productoService.getProductoById(productoId) == null)
			return ResponseEntity.notFound().build();
		CalcularNuevosPrecios calcularNuevosPreciosNew = productoService.saveCalcularNuevosPrecios(productoId, calcularNuevosPrecios);
		return ResponseEntity.ok(calcularNuevosPrecios);
	}
	
	@GetMapping("/getAll/{productoId}")
	public ResponseEntity<Map<String, Object>> getAllPrecios(@PathVariable("productoId") int productoId){
		Map<String, Object> result = productoService.getProductoAndPrecios(productoId);
		return ResponseEntity.ok(result);
	}
}
