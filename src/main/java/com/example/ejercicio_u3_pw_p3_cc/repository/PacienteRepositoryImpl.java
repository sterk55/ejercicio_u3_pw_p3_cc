package com.example.ejercicio_u3_pw_p3_cc.repository;

import com.example.ejercicio_u3_pw_p3_cc.model.paciente;
import com.example.ejercicio_u3_pw_p3_cc.repository.*;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PacienteRepositoryImpl implements IPacienteRespository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertar(paciente paciente) {
        // TODO Auto-generated method stub
        this.entityManager.persist(paciente);
    }

    @Override
    public paciente buscarPorCedu(String cedu) {
        // TODO Auto-generated method stub
        TypedQuery<paciente> myQuery = this.entityManager.createQuery(
                "SELECT p FROM paciente p WHERE p.cedula =:cedula",
                paciente.class);
        myQuery.setParameter("cedula", cedu);
        return myQuery.getSingleResult();
    }

}
