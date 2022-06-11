package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao.IEncabezadoDao;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Encabezado;

@Service
public class EncabezadoServiceImp implements IEncabezadoService{
    @Autowired
    private IEncabezadoDao encabezadoDao;
   
    @Transactional(readOnly = true)
    @Override
    public List<Encabezado> findAll(){
        return encabezadoDao.findAll();
    }

    @Transactional
    @Override
    public void save(Encabezado encabezado){
        encabezadoDao.save(encabezado);
    }

    @Transactional(readOnly = true)
    @Override
    public Encabezado findOne(Long id){
        return encabezadoDao.findOne(id);
    }


    @Transactional
    @Override
    public void delete(Long id){
        encabezadoDao.delete(id);
    }
}
