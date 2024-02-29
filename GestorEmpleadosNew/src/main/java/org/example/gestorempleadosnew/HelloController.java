package org.example.gestorempleadosnew;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.example.gestorempleadosnew.models.Enfermero;
import org.example.gestorempleadosnew.models.GestorEmpleado;
import org.example.gestorempleadosnew.models.Medico;
import org.example.gestorempleadosnew.models.ProfesionalDeLaSalud;
import java.net.URL;
import java.util.ResourceBundle;
public class HelloController implements Initializable {

    private ObservableList<ProfesionalDeLaSalud> profesionales;
    private GestorEmpleado add;
    @FXML
    private ListView<ProfesionalDeLaSalud> ltsProfesionales;
    @FXML
    private ListView<ProfesionalDeLaSalud> ltsEnfermero;
    @FXML
    private TextField txtNombreMedico;
    @FXML
    private TextField txtApellidoPaternoMedico;
    @FXML
    private TextField txtApellidoMaternoMedico;
    @FXML
    private TextField txtIdentificadorMedico;
    @FXML
    private TextField txtDepartamento;
    @FXML
    private TextField txtLicenciaMedica;
    //atributos de enfermero
    @FXML
    private TextField txtNombreEnfermero;
    @FXML
    private TextField txtApellidoPaternoEnfermero;
    @FXML
    private TextField txtApellidoMaternoEnfermero;
    @FXML
    private TextField txtIdentificadorEnfermero;
    @FXML
    private TextField txtRolDeEnfermero;
    @FXML
    private Button btnGuardar;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnModificar;

    @FXML
    private Button btnGuardarEnfer;
    @FXML
    private Button btnEliminarEnfer;
    @FXML
    private Button btnModificarEnfer;



    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        profesionales = FXCollections.observableArrayList();
        ltsProfesionales.setItems(profesionales);
        ltsEnfermero.setItems(profesionales);
        ltsProfesionales.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ProfesionalDeLaSalud>() {
            @Override
            public void changed(ObservableValue<? extends ProfesionalDeLaSalud> observableValue, ProfesionalDeLaSalud medico1, ProfesionalDeLaSalud medicoSelec) {
                if (medicoSelec!=null){
            txtNombreMedico.setText(medicoSelec.getNombre());
            txtApellidoPaternoMedico.setText(medicoSelec.getApellidoPaterno());
            txtApellidoMaternoMedico.setText(medicoSelec.getApellidoMaterno());
            txtIdentificadorMedico.setText(medicoSelec.getIdIdentificador());
            txtLicenciaMedica.setText(medicoSelec.getDepartamento());
            btnGuardar.setDisable(true);
            btnModificar.setDisable(false);
            btnEliminar.setDisable(false);
            }
            }
        }
        );
        ltsEnfermero.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ProfesionalDeLaSalud>() {
            @Override
            public void changed(ObservableValue<? extends ProfesionalDeLaSalud> observableValue, ProfesionalDeLaSalud enfermero1, ProfesionalDeLaSalud enfermeroSelec) {
                if (enfermeroSelec!=null){
                txtNombreEnfermero.setText(enfermeroSelec.getNombre());
                txtApellidoPaternoEnfermero.setText(enfermeroSelec.getApellidoPaterno());
                txtApellidoMaternoEnfermero.setText(enfermeroSelec.getApellidoMaterno());
                txtIdentificadorEnfermero.setText(enfermeroSelec.getIdIdentificador());
                txtRolDeEnfermero.setText(enfermeroSelec.getDepartamento());
                btnGuardarEnfer.setDisable(true);
                btnModificarEnfer.setDisable(false);
                btnEliminarEnfer.setDisable(false);
            }
            }
        });
    }

    @FXML
    public void guardar() {
        profesionales.add(
                new Medico(txtNombreMedico.getText(), txtApellidoPaternoMedico.getText(),
                        txtApellidoMaternoMedico.getText(), txtIdentificadorMedico.getText(),
                        txtDepartamento.getText()));
        ltsProfesionales.setItems(profesionales);
        limpiar();

    }

    @FXML
    public void guardarEnfermero() {
        profesionales.add(
                new Enfermero(txtNombreEnfermero.getText(), txtApellidoPaternoEnfermero.getText(),
                        txtApellidoMaternoEnfermero.getText(), txtIdentificadorEnfermero.getText(),
                        txtRolDeEnfermero.getText())

        );
        ltsEnfermero.setItems(profesionales);
        limpiarEnfermero();
    }

    @FXML
    public void limpiar() {
        txtNombreMedico.setText(null);
        txtApellidoPaternoMedico.setText(null);
        txtApellidoMaternoMedico.setText(null);
        txtIdentificadorMedico.setText(null);
        txtLicenciaMedica.setText(null);
        btnGuardar.setDisable(false);
        btnModificar.setDisable(true);
        btnEliminar.setDisable(true);
        ltsProfesionales.getSelectionModel().clearSelection();
    }
    public void limpiarEnfermero() {
        txtNombreEnfermero.setText(null);
        txtApellidoPaternoEnfermero.setText(null);
        txtApellidoMaternoEnfermero.setText(null);
        txtIdentificadorEnfermero.setText(null);
        txtRolDeEnfermero.setText(null);
        btnGuardarEnfer.setDisable(false);
        btnModificarEnfer.setDisable(true);
        btnEliminarEnfer.setDisable(true);
        ltsEnfermero.getSelectionModel().clearSelection();
    }
    @FXML
    public void modificarMedico() {
        profesionales.set(ltsProfesionales.getSelectionModel().getSelectedIndex(),
                new Medico(txtNombreMedico.getText(), txtApellidoPaternoMedico.getText(),
                        txtApellidoMaternoMedico.getText(), txtIdentificadorMedico.getText(),
                        txtLicenciaMedica.getText())
        );
        ltsProfesionales.setItems(profesionales);
    }
    public void modificarEnfermero(){
        profesionales.set(ltsEnfermero.getSelectionModel().getSelectedIndex(),
                new Enfermero(txtNombreEnfermero.getText(), txtApellidoPaternoEnfermero.getText(), txtApellidoMaternoEnfermero.getText(), txtIdentificadorEnfermero.getText(), txtRolDeEnfermero.getText())

        );
        ltsEnfermero.setItems(profesionales);

    }
    @FXML
    public void eliminar(){
        profesionales.remove(ltsProfesionales.getSelectionModel().getSelectedIndex());
    }
    @FXML
    public void eliminarEnfermero(){
        profesionales.remove(ltsEnfermero.getSelectionModel().getSelectedIndex());
    }
}

