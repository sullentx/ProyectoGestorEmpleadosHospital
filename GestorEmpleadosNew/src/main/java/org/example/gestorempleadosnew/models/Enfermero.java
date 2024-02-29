package org.example.gestorempleadosnew.models;

public class Enfermero extends ProfesionalDeLaSalud{
    private String rolDeEnfermero;
    public Enfermero(String nombre, String apellidoPaterno, String apellidoMaterno, String idIdentificador, String departamento) {
        super(nombre, apellidoPaterno, apellidoMaterno, idIdentificador, departamento);
    }

    public Enfermero() {

    }


    public void setRolDeEnfermero(String rolDeEnfermero) {
        this.rolDeEnfermero = rolDeEnfermero;
    }

    @Override
    public String toString() {
        return "Enfermero{" +
                "servicioParaPacientes='" + rolDeEnfermero + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", idIdentificador='" + idIdentificador + '\'' +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
