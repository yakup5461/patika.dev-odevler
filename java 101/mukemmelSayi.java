import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        int sayi, araToplam = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = scanner.nextInt();
		scanner.close();
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                araToplam += i;
            }
        }
        if (araToplam == sayi) {
            System.out.println(sayi + " Mükemmel sayıdır");
        } else System.out.println(sayi + " Mükemmel sayı değildir.");

    }
}