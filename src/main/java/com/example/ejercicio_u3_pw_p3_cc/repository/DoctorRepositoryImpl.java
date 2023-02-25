package com.example.ejercicio_u3_pw_p3_cc.repository;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

import com.example.ejercicio_u3_pw_p3_cc.model.doctor;
import com.example.ejercicio_u3_pw_p3_cc.repository.*;

@Repository
@Transactional
public class DoctorRepositoryImpl implements IDoctorRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertar(doctor doc) {
        // TODO Auto-generated method stub

        this.entityManager.persist(doc);
    }

    @Override
    public doctor buscarPorCedu(String cedu) {
        // TODO Auto-generated method stub

        TypedQuery<doctor> myQuery = this.entityManager.createQuery("SELECT d FROM doctor d WHERE d.cedula =:cedula",
                doctor.class);
        myQuery.setParameter("cedula", cedu);
        return myQuery.getSingleResult();

    }

}
