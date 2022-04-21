import java.util.Scanner;
public class harmonikSeri {

    public static void main(String[] args) {
        int sayi;
        double sonuc = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= sayi; i++) {
            sonuc += (1d / i);//bölme işlemi dügün olsun diye 1d double ayarlandı
            System.out.println("Harmonik serinin "+i+". değeri "+1d+"/"+i+"="+sonuc);
        }
        System.out.println("Toplam: "+sonuc);
    }
}
