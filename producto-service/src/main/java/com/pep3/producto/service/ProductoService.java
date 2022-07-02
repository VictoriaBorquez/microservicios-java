package com.pep3.producto.service;

//import java.util.HashMap;
import java.util.List;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pep3.producto.entity.Producto;
import com.pep3.producto.repository.ProductoRepository;


@Service
public class ProductoService{
	
	@Autowired
	private ProductoRepository productoRepository;
	
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
}
