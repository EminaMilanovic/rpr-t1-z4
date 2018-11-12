package ba.unsa.etf.rpr;



public class Predmet {
    private  String nazivPredmeta;
    private String sifraPredmeta;
    private int maxBrojStudenata;
    private int broj=0;
    private Student [] studenti;

    public String getSifraPredmeta() {
        return sifraPredmeta;
    }

    public void setSifraPredmeta(String sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }


    public Predmet(String naziv,String sifra,int br){
        setNazivPredmeta(naziv);
        setSifraPredmeta(sifra);
        maxBrojStudenata =br;
        studenti=new Student[maxBrojStudenata];

    }
    public String getNazivPredmeta() {
        return nazivPredmeta;
    }


    public void setNazivPredmeta(String nazivPredmeta2) {
        this.nazivPredmeta = nazivPredmeta2;
    }



    void upisi(Student s) throws IllegalAccessException {
        if(broj+1<= maxBrojStudenata) {
            studenti[broj]=s;
            broj++;
        } else { throw new IllegalAccessException("nema mjesta na predmetu"); }
    }
    void ispisi(Student s) throws IllegalAccessException {
        boolean k=false;
        for(int i=0;i<broj;i++){
            if(studenti[i].getBrIndexa()==s.getBrIndexa()) {
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

         s+= i+1+". "+studenti[i].getPrezime()+" "+studenti[i].getIme()+" ("+studenti[i].getBrIndexa()+")\n";
        }
        return s;
    }
}