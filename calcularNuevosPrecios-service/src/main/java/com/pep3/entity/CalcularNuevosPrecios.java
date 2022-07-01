package com.pep3.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CalcularNuevosPrecios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	//private int precioDolar;
	//private int precioEuro;
	//private int productoId;
}
