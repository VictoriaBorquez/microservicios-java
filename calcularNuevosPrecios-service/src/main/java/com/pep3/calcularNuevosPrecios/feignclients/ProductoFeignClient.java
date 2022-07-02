package com.pep3.calcularNuevosPrecios.feignclients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.pep3.calcularNuevosPrecios.Model.Producto;

@FeignClient(name = "producto-service", path = "/producto")
//@RequestMapping("/producto")
public interface ProductoFeignClient {
	
	@PostMapping()
	Producto save(@RequestBody Producto producto);
	
}
