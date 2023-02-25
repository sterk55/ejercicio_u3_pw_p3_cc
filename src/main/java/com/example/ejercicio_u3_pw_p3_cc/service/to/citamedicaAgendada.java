package com.example.ejercicio_u3_pw_p3_cc.service.to;

import java.time.LocalDateTime;
import com.example.ejercicio_u3_pw_p3_cc.model.*;

public class citamedicaAgendada {

    private int id;
    private int numero_cita;
    private double valor_cita;
    private LocalDateTime fecha_cita;
    private String lugar_cita;
    private String cedPaciente;
    private String cedDoctor;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero_cita() {
        return this.numero_cita;
    }

    public void setNumero_cita(int numero_cita) {
        this.numero_cita = numero_cita;
    }

    public double getValor_cita() {
        return this.valor_cita;
    }

    public void setValor_cita(double valor_cita) {
        this.valor_cita = valor_cita;
    }

    public LocalDateTime getFecha_cita() {
        return this.fecha_cita;
    }

    public void setFecha_cita(LocalDateTime fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public String getLugar_cita() {
        return this.lugar_cita;
    }

    public void setLugar_cita(String lugar_cita) {
        this.lugar_cita = lugar_cita;
    }

    public String getCedPaciente() {
        return this.cedPaciente;
    }

    public void setCedPaciente(String cedPaciente) {
        this.cedPaciente = cedPaciente;
    }

    public String getCedDoctor() {
        return this.cedDoctor;
    }

    public void setCedDoctor(String cedDoctor) {
        this.cedDoctor = cedDoctor;
    }

}
