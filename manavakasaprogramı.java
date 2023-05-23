import java.util.Scanner;
public class manavakasaprogramı {
    public static void main(String[] args){
        Scanner girdi = new Scanner(System.in);
        double armut=2.14 , elma=3.67 ,domates =1.11 , muz= 0.95 ,patlıcan= 5.00 ,toplamtutar;

        System.out.print("armut kaç kilo : ");
        armut = girdi.nextInt();
        System.out.print("elma kaç kilo : ");
        elma = girdi.nextInt();
        System.out.print("domates kaç kilo : ");
        domates = girdi.nextInt();
        System.out.print("muz kaç kilo : ");
        muz = girdi.nextInt();
        System.out.print("patlıcan kaç kilo : ");
        patlıcan = girdi.nextInt();

        toplamtutar= ((armut*armut)+(elma*elma)+(domates*domates)+(muz*muz)+(patlıcan*patlıcan));
        System.out.println("toplam tutar :" +toplamtutar);



    }


}
