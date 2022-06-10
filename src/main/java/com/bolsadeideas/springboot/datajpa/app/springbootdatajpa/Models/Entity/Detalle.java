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
@Table(name="detalle")
public class Detalle implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_producto")
	private Long idProducto;


	@NotNull
	@Column(name="descuento_detalle")
	private Double DescuentoDetalle;

	@NotNull
	@Column(name="cantidad_detalle")
	private int cantidadDetalle;

	@NotNull
	@Column(name="valor_detalle")
    private Double valor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdProducto(Producto producto) {
		return producto.getId();
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public Double getDescuentoDetalle() {
		return DescuentoDetalle;
	}

	public void setDescuentoDetalle(Double descuentoDetalle) {
		DescuentoDetalle = descuentoDetalle;
	}

	public int getCantidadDetalle() {
		return cantidadDetalle;
	}

	public void setCantidadDetalle(int cantidadDetalle) {
		this.cantidadDetalle = cantidadDetalle;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	

}
