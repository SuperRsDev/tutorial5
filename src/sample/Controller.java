package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
    public ListView<Korisnik> spisakKorisnika;

    private KorisnikModel model;

    @FXML
    private javafx.scene.control.Button closeButton;

    public Controller(KorisnikModel korisnikModel) {
        model = korisnikModel;
    }

    @FXML
    public void initialize() {
        spisakKorisnika.setItems(model.getKorisnici());
        unosImena.textProperty().bindBidirectional(model.getTrenutniKorisnik().getImeProperty());
        unosPrezimena.textProperty().bindBidirectional(model.getTrenutniKorisnik().getPrezimeProperty());
        unosEmaila.textProperty().bindBidirectional(model.getTrenutniKorisnik().getEmailProperty());
        unosKorisnickogImena.textProperty().bindBidirectional(model.getTrenutniKorisnik().getKorisnickoImeProperty());
        unosLozinke.textProperty().bindBidirectional(model.getTrenutniKorisnik().getLozinkaProperty());

        spisakKorisnika.getSelectionModel().selectedItemProperty().addListener((observableValue, korisnik, t1) -> {
            model.setTrenutniKorisnik(t1);
            unosImena.textProperty().bindBidirectional(model.getTrenutniKorisnik().getImeProperty());
            unosPrezimena.textProperty().bindBidirectional(model.getTrenutniKorisnik().getPrezimeProperty());
            unosEmaila.textProperty().bindBidirectional(model.getTrenutniKorisnik().getEmailProperty());
            unosKorisnickogImena.textProperty().bindBidirectional(model.getTrenutniKorisnik().getKorisnickoImeProperty());
            unosLozinke.textProperty().bindBidirectional(model.getTrenutniKorisnik().getLozinkaProperty());
        });
    }



    public void dodajKorisnika(ActionEvent actionEvent) {
        Korisnik noviKorisnik = new Korisnik();
        model.dodajKorisnika(noviKorisnik);
        model.setTrenutniKorisnik(noviKorisnik);
    }

    public void zavrsiProgram(ActionEvent actionEvent) {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
}
