package ba.unsa.etf.rpr;



public class Student {
    private String ime;
    private String prezime;
    private int brIndexa;

    public Student(String i,String p,int br)
    {
        ime=i;
        prezime=p;
        brIndexa =br;
    }
    public int getBrIndexa() {
        return brIndexa;
    }



    public String getIme() {
        return ime;
    }

    public void setIme(String ime2) {
        this.ime = ime2;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime2) {
        this.prezime = prezime2;
    }

    @Override
    public boolean equals(Object o) {
        Student p = (Student) o;
        if (p.ime.equals(this.ime) && p.prezime.equals(this.prezime)) return true;
        return false;
    }

    @Override
    public String toString() {
        return getPrezime()+" "+getIme()+" ("+ getBrIndexa()+")";
    }
}

