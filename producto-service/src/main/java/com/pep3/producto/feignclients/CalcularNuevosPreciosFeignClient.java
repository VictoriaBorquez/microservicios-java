/*
package com.pep3.producto.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pep3.producto.model.CalcularNuevosPrecios;


@FeignClient(name = "calcularNuevosPrecios-service")
@RequestMapping("/calcularNuevosPrecios")
public interface CalcularNuevosPreciosFeignClient {
	@PostMapping()
	CalcularNuevosPrecios save(@RequestBody CalcularNuevosPrecios calcularNuevosPrecios);
	
	@GetMapping("/byproducto/{productoId}")
	List<CalcularNuevosPrecios> getCalcularNuevosPrecios(@PathVariable("productoId") int productoId);
}
*/