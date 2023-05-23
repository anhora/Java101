import java.util.Scanner;
public class daireAlan {

    public static void main(String[] args){
        Scanner girdi = new Scanner(System.in);

        int r, a ;
        double pi=3.14,dilimAlan ;
        System.out.print(" yarıçap ölçüsünü giriniz : ");
        r = girdi.nextInt();
        System.out.print(" merkez açı ölçüsünü giriniz : ");
        a = girdi.nextInt();

        dilimAlan = (pi * (r*r) * a) / 360 ;

        System.out.println("istenilen dilim alanı :" + dilimAlan);


    }
}
