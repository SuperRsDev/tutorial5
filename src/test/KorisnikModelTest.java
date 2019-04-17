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
        var korisnici = this.korisnikModel.getKorisnici();
        assertEquals(korisnici.size(), 0);

        this.korisnikModel.dodajKorisnika(new Korisnik());
        var novaVelicinaKorisnika = this.korisnikModel.getKorisnici().size();
        assertEquals(novaVelicinaKorisnika, 1);
    }

    @Test
    void dodajKorisnika() {
        var korisnici = this.korisnikModel.getKorisnici();
        assertEquals(korisnici.size(), 0);

        this.korisnikModel.dodajKorisnika(new Korisnik());
        this.korisnikModel.dodajKorisnika(new Korisnik());
        this.korisnikModel.dodajKorisnika(new Korisnik());
        var novaVelicinaKorisnika = this.korisnikModel.getKorisnici().size();
        assertEquals(novaVelicinaKorisnika, 3);
    }

    @Test
    void getTrenutniKorisnik() {
        this.korisnikModel.napuni();
        var trenutniKorisnik = this.korisnikModel.getTrenutniKorisnik();
        var prviKorisnik = this.korisnikModel.getKorisnici().get(0);
        assertTrue(trenutniKorisnik.equals(prviKorisnik));

        var noviKorisnik = new Korisnik();
    }

    @Test
    void getTrenutniKorisnikProperty() {
    }

    @Test
    void setTrenutniKorisnik() {
    }

    @Test
    void napuni() {
        this.korisnikModel.napuni();
        var velicinKorisnikaNakonNapuni = this.korisnikModel.getKorisnici().size();
        assertEquals(velicinKorisnikaNakonNapuni, 4);
    }
}