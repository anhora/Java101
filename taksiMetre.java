import java.util.Scanner;
public class taksiMetre {

    public static void main(String[] args) {


        int km;
        double perKm = 2.20, total = 10;

        Scanner girdi = new Scanner(System.in);
        System.out.print(" Mesafeyi KM cinsinden giriniz :");
        km = girdi.nextInt();
        total += (km * perKm);
        System.out.println("toplam tutar : " + total);
    }
}
