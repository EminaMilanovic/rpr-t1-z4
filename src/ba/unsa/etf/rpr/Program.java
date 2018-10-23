package ba.unsa.etf.rpr;
public class Student{
    private:
    String ime;
    String prezime;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
}
public class Predmet{
    public:
    String naziv_predmeta;
    String sifra_predmeta;
    int  max_broj_studenata;
    private:
    Student [] studenti;

    public String getNaziv_predmeta() {
        return naziv_predmeta;
    }

    public void setNaziv_predmeta(String naziv_predmeta) {
        this.naziv_predmeta = naziv_predmeta;
    }

    public String getSifra_predmeta() {
        return sifra_predmeta;
    }

    public void setSifra_predmeta(String sifra_predmeta) {
        this.sifra_predmeta = sifra_predmeta;
    }

    void upisi(Student s){}
    void ispisi(Student s){}


}

public class Program {

    public static void main(String[] args) {
	// kreiranje novog predmeta, novog studenta, upis studenta na predmet, ispis studenta sa predmeta,
        // brisanje studenta, brisanje predmeta, te ispis spiska studenata na predmetu.

    }
}
