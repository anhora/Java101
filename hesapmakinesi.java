
import java.util.Scanner;
public class hesapmakinesi {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double sayi1, sayi2  ;

            System.out.println(" işlem yapmak istediğiniz sayıyı giriniz :");
            sayi1 = input.nextInt();
            System.out.println("işlem yapmak istediğiniz 2. sayıyı giriniz ");
            sayi2 = input.nextInt();
            System.out.println("işlemler");
            System.out.println("1. Toplama ");
            System.out.println("2. Çıkarma ");
            System.out.println("3. Çarpma ");
            System.out.println("4. Bölme ");
            System.out.println( " hangi işlemi yapmak istiyorsunuz seçiniz ");
            int secim = input.nextInt();
            double sonuc = 0 ;
            switch ( secim){

                case 1:
                sonuc = sayi1 + sayi2;

                break ;

                case 2:
                    sonuc = sayi1 -sayi2;

                    break;
                case 3 :
                    sonuc = sayi1 * sayi2 ;


                case 4:
                    sonuc  = sayi1 / sayi2 ;

            }
            System.out.println("sonuc : "+ sonuc);



            }
        }


