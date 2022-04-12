import java.util.Scanner;
import java.util.Object;

public class KullaniciAdiVeSifre {
    public static void main(String[] args) {
        String userName, password, choose, newPassword;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        username = scanner.nextLine();


        if (Objects.equals(userName, "Patika")) {
            System.out.print("Şifreniz : ");
            password = scanner.nextLine();
            if (Objects.equals(password, "Developer")) {
                System.out.println("Oturum açma başarılı.");
            } else {
                System.out.print("--------\n1-Evet\n2-Hayır\nŞifre yanlış, şifresnizi sıfırlamak ister misiniz? :  ");
                choose = scanner.nextLine();
                if (Objects.equals(choose, "1")) {
                    System.out.print("Yeni şifrenizi giriniz : ");
                    newPassword = scanner.nextLine();
                    String s = Objects.equals(newPassword, "Developer") ? "Şifre oluşturulamadı, lütfen başka şifre giriniz." : "Şifre oluşturuldu.";

                    System.out.println(s);
                }

            }
        } else System.out.println("Böyle bir kullanıcı adı kayıtlı değil!!");
    }
}
