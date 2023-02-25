package com.example.ejercicio_u3_pw_p3_cc.service.to;

import java.time.LocalDateTime;

public class citamediaActualizar {

    private String diagnostico;
    private String receta;
    private LocalDateTime fechaProximaCita;

    public String getDiagnostico() {
        return this.diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getReceta() {
        return this.receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public LocalDateTime getFechaProximaCita() {
        return this.fechaProximaCita;
    }

    public void setFechaProximaCita(LocalDateTime fechaProximaCita) {
        this.fechaProximaCita = fechaProximaCita;
    }

}
