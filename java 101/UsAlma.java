import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {
        int sayi, Ussu, sonuc = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayıyı Giriniz: ");
        sayi = scanner.nextInt();
        System.out.print("Üssünü Giriniz : ");
        Ussu = scanner.nextInt();
		scanner.close();

        for (int i = 1; i <= Ussu; i++) {
            sonuc *= sayi;
        }
        System.out.println("Sonuç "+sayi+"! = " + sonuc);
    }
}
