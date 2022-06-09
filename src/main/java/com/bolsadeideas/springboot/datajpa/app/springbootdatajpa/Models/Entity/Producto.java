package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "productos")
public class Producto implements Serializable{
    
    private static final long serialVersionUID =1L;
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @NotEmpty
    @Column(name="nombre_producto")
    private String nombreProducto;

    
    @NotNull
    @Column(name="cantidad_producto")
    private int cantidadProducto;

    @NotNull
    @Column(name="precio_producto")
    private int precioProducto;
    
    @NotNull
    @Column(name="precio_producto_compra")
    private int precioProductoCompra;


    @Column(name = "create_producto")
    @Temporal(TemporalType.DATE)

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createProducto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Date getCreateProducto() {
        return createProducto;
    }

    public void setCreateProducto(Date createProducto) {
        this.createProducto = createProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

	public int getPrecioProductoCompra() {
		return precioProductoCompra;
	}

	public void setPrecioProductoCompra(int precioProductoCompra) {
		this.precioProductoCompra = precioProductoCompra;
	}
    
   

}
