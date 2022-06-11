package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Service;

import java.util.List;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Detalle;

public interface IDetalleService {
    public List<Detalle> findAll();

    public void save (Detalle detalle);

    public Detalle findOne(Long id);

    public void delete(Long id);
}
