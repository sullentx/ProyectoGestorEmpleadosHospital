package org.example.gestorempleadosnew.models;

import java.util.Random;

public class Medico extends ProfesionalDeLaSalud{
    private String licencia;

    public Medico(String nombre, String apellidoPaterno, String apellidoMaterno, String idIdentificador, String departamento) {
        super(nombre, apellidoPaterno, apellidoMaterno, idIdentificador, departamento);
    }

    public Medico() {

    }




    public void setLicencia(String licencia) {
        this.licencia = "H1MED3423";
    }


    public String toString() {
        return "Medico{" +
                "licencia='" + licencia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", idIdentificador='" + idIdentificador + '\'' +
                ", departamento='" + departamento + '\'' +
                '}';
    }

}
