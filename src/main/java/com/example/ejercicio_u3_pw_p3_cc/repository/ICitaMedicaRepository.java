package com.example.ejercicio_u3_pw_p3_cc.repository;

import java.util.List;

import com.example.ejercicio_u3_pw_p3_cc.model.*;

public interface ICitaMedicaRepository {

    public void insertarCita(citamedica citamedica);

    public void actualizarCita(citamedica citamedica);

    public citamedica buscarCita(int id);

    List<citamedica> citasPendientes(String cedula);

    citamedica buscarCitaMedicaPorNumeroDeCita(String numero);

}
