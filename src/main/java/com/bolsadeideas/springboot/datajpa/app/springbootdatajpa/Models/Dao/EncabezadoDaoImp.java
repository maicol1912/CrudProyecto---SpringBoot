package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Encabezado;

@Repository("EncabezadoDaoJPA")
public class EncabezadoDaoImp implements IEncabezadoDao{

    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    @Override
    public List<Encabezado> findAll() {
        return em.createQuery("from Encabezado").getResultList();
    }

    @Override
    @Transactional
    public void save(Encabezado encabezado){
        if(encabezado.getId() != null && encabezado.getId()>0){
            em.merge(encabezado);
        }
        else{
            em.persist(encabezado);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Encabezado findOne(Long id) {
        return em.find(Encabezado.class, id);
    }

    @Override
    @Transactional
    public void delete(Long id){
        Encabezado encabezado = findOne(id);
        em.remove(encabezado);
    }
    
}
