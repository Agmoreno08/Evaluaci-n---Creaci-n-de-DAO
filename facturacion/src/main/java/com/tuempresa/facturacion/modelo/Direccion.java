package com.tuempresa.facturacion.modelo;

import javax.persistence.*;

import lombok.*;

@Embeddable
@Getter
@Setter
public class Direccion {
	
	@Column(length=100)
	String viaPublica;
	
	
	@Column(length=50)
	int codigoPostal;
	
	@Column(length=50)
	String municipio;
	
	@Column(length=50)
	String provincia;
	
	
	

}
