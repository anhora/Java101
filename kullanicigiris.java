import java.util.Scanner;

public class kullanicigiris {
    public static void main(String[] args) {
        String userName, password, select,newPassword;
        ;

        Scanner input = new Scanner(System.in);


        System.out.print("Kullanıcı Adını Giriniz: ");
        userName = input.nextLine();
        System.out.print("Kullacı Şifrenizi Giriniz: ");
        password = input.nextLine();


        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş Başarılı !!");



        } else if(!(userName.equals("patika")) && !(password.equals("java123"))){
            System.out.print("Hatalı Giriş .Kullanıcı adı ve şifre yanlıştır!! Lütfen bilgileri kontrol edip tekrar deneyiniz.");



        } else if (!(userName.equals("patika")) && (password.equals("java123"))) {
            System.out.print("Kullanıcı adı hatalı lütfen Kullanıcı adını kontrol edip tekrar deneyiniz.");


        } else if(userName.equals("patika") && !(password.equals("java123"))) {
            System.out.println("Hatalı Şifre!!!");
            System.out.println("Şifrenizi unuttuysanız adımları takip edin\n Yeni şifre oluşturmak için : 'E' .\n Yeni Şifre oluşturmaktan vazgeçmek ve giriş ekranından ayrılmak için:'H'.");
            System.out.print(" Seçiminiz: ");
            select = input.nextLine();



            if (select.equals("E") || select.equals("e") ){
                System.out.print("Yeni şifre giriniz .(Lütfen daha önceki şifrelerinizden farklı bir şifre oluşturunuz:");
                newPassword = input.nextLine();


                if (!newPassword.equals("java123")){
                    System.out.print("Yeni şifreniz başarı ile oluşturuldu.");
                    // şifre hatalı şekilde değiştirilmeye çalışılırsa
                }else {
                    System.out.print("Hatalı deneme!! Yeni şifre eskisiyle aynı olamaz. Tekrar Deneyiniz");
                }

            } else if (select.equals("H") || select.equals("h")) {
                System.out.print("kullanıcı giriş sayfanda ayrılıyorsunuz ... iyi günler .");
               
            }else {
                System.out.print("Hatalı giriş yaptınız!! Lütfen sadece 'E ve H' seçeneklerinden birini giriniz.");
            }
        }

    }
}
