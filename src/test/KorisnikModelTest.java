import javafx.collections.ObservableList;
import org.junit.jupiter.api.Test;
import sample.Korisnik;
import sample.KorisnikModel;

import static org.junit.jupiter.api.Assertions.*;

class KorisnikModelTest {
    private KorisnikModel korisnikModel;
    public KorisnikModelTest() {
        this.korisnikModel = new KorisnikModel();
    }

    @Test
    void getKorisnici() {
        ObservableList<Korisnik> korisnici = this.korisnikModel.getKorisnici();
        assertEquals(korisnici.size(), 0);

        this.korisnikModel.dodajKorisnika(new Korisnik());
        int novaVelicinaKorisnika = this.korisnikModel.getKorisnici().size();
        assertEquals(novaVelicinaKorisnika, 1);
    }

    @Test
    void dodajKorisnika() {
        ObservableList<Korisnik> korisnici = this.korisnikModel.getKorisnici();
        assertEquals(korisnici.size(), 0);

        this.korisnikModel.dodajKorisnika(new Korisnik());
        this.korisnikModel.dodajKorisnika(new Korisnik());
        this.korisnikModel.dodajKorisnika(new Korisnik());
        int novaVelicinaKorisnika = this.korisnikModel.getKorisnici().size();
        assertEquals(novaVelicinaKorisnika, 3);
    }

    @Test
    void getTrenutniKorisnik() {
        this.korisnikModel.napuni();
        Korisnik trenutniKorisnik = this.korisnikModel.getTrenutniKorisnik();
        Korisnik prviKorisnik = this.korisnikModel.getKorisnici().get(0);
        assertTrue(trenutniKorisnik.equals(prviKorisnik));

        Korisnik noviKorisnik = new Korisnik("Hamo", "Hamo", "M", "e", "1234");
        this.korisnikModel.dodajKorisnika(noviKorisnik);
        this.korisnikModel.setTrenutniKorisnik(noviKorisnik);

        Korisnik novTrenutniKorisnik = this.korisnikModel.getTrenutniKorisnik();
        assertTrue(novTrenutniKorisnik.equals(noviKorisnik));
    }

    @Test
    void getTrenutniKorisnikProperty() {
    }

    @Test
    void setTrenutniKorisnik() {
        Korisnik noviKorisnik = new Korisnik("Hamo", "Hamo", "M", "e", "1234");
        this.korisnikModel.dodajKorisnika(noviKorisnik);
        this.korisnikModel.setTrenutniKorisnik(noviKorisnik);

        Korisnik novTrenutniKorisnik = this.korisnikModel.getTrenutniKorisnik();
        assertTrue(novTrenutniKorisnik.equals(noviKorisnik));
    }

    @Test
    void napuni() {
        this.korisnikModel.napuni();
        int velicinKorisnikaNakonNapuni = this.korisnikModel.getKorisnici().size();
        assertEquals(velicinKorisnikaNakonNapuni, 4);
    }
}