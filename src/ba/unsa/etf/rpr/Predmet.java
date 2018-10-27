package ba.unsa.etf.rpr;

import java.util.Arrays;

public class Predmet {
    private  String naziv_predmeta;
    private String sifra_predmeta;
    private int  max_broj_studenata;
    private int broj=0;
    private Student [] studenti;
    public Predmet(String naziv,String sifra,int br){
        setNaziv_predmeta(naziv);
        setSifra_predmeta(sifra);
        max_broj_studenata=br;
        studenti=new Student[max_broj_studenata];

    }
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

    void upisi(Student s) throws IllegalAccessException {
        if(broj+1<=max_broj_studenata) {
            studenti[broj]=s;
            broj++;
        } else throw new IllegalAccessException("nema mjesta na predmetu");
    }
    void ispisi(Student s) throws IllegalAccessException {
        boolean k=false;
        for(int i=0;i<broj;i++){
            if(studenti[i].getBr_indexa()==s.getBr_indexa()) {
                k=true;

                for(int j=i;j<broj-1;j++){
                    studenti[j]=studenti[j+1];
                }
                broj--;
            }
        }
        if(!k) throw new IllegalAccessException("brisanje nepostojeceg studenta");
    }

    @Override
    public String toString() {
        String s="";
        for(int i=0;i<broj;i++){

         s+= i+1+". "+studenti[i].getPrezime()+" "+studenti[i].getIme()+" ("+studenti[i].getBr_indexa()+")\n";
        }
        return s;
    }
}