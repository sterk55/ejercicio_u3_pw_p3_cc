package com.example.ejercicio_u3_pw_p3_cc.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.ejercicio_u3_pw_p3_cc.model.citamedica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertarCita(citamedica citamedica) {
        // TODO Auto-generated method stub
        this.entityManager.persist(citamedica);
    }

    @Override
    public void actualizarCita(citamedica citamedica) {
        // TODO Auto-generated method stub
        this.entityManager.merge(citamedica);
    }

    @Override
    public citamedica buscarCita(int id) {
        // TODO Auto-generated method stub
        return this.entityManager.find(citamedica.class, id);
    }

    @Override
    public List<citamedica> citasPendientes(String cedula) {
        // TODO Auto-generated method stub
        TypedQuery<citamedica> myQuery = this.entityManager.createQuery("SELECT c FROM citamedica c", citamedica.class);

        return myQuery.getResultList();

    }

    @Override
    public citamedica buscarCitaMedicaPorNumeroDeCita(String numero) {
        // TODO Auto-generated method stub
        TypedQuery<citamedica> myQuery = this.entityManager
                .createQuery("SELECT c FROM citamedica c WHERE c.numero =:numero", citamedica.class);
        myQuery.setParameter("numero", numero);
        return myQuery.getSingleResult();
    }

}
