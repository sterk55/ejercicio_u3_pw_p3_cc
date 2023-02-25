package com.example.ejercicio_u3_pw_p3_cc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio_u3_pw_p3_cc.model.citamedica;
import com.example.ejercicio_u3_pw_p3_cc.repository.ICitaMedicaRepository;
import com.example.ejercicio_u3_pw_p3_cc.repository.IDoctorRepository;
import com.example.ejercicio_u3_pw_p3_cc.repository.IPacienteRespository;
import com.example.ejercicio_u3_pw_p3_cc.service.to.citamediaActualizar;
import com.example.ejercicio_u3_pw_p3_cc.service.to.citamedicaAgendada;

@Service
public class CitaMediaServiceImpl implements ICitaMedicaService {

    @Autowired
    private ICitaMedicaRepository citaMedicaRepository;

    @Autowired
    private IDoctorService doctorService;

    @Autowired
    private IPacienteService iPacienteService;

    @Override
    public void insertarCita(citamedicaAgendada citamedica) {
        // TODO Auto-generated method stub
        citamedica citaMed = new citamedica();
        citaMed.setNumero_cita(citamedica.getNumero_cita());
        citaMed.setFecha_cita(citamedica.getFecha_cita());
        citaMed.setValor_cita(citamedica.getValor_cita());
        citaMed.setLugar_cita(citamedica.getLugar_cita());
        citaMed.setDoctor(this.doctorService.buscarPorCedu(citamedica.getCedDoctor()));
        citaMed.setPaciente(this.iPacienteService.buscarPorCedu(citamedica.getCedPaciente()));

        this.citaMedicaRepository.insertarCita(citaMed);

    }

    @Override
    public void actualizarCita(int numeroCita, citamediaActualizar citamediaActualizar) {
        // TODO Auto-generated method stub
citamedica cita = this.citaMedicaRepository.buscarCita(numeroCita);
cita.setDiagnostico(citamediaActualizar.getDiagnostico());
cita.setReceta(citamediaActualizar.getReceta());
cita.setFecha_proxima_cita(citamediaActualizar.getFechaProximaCita());

this.citaMedicaRepository.actualizarCita(cita);

    }

    @Override
    public citamedica buscarCita(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarCita'");
    }

    @Override
    public List<citamedica> citasPendientes(String cedula) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'citasPendientes'");
    }

    @Override
    public citamedica buscarCitaMedicaPorNumeroDeCita(String numero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarCitaMedicaPorNumeroDeCita'");
    }

}
