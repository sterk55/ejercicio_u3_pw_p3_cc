package com.example.ejercicio_u3_pw_p3_cc.service;

import com.example.ejercicio_u3_pw_p3_cc.model.doctor;
import com.example.ejercicio_u3_pw_p3_cc.service.to.doctorTo;

public interface IDoctorService {

    public void insertar(doctorTo doc);

    public doctor buscarPorCedu(String cedu);
}
