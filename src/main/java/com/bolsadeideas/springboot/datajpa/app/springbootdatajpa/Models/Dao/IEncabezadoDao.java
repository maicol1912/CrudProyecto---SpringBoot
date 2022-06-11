package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao;

import java.util.List;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Encabezado;

public interface IEncabezadoDao {
    
    public List<Encabezado> findAll();

    public void save(Encabezado encabezado);

    public Encabezado findOne(Long id);

    public void delete(Long id);
}
