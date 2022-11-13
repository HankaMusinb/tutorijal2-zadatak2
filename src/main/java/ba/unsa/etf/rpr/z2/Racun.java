package ba.unsa.etf.rpr.z2;

public class Racun {
    private Long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja;
    private Double stanjeRacuna;
    private Double prekoracenje;

    public Racun(Long brojRacuna, Osoba korisnikRacuna){
        this.brojRacuna = brojRacuna;
        this.korisnikRacuna = korisnikRacuna;
    }
    public boolean provjeriOdobrenjePrekoracenja(Double uplata){
        if(this.prekoracenje>uplata){
            return false;
        }
        return true;
    }
    public boolean izvrsiIsplatu(Double isplata){
        if(this.stanjeRacuna + this.prekoracenje < isplata){
            return false;
        }else{
            this.stanjeRacuna-=isplata;
            return true;
        }
    }
    public boolean izvrsiUplatu(Double uplata){
        this.stanjeRacuna+=uplata;
        return true;
    }
    public void odobriPrekoracenje(Double iznos){
        this.prekoracenje = iznos;
    }
    public boolean isOdobrenjePrekoracenja() {
        return odobrenjePrekoracenja;
    }

    public Long getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(Long brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public Osoba getKorisnikRacuna() {
        return korisnikRacuna;
    }

    public void setKorisnikRacuna(Osoba korisnikRacuna) {
        this.korisnikRacuna = korisnikRacuna;
    }

    public void setOdobrenjePrekoracenja(boolean odobrenjePrekoracenja) {
        this.odobrenjePrekoracenja = odobrenjePrekoracenja;
    }

    public Double getStanjeRacuna() {
        return stanjeRacuna;
    }

    public void setStanjeRacuna(Double stanjeRacuna) {
        this.stanjeRacuna = stanjeRacuna;
    }

    public Double getPrekoracenje() {
        return prekoracenje;
    }

    public void setPrekoracenje(Double prekoracenje) {
        this.prekoracenje = prekoracenje;
    }
}
