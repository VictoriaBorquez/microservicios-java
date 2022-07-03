package com.pep3.calcularNuevosPrecios.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.pep3.calcularNuevosPrecios.Model.Producto;
import com.pep3.calcularNuevosPrecios.service.CalcularNuevosPreciosService;



@RestController
@RequestMapping("/calcularNuevosPrecios")
@CrossOrigin("*")
public class CalcularNuevosPreciosController {
	

	@Autowired
	CalcularNuevosPreciosService calcularNuevosPreciosService;
	
	@Autowired
	RestTemplate restTemplate;
	
	
	@GetMapping("/listar") 
	public List<Producto> getProductos() {
		Producto[] productos = restTemplate.getForObject("http://localhost:8080/producto/all", Producto[].class);
		List<Producto> listaProductos = Arrays.asList(productos);
		for(int i = 0; i < listaProductos.size();i++) {
			Producto p = listaProductos.get(i);
			p.setPrecio_dolar(p.getPrecio_peso()/937);
			p.setPrecio_euro(p.getPrecio_peso()/976);
		}
		
		return listaProductos;
	}
}

