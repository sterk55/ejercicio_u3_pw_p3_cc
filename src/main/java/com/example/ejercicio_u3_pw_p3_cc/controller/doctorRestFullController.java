package com.example.ejercicio_u3_pw_p3_cc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejercicio_u3_pw_p3_cc.service.IDoctorService;
import com.example.ejercicio_u3_pw_p3_cc.service.to.doctorTo;

@RestController
@RequestMapping("/doctor")
public class doctorRestFullController {

    @Autowired
    private IDoctorService doctorService;

    @GetMapping(path = "/cedula/{cedulaPaciente}", produces = MediaType.APPLICATION_JSON_VALUE)
    public doctorTo encontrar(@PathVariable("cedulaDoctor") String cedulaDoctor) {
        return this.doctorService.buscarPorCedulaTo(cedulaDoctor);

    }

    @GetMapping(path = "/{cedulaPaciente}", produces = MediaType.APPLICATION_JSON_VALUE)
    public doctorTo buscarPaciente(@PathVariable("cedulaPaciente") String cedulaPaciente) {
        doctorTo paciente = this.doctorService.buscarPorCedulaTo(cedulaDoctor);
        Link myLink2 = linkTo(methodOn(doctorRestfulController.class)).withSelfRel();
        paciente.add(myLink2);
        return paciente;
    }

}
