package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Service;

import java.util.List;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Encabezado;

public interface IEncabezadoService {
    public List<Encabezado> findAll();

    public void save(Encabezado encabezado);

    public Encabezado findOne(Long id);

    public void delete(Long id);
}
