package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void upisi1() throws IllegalAccessException {
        Predmet p=new Predmet("MLTI","M2",50);
        String n="1. milanovic emina (18231)\n";
        p.upisi(new Student("emina","milanovic",18231));

        assertEquals(p.toString(),n);
    }
    @Test
    void upisi2() throws IllegalAccessException {
        Predmet p = new Predmet("MLTI", "M2", 1);
        p.upisi(new Student("emina", "milanovic", 18231));
        try {
            p.upisi(new Student("amila", "mehic", 1223));
            assertEquals(0, 1);
        } catch (IllegalAccessException e) {
            assertEquals("nema mjesta na predmetu", e.getMessage());
        }
    }
    @Test
    void ispisi1() {
        try{
            Predmet p = new Predmet("MLTI", "M2", 1);
            p.upisi(new Student("emina", "milanovic", 18231));
            p.ispisi(new Student("amila", "mehic", 1223));
            assertEquals(0,1);
        }catch(IllegalAccessException e){
            assertEquals("brisanje nepostojeceg studenta",e.getMessage());
        }
    }

    @Test
    void ispisi2() throws IllegalAccessException {
        Predmet p = new Predmet("MLTI", "M2", 1);
        p.upisi(new Student("emina", "milanovic", 18231));
        p.ispisi(new Student("emina", "milanovic", 18231));
        assertEquals("",p.toString());
    }


}