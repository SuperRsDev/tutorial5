package sample;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KorisnikModel {
    private ObservableList<Korisnik> korisnici = FXCollections.observableArrayList();
    private ObjectProperty<Korisnik> trenutniKorisnik = new SimpleObjectProperty();

    public ObservableList<Korisnik> getKorisnici() {
        return korisnici;
    }

    public void dodajKorisnika(Korisnik korisnik) {
        this.korisnici.add(korisnik);
    }

    public Korisnik getTrenutniKorisnik() {
        return trenutniKorisnik.get();
    }

    public ObjectProperty<Korisnik> getTrenutniKorisnikProperty() {
        return trenutniKorisnik;
    }

    public ObjectProperty<Korisnik> trenutniKorisnikProperty() {
        return trenutniKorisnik;
    }

    public void setTrenutniKorisnik(Korisnik trenutniKorisnik) {
        this.trenutniKorisnik.set(trenutniKorisnik);
    }

    public void napuni() {
        this.korisnici.add(new Korisnik("Vedran", "Ljubovic", "vedran.ljubovic@gmail.com", "vedran", "123456"));
        this.korisnici.add(new Korisnik("Selim", "Hosi", "s.hosi@gmail.com", "selimselim", "123456"));
    }
}
