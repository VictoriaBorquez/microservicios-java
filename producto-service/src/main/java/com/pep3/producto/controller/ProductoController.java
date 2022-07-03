package com.pep3.producto.controller;

import java.util.List;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pep3.producto.entity.Producto;
import com.pep3.producto.service.ProductoService;
//import com.pep3.producto.model.CalcularNuevosPrecios;

@RestController
@RequestMapping("/producto")
@CrossOrigin("*")
public class ProductoController {
	
	@Autowired
	ProductoService productoService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Producto>> getAllProducto(){
		List<Producto> productos = productoService.getAllProducto();
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
	


}
