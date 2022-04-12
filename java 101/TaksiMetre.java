package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {
        int km;
        double fiyat , perKm = 2.20 ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi Km olarak giriniz : ");
        km = scanner.nextInt();

        fiyat = km * perKm + 10;

        System.out.println("Ödenecek tutar" + ((fiyat < 20) ? 20 : fiyat));
    }
}
