import java.util.Scanner;
public class ucgenalanhesaplama {
    public static void main(String[] args) {
        int a , b, c  ;
        double x, d;

        Scanner girdi = new Scanner(System.in);
        System.out.print("1.kenar uzunluğunu giriniz :"  );
        a = girdi.nextInt();
        System.out.print("2.kenar  uzunluğunu giriniz :");
        b = girdi.nextInt();
        System.out.print("3.kenar  uzunluğunu giriniz :");
        c = girdi.nextInt();

        d = (a+b+c)/2 ;
        System.out.println("ucgenin cevresi "+ d);

        x = Math.sqrt(d*(d-a) * (d-b) * (d-c));
        System.out.println("ucgenin alanı : "+ x);


    }
}
