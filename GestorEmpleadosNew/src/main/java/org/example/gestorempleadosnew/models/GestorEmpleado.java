package org.example.gestorempleadosnew.models;
import javafx.collections.ObservableList;
public class GestorEmpleado {
    private ObservableList<ProfesionalDeLaSalud> profesionales;
    Medico newMedico=new Medico();
    Enfermero newEnfermero=new Enfermero();

    public void addMedico(){
        profesionales.add(newMedico);
    }
    public void addEnfermero(Enfermero newEnfermero){
        profesionales.add(this.newEnfermero);
    }

    public boolean addNewEmpleado(ProfesionalDeLaSalud profesionalDeLaSalud1){
        return profesionales.add(profesionalDeLaSalud1);
    }



}
