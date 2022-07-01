package com.pep3.producto.service;

//import java.util.HashMap;
import java.util.List;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;//##
//import org.springframework.web.client.RestTemplate;
import com.pep3.producto.entity.Producto;
//import com.pep3.producto.feignclients.CalcularNuevosPreciosFeignClient;
//import com.pep3.producto.model.CalcularNuevosPrecios;
import com.pep3.producto.repository.ProductoRepository;//##


@Service
public class ProductoService{
	
	@Autowired
	private ProductoRepository productoRepository;
	
	
	//@Autowired
	//RestTemplate restTemplate;
	
	//@Autowired
	//CalcularNuevosPreciosFeignClient calcularNuevosPreciosFeignClient;
	
	
	public List<Producto> getAllProducto(){
		return productoRepository.findAll();
	}
	
	public Producto getProductoById(int id) {
		return productoRepository.findById(id).orElse(null);
	}

	public Producto save(Producto producto) {
		Producto productoNew = productoRepository.save(producto);
		return productoNew;
	}
	
	//#AUN no de aca para abajo#
	/*
	
	public List<CalcularNuevosPrecios> getCalcularNuevosPrecios(int productoId){
		List<CalcularNuevosPrecios> calcularNuevosPreciosList = restTemplate.getForObject("http://calcularNuevosPrecios-service/calcularNuevosPrecios/byproducto/" + productoId, List.class);
		return calcularNuevosPreciosList;
	}
	
	public CalcularNuevosPrecios saveCalcularNuevosPrecios(int productoId, CalcularNuevosPrecios calcularNuevosPrecios) {
		calcularNuevosPrecios.setProductoId(productoId);
		CalcularNuevosPrecios calcularNuevosPreciosNew = calcularNuevosPreciosFeignClient.save(calcularNuevosPrecios);
		return calcularNuevosPreciosNew;
	}
	
	public Map<String , Object> getProductoAndPrecios(int productoId){
		Map<String, Object> result = new HashMap<>();
		Producto producto = productoRepository.findById(productoId).orElse(null);
		if(producto == null){
			result.put("Mensaje", "no existe el producto");
			return result;
		}
		result.put("Producto", producto);
		List<CalcularNuevosPrecios> calcularNuevosPrecios = calcularNuevosPreciosFeignClient.getCalcularNuevosPrecios(productoId);
		if(calcularNuevosPrecios.isEmpty())
			result.put("CalcularNuevosPrecios", "Ese producto no tiene precios");
		else
			result.put("CalcularNuevosPrecios", calcularNuevosPrecios);
		return result;
	}
	*/

	
}
