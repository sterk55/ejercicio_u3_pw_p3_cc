package com.example.ejercicio_u3_pw_p3_cc.controller;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejercicio_u3_pw_p3_cc.model.paciente;
import com.example.ejercicio_u3_pw_p3_cc.service.IPacienteService;

@RestController
@RequestMapping("/pacientes")
public class pacienteRestFullController {

    @Autowired
    private IPacienteService pacienteService;

    @GetMapping(path = "/cedula/{cedulaPaciente}", produces = MediaType.APPLICATION_JSON_VALUE)
    public paciente encontrar(@PathVariable("cedulaPaciente") String cedulaPaciente) {
        return this.pacienteService.buscarPorCedu(cedulaPaciente);

    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public paciente registrarPaciente(@RequestBody paciente paciente) {

        this.pacienteService.insertar(paciente);

        paciente paci = paciente;
        return this.pacienteService.buscarPorCedu(paci.getCedula());

    }

}
