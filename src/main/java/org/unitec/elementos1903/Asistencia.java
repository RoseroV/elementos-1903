/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1903;

import java.time.LocalDateTime;

/**
 *
 * @author Servicios Especiales
 */
public class Asistencia {
    private LocalDateTime fecha;
    private boolean presente;

    public Asistencia(LocalDateTime fecha, boolean presente) {
        this.fecha = fecha;
        this.presente = presente;
    }

    public Asistencia() {
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }
    
}
