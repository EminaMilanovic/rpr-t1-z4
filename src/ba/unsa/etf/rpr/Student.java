package ba.unsa.etf.rpr;

import java.util.Objects;

public class Student {
    private String ime;
    private String prezime;
    private int br_indexa;

    public Student(String i,String p,int br)
    {
        ime=i;
        prezime=p;
        br_indexa=br;
    }
    public int getBr_indexa() {
        return br_indexa;
    }



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

    @Override
    public boolean equals(Object o) {
        Student p = (Student) o;
        if (p.ime == this.ime && p.prezime == this.prezime) return true;
        return false;
    }

    @Override
    public String toString() {
        return getPrezime()+" "+getIme()+" ("+getBr_indexa()+")";
    }
}

