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
@Table(name ="encabezados")
public class Encabezado implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;


    @Column(name="id_cliente")
    private Long idCliente;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="fecha_creacion_pedido")
    private Date fechaCreacionPedido;

    @NotEmpty
    @Column(name="celular_destino_pedido")
    private String celularDestinoPedido;

    @NotEmpty
    @Column(name="direccion_destino_pedido")
    private String direccionDestinoPedido;

    @NotEmpty
    @Column(name="nombre_destino_pedido")
    private String nombreDestinoPedido;

    @NotNull
    @Column(name="subtotal_pedido")
    private Double subtotalPedido;
    
    @NotNull
    @Column(name="total_pedido")
    private Double totalPedido;

    @NotNull
    @Column(name="descuento_pedido")
    private Double descuentoPedido;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="fecha_entrega_pedido")
    private Date fechaEntregaPedido;

    @NotEmpty
    @Column(name="estado_pedido")
    private String estadoPedido;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long id) {
        this.idCliente = getId();
    }

    public Date getFechaCreacionPedido() {
        return fechaCreacionPedido;
    }

    public void setFechaCreacionPedido(Date fechaCreacionPedido) {
        this.fechaCreacionPedido = fechaCreacionPedido;
    }

    public String getCelularDestinoPedido() {
        return celularDestinoPedido;
    }

    public void setCelularDestinoPedido(String celularDestinoPedido) {
        this.celularDestinoPedido = celularDestinoPedido;
    }

    public String getDireccionDestinoPedido() {
        return direccionDestinoPedido;
    }

    public void setDireccionDestinoPedido(String direccionDestinoPedido) {
        this.direccionDestinoPedido = direccionDestinoPedido;
    }

    public String getNombreDestinoPedido() {
        return nombreDestinoPedido;
    }

    public void setNombreDestinoPedido(String nombreDestinoPedido) {
        this.nombreDestinoPedido = nombreDestinoPedido;
    }

    public Double getSubtotalPedido() {
        return subtotalPedido;
    }

    public void setSubtotalPedido(Double subtotalPedido) {
        this.subtotalPedido = subtotalPedido;
    }

    public Double getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(Double totalPedido) {
        this.totalPedido = totalPedido;
    }

    public Double getDescuentoPedido() {
        return descuentoPedido;
    }

    public void setDescuentoPedido(Double descuentoPedido) {
        this.descuentoPedido = descuentoPedido;
    }

    public Date getFechaEntregaPedido() {
        return fechaEntregaPedido;
    }

    public void setFechaEntregaPedido(Date fechaEntregaPedido) {
        this.fechaEntregaPedido = fechaEntregaPedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estado) {
        this.estadoPedido = estado;
    }

}
