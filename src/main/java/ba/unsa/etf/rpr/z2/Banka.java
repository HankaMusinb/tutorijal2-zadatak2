package ba.unsa.etf.rpr.z2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Banka {
    private Long brojRacuna;

    private List<Korisnik> korisnici;

    private List<Uposlenik> uposlenici;

    public Banka() {
        this.korisnici = new ArrayList<Korisnik>();
        this.uposlenici = new ArrayList<Uposlenik>();
    }

    public Korisnik kreirajNovogKorisnika(String ime, String prezime){
        Korisnik k = new Korisnik(ime, prezime);
        this.korisnici.add(k);
        return k;
    }

    public Uposlenik kreirajNovogUposlenika(String ime, String prezime){
        Uposlenik uposl = new Uposlenik(ime, prezime);
        this.uposlenici.add(uposl);
        return uposl;
    }

    public Racun kreirajRacunZaKorisnika(Korisnik k){
        Racun r = null;
        for (int i = 0; i < this.korisnici.size(); i++){
            if (this.korisnici.get(i).equals(k)){ // koristimo metodu equals iz klase Korisnik
                Long brojRacuna = (new Random()).nextLong(); // generate random number for brojRacuna
                r = new Racun(brojRacuna, this.korisnici.get(i));
                break;
            }
        }
        return r;
    }
}
