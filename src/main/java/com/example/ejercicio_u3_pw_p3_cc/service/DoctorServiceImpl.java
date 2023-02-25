package com.example.ejercicio_u3_pw_p3_cc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio_u3_pw_p3_cc.model.doctor;
import com.example.ejercicio_u3_pw_p3_cc.repository.IDoctorRepository;
import com.example.ejercicio_u3_pw_p3_cc.service.to.doctorTo;

@Service
public class DoctorServiceImpl implements IDoctorService {

    @Autowired
    private IDoctorRepository doctorRepository;

    @Override
    public void insertar(doctorTo doc) {
        // TODO Auto-generated method stub
        this.doctorRepository.insertar(transformar(doc));
    }

    @Override
    public doctor buscarPorCedu(String cedu) {
        // TODO Auto-generated method stub
        return this.doctorRepository.buscarPorCedu(cedu);
    }

    private doctorTo transformarTo(doctor doc) {

        doctorTo DoctorTo = new doctorTo();
        DoctorTo.setId(doc.getId());
        DoctorTo.setApellido(doc.getApellido());
        DoctorTo.setCedula(doc.getCedula());
        DoctorTo.setCodigo_senecyt(doc.getCodigo_senecyt());
        DoctorTo.setFecha_nacimiento(doc.getFecha_nacimiento());
        DoctorTo.setNombre(doc.getNombre());
        DoctorTo.setNumero_consultorio(doc.getCodigo_senecyt());

        return DoctorTo;

    }

    private doctor transformar(doctorTo doc) {

        doctor DoctorTo = new doctor();
        DoctorTo.setId(doc.getId());
        DoctorTo.setApellido(doc.getApellido());
        DoctorTo.setCedula(doc.getCedula());
        DoctorTo.setCodigo_senecyt(doc.getCodigo_senecyt());
        DoctorTo.setFecha_nacimiento(doc.getFecha_nacimiento());
        DoctorTo.setNombre(doc.getNombre());
        DoctorTo.setNumero_consultorio(doc.getCodigo_senecyt());

        return DoctorTo;

    }
}
