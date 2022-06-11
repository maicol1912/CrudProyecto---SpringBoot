package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao.IDetalleDao;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Detalle;

@Service
public class DetalleServiceImp implements IDetalleService{
    
    @Autowired
    private IDetalleDao detalleDao;

    @Transactional(readOnly = true)
    @Override
    public List<Detalle> findAll(){
        return detalleDao.findAll();
    }

    @Transactional
    @Override
    public void save(Detalle detalle){
        detalleDao.save(detalle);
    }

    @Transactional(readOnly = true)
    @Override
    public Detalle findOne(Long id){
        return detalleDao.findOne(id);
    }

    @Transactional
    @Override
    public void delete(Long id){
        detalleDao.delete(id);
    }
}
