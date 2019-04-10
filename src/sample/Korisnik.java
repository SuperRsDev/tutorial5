package sample;


import javafx.beans.property.SimpleStringProperty;

public class Korisnik {
    private SimpleStringProperty ime;
    private SimpleStringProperty prezime;
    private SimpleStringProperty email;
    private SimpleStringProperty korisnickoIme;
    private SimpleStringProperty lozinka;

    public Korisnik(String ime, String prezime, String email,
                    String korisnickoIme, String lozinka) {
        this.ime = new SimpleStringProperty(ime);
        this.prezime = new SimpleStringProperty(prezime);
        this.email = new SimpleStringProperty(email);
        this.korisnickoIme = new SimpleStringProperty(korisnickoIme);
        this.lozinka = new SimpleStringProperty(lozinka);
    }

    public Korisnik() {
        ime = new SimpleStringProperty("");
        prezime = new SimpleStringProperty("");
        email = new SimpleStringProperty("");
        korisnickoIme = new SimpleStringProperty("");
        lozinka = new SimpleStringProperty("");
    }

    public SimpleStringProperty getImeProperty() {
        return ime;
    }

    public void setImeProperty(SimpleStringProperty ime) {
        this.ime = ime;
    }

    public SimpleStringProperty getPrezimeProperty() {
        return prezime;
    }

    public void setPrezimeProperty(SimpleStringProperty prezime) {
        this.prezime = prezime;
    }

    public SimpleStringProperty getEmailProperty() {
        return email;
    }

    public void setEmailProperty(SimpleStringProperty email) {
        this.email = email;
    }

    public SimpleStringProperty getKorisnickoImeProperty() {
        return korisnickoIme;
    }

    public void setKorisnickoImeProperty(SimpleStringProperty korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public SimpleStringProperty getLozinkaProperty() {
        return lozinka;
    }

    public void setLozinkaProperty(SimpleStringProperty lozinka) {
        this.lozinka = lozinka;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.ime.getValue(), this.prezime.getValue());
    }
}
