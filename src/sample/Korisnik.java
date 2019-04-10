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

    public SimpleStringProperty getIme() {
        return ime;
    }

    public void setIme(SimpleStringProperty ime) {
        this.ime = ime;
    }

    public SimpleStringProperty getPrezime() {
        return prezime;
    }

    public void setPrezime(SimpleStringProperty prezime) {
        this.prezime = prezime;
    }

    public SimpleStringProperty getEmail() {
        return email;
    }

    public void setEmail(SimpleStringProperty email) {
        this.email = email;
    }

    public SimpleStringProperty getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(SimpleStringProperty korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public SimpleStringProperty getLozinka() {
        return lozinka;
    }

    public void setLozinka(SimpleStringProperty lozinka) {
        this.lozinka = lozinka;
    }
}
