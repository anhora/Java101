import java.util.Scanner;
public class vücuKitleindexi {

    public static void main(String[] args){

        Scanner girdi = new Scanner(System.in);
        int kg;
        double boy, index;

        System.out.println("lütfen boyunuzu metre cinsinden yazınız :");
        boy = girdi.nextInt();
        System.out.println(" kilonuzu giriniz :");
        kg = girdi.nextInt();

        index =  kg/boy*boy ;
        System.out.println(" vücut kitle indexiniz : " +index);




    }

}
