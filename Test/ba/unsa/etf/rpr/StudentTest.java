package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    //bespotrebno je da se geteri i seteri testiraju jer su generisani
    @Test
    void equals1() {
        Student s1=new Student("emina","milanovic",18231);
        Student s2=new Student("emina","milanovic",18231);
        assertEquals(true,s1.equals(s2));
    }

    @Test
    void equals2() {
        Student s1=new Student("emina","milanovic",18231);
        Student s2=new Student("emina","maric",18231);
        assertEquals(false,s1.equals(s2));
    }

    @Test
    void toString1() {
        Student s1=new Student("emina","milanovic",18231);
        assertEquals("milanovic emina (18231)",s1.toString());
    }
}