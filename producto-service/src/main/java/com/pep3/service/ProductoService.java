package com.pep3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;

import com.pep3.entity.Producto;
import com.pep3.repository.ProductoRepository;

@Service
public class ProductoService {
	@Autowired
	ProductoRepository productoRepository;
	
	//@Autowired
	//RestTemplate restTemplate;
	
	//@Autowired
	//ProductoFeignClient productoFeignClient;
	
	
	public List<Producto> getAll(){
		return productoRepository.findAll();
	}
	
	public Producto getProductoById(int id) {
		return productoRepository.findById(id).orElse(null);
	}

	public Producto save(Producto producto) {
		Producto productoNew = productoRepository.save(producto);
		return productoNew;
	}
	
	/*
	public Producto saveProduct(int productoId, Producto producto) {
		producto.setProductoId(productoId);
		Producto productNew = productoFeignClient.save(producto);
		return productNew;
	}
	*/
	
}
