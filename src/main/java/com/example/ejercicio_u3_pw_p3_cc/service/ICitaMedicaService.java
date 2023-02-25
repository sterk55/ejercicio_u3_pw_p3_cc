package com.example.ejercicio_u3_pw_p3_cc.service;

import java.util.List;

import com.example.ejercicio_u3_pw_p3_cc.model.citamedica;
import com.example.ejercicio_u3_pw_p3_cc.service.to.citamediaActualizar;
import com.example.ejercicio_u3_pw_p3_cc.service.to.citamedicaAgendada;

public interface ICitaMedicaService {

    public void insertarCita(citamedicaAgendada citamedica);

    public void actualizarCita(int numeroCita, citamediaActualizar citamediaActualizar);

    public citamedica buscarCita(int id);

    List<citamedica> citasPendientes(String cedula);

    citamedica buscarCitaMedicaPorNumeroDeCita(String numero);
}
