import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int sayac, pivot;
        Integer max=null,min=null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        sayac = scanner.nextInt();
        int i = 1;

        if (sayac>1){
            do {
                System.out.print(i + ". sayıyı giriniz: ");
                pivot = scanner.nextInt();
                if (max==null) max= pivot;
                if (min==null) min= pivot;
                if (pivot > max) max = pivot;
                if (pivot < min) min = pivot;
                i++;
                sayac--;


            } while (sayac > 0);
            System.out.println("En küçük sayı: " + min);
            System.out.println("En büyük sayı: " + max);
        }else System.out.println("Girilecek sayı adedi 1'den büyük olmalı, lütfen tekrar deneyiniz.");
    }
}