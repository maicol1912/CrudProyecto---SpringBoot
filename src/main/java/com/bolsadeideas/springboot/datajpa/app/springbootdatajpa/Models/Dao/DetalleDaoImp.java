package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Detalle;

@Repository("DetalleDaoJPA")
public class DetalleDaoImp implements IDetalleDao{
    
    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    @Override
    public List<Detalle> findAll(){

        return em.createQuery("from Detalle").getResultList();
    }

    @Override
    @Transactional
    public void save(Detalle detalle){
        if(detalle.getId() != null && detalle.getId()>0){
            em.merge(detalle);
        }
        else{
            em.persist(detalle);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Detalle findOne(Long id){
        return em.find(Detalle.class, id);

    }

    @Override
    @Transactional
    public void delete(Long id){
        Detalle detalle = findOne(id);
        em.remove(detalle);
    }

}
