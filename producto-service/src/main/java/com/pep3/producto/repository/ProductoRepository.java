package com.pep3.producto.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pep3.producto.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
	//List<Producto> findByProductoId(int productoId);
}
