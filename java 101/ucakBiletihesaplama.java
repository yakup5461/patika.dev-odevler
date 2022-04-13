import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        int yas, km, yolculukTipi;
        double kmBasi = 0.10, fiyat , yas_indirimi ,indirim;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = scanner.nextInt();
        if (km <= 0) {
            do {
                System.out.print("Hatalı Veri Girdiniz ! Pozitif bir mesafe giriniz : ");
                km = scanner.nextInt();
            } while (km <= 0);

        }
        System.out.print("Yaşınızı giriniz : ");
        yas = scanner.nextInt();
        if (yas <= 0) {
            do {
                System.out.print("Hatalı Veri Girdiniz !Pozitif bir yaş giriniz : ");
                yas = scanner.nextInt();
            } while (yas <= 0);
        }

        System.out.println("---------\n1-Tek Yön \n2-Gidiş-Dönüş");
        System.out.print("Yolculuk tipini giriniz : ");

        yolculukTipi = scanner.nextInt();
        if (!(yolculukTipi == 1 || yolculukTipi == 2)) {
            do {
                System.out.println("---------\nHatalı Seçim \n1-Tek Yön \n2-Gidiş-Dönüş");
                System.out.print("Yolculuk tipini giriniz : ");
                yolculukTipi = scanner.nextInt();
            } while (!(yolculukTipi == 1 || yolculukTipi == 2));
        }


        if (yas < 12) {
            yas_indirimi = 0.5;
        } else if (yas < 24) {
            yas_indirimi = 0.1;
        } else if (yas > 65) {
            yas_indirimi = 0.3;
        }else yas_indirimi =0;

        if (yolculukTipi==2){
            indirim=0.2;
            fiyat = km*kmBasi*2;
        }else {
            indirim = 0;
            fiyat = km*kmBasi;
        }


        double yas_indirimifiyat = yas_indirimi*fiyat;
        fiyat = fiyat-yas_indirimifiyat;
        double indirimfiyat= indirim*fiyat;
        fiyat = fiyat-indirimfiyat;
        System.out.println("Toplam Tutar: "+fiyat+" TL");




    }
}
