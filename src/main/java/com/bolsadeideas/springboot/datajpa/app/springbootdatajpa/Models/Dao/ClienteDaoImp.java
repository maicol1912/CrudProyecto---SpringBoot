package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Cliente;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("ClienteDaoJPA")
public class ClienteDaoImp implements IClienteDao {

    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    @Override
    public List<Cliente> findAll() {
        // TODO Auto-generated method stub
        return em.createQuery("from Cliente").getResultList();
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {

        if (cliente.getId() != null && cliente.getId() > 0 ){
            em.merge(cliente);
        }
        else{
        em.persist(cliente);
        }
        
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findOne(Long id) {
        // TODO Auto-generated method stub
        return em.find(Cliente.class, id);
    }

    @Override
    @Transactional
    public void delete(Long id) {

        Cliente cliente = findOne(id);
        em.remove(cliente);
        
    }
    
}
