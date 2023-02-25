package com.example.ejercicio_u3_pw_p3_cc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio_u3_pw_p3_cc.model.paciente;
import com.example.ejercicio_u3_pw_p3_cc.repository.IPacienteRespository;

@Service
public class PacienteServiceImpl implements IPacienteService {

    @Autowired
    private IPacienteRespository pacienteRespository;

    @Override
    public void insertar(paciente paciente) {
        // TODO Auto-generated method stub
        this.pacienteRespository.insertar(paciente);
    }

    @Override
    public paciente buscarPorCedu(String cedu) {
        // TODO Auto-generated method stub
        return this.pacienteRespository.buscarPorCedu(cedu);
    }

}
