package ba.unsa.etf.rpr;
import  java.util.Scanner;

public class Program {

    public static void main(String[] args) throws IllegalAccessException {
        // kreiranje novog predmeta, novog studenta, upis studenta na predmet, ispis studenta sa predmeta,
        // brisanje studenta, brisanje predmeta, te ispis spiska studenata na predmetu.

        System.out.printf("Napisite naziv predmeta kojeg zelite kreirati: ");
        Scanner ulaz = new Scanner(System.in);
        String naziv = ulaz.nextLine();
        System.out.printf("Unesite max broj studenata na predmetu: ");
        int max = ulaz.nextInt();
        System.out.printf("Unesite sifru predmeta: ");
        String pom = ulaz.nextLine();
        String sifra = ulaz.nextLine();
        Predmet p = new Predmet(naziv, sifra, max);
        int n;
        String prazan_red;
        do {
            System.out.printf("Unesite 0-upis studenata,1-brisanje studenta,2-ispis studenata na predmetu,-1-za kraj programa: \n");
             n = ulaz.nextInt();
            switch (n) {
                case 0: {
                     prazan_red=ulaz.nextLine();
                    System.out.printf("Unesite ime studenta: ");
                    String ime = ulaz.nextLine();
                    System.out.printf("Unesite prezime studenta: ");
                    String prezime = ulaz.nextLine();
                    System.out.printf("Unesite broj indexa: ");
                    int index = ulaz.nextInt();
                    Student s = new Student(ime, prezime, index);
                    p.upisi(s);
                    break;

                }
                case 1: {
                    prazan_red=ulaz.nextLine();
                    System.out.printf("Unesite ime studenta: ");
                    String ime = ulaz.nextLine();
                    System.out.printf("Unesite prezime studenta: ");
                    String prezime = ulaz.nextLine();
                    System.out.printf("Unesite broj indexa: ");
                    int index = ulaz.nextInt();
                    Student s = new Student(ime, prezime, index);
                    p.ispisi(s);
                    break;
                }
                case 2: {
                    System.out.println(p);
                }
            }
        }while(n!=-1);

        }

}
