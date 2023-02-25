package com.example.ejercicio_u3_pw_p3_cc.repository;

import com.example.ejercicio_u3_pw_p3_cc.model.*;

public interface IPacienteRespository {

    public void insertar(paciente paciente);

    public paciente buscarPorCedu(String cedu);

}
