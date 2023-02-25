package com.example.ejercicio_u3_pw_p3_cc.service;

import com.example.ejercicio_u3_pw_p3_cc.model.paciente;

public interface IPacienteService {

    public void insertar(paciente paciente);

    public paciente buscarPorCedu(String cedu);
}
