import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {

        int matematik, fizik, kimya, turkce, tarih, muzik, dersSayisi = 0, toplam = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("matematikematematikik Notunuz :");
        matematik = scanner.nextInt();
        System.out.print("Fizik Notunuz :");
        fizik = scanner.nextInt();
        System.out.print("Kimya Notunuz :");
        kimya = scanner.nextInt();
        System.out.print("Türkçe Notunuz :");
        turkce = scanner.nextInt();
        System.out.print("Tarih Notunuz :");
        tarih = scanner.nextInt();
        System.out.print("Müzik Notunuz :");
        muzik = scanner.nextInt();

        if ((matematik <= 100 && matematik >= 0)) {
            dersSayisi++;
            toplam = toplam + matematik;
        }
        if ((fizik <= 100 && fizik >= 0)) {
            dersSayisi++;
            toplam = toplam + fizik;
        }
        if ((kimya <= 100 && kimya >= 0)) {
            dersSayisi++;
            toplam = toplam + kimya;
        }
        if ((turkce <= 100 && turkce >= 0)) {
            dersSayisi++;
            toplam = toplam + turkce;
        }
        if ((tarih <= 100 && tarih >= 0)) {
            dersSayisi++;
            toplam = toplam + tarih;
        }
        if ((muzik <= 100 && muzik >= 0)) {
            dersSayisi++;
            toplam = toplam + muzik;
        }

        double ortalama = (double) toplam / dersSayisi;
        System.out.println("Ortalamanız : " + ortalama);
        if (ortalama >= 55) {
            System.out.println("Sınıfı Geçtiniz.");
        } else {
            System.out.println("Sınıfta Kaldınız Seneye Gene örüşmek Üzere");
        }
    }


}
