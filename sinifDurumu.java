import java.util.Scanner;

public class sinifDurumu {
    public static void main(String[] args) {

    int mat, fizik, kimya ,turkce, muzik ;
            Scanner inp = new Scanner(System.in);

    System.out.print("Matematik Notunuzu girin :");
    mat= inp.nextInt();

    System.out.print("Fizik Notunuz");
    fizik= inp.nextInt();

    System.out.print("Kimya Notunuz");
    kimya= inp.nextInt();

    System.out.print("Turkce Notunuz");
    turkce= inp.nextInt();

    System.out.print("Muzik Notunuz");
    muzik= inp.nextInt();

    int toplam = (mat+fizik+kimya+turkce+muzik);
    double sonuc = toplam / 6 ;

    System.out.print("Sınıf ortalamanız : " +sonuc);

    String sinifDurumu = (sonuc > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

    System.out.println(sinifDurumu);




    }
}