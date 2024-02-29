package org.example.gestorempleadosnew.models;

public class ProfesionalDeLaSalud {
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected String idIdentificador;
    protected String departamento;

    public ProfesionalDeLaSalud(String nombre, String apellidoPaterno, String apellidoMaterno, String idIdentificador, String departamento) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.idIdentificador = idIdentificador;
        this.departamento = departamento;
    }

    public ProfesionalDeLaSalud() {

    }


    public String getIdIdentificador() {
        return idIdentificador;
    }

    public String getDepartamento() {
        return departamento;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }




}
