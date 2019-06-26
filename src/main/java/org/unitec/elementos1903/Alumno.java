/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1903;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import org.springframework.data.annotation.Id;
/**
 *
 * @author Marifer
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Alumno {
    @Id
    private String cuenta;
    private String nombre;
    private List<Materia> materias;
    private String email;
    private boolean autenticado;

    public Alumno(String cuenta, String nombre, List<Materia> materias, String email) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.materias = materias;
        this.email = email;
    }

    public Alumno() {
    }

    
    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }
    
}
