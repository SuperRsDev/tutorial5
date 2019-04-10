package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
    public TextField unosImena;
    public TextField unosPrezimena;
    public TextField unosEmaila;
    public TextField unosKorisnickogImena;
    public TextField unosLozinke;
    public ListView spisakKorisnika;
    private KorisnikModel model;

    @FXML
    private javafx.scene.control.Button closeButton;

    public Controller() {
        model = new KorisnikModel();
    }

    @FXML
    public void initialize() {
        spisakKorisnika.setItems(model.getKorisnici());
    }



    public void dodajKorisnika(ActionEvent actionEvent) {
        Korisnik noviKorisnik = new Korisnik();
        model.dodajKorisnika(noviKorisnik);
    }

    public void zavrsiProgram(ActionEvent actionEvent) {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
}
