package com.example.ejercicio_u3_pw_p3_cc.repository;

import com.example.ejercicio_u3_pw_p3_cc.model.*;

public interface IDoctorRepository {

    public void insertar(doctor doc);

    public doctor buscarPorCedu(String cedu);

}
