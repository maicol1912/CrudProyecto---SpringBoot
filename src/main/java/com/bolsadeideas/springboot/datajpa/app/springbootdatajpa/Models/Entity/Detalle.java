package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="detalles")
public class Detalle implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	
    
	@Column(name="id_producto")
	private Long idProducto;


	@NotNull
	@Column(name="descuento_detalle")
	private Double descuentoDetalle;

	@NotNull
	@Column(name="cantidad_detalle")
	private int cantidadDetalle;

	@NotNull
	@Column(name="valor_detalle")
    private Double valorDetalle;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Producto producto) {
		this.idProducto = getId();
	}

	public Double getDescuentoDetalle() {
		return descuentoDetalle;
	}

	public void setDescuentoDetalle(Double descuentoDetalle) {
		this.descuentoDetalle = descuentoDetalle;
	}

	public int getCantidadDetalle() {
		return cantidadDetalle;
	}

	public void setCantidadDetalle(int cantidadDetalle) {
		this.cantidadDetalle = cantidadDetalle;
	}

	public Double getValorDetalle() {
		return valorDetalle;
	}

	public void setValorDetalle(Double valor) {
		this.valorDetalle = valor;
	}
	
	

}
