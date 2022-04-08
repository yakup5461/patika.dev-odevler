import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik Notunuz  Giriniz :");
        mat = scanner.nextInt();

        System.out.print("Fizik Notunuz Giriniz :");
        fizik = scanner.nextInt();

        System.out.print("Kimya Notunuz Giriniz :");
        kimya = scanner.nextInt();

        System.out.print("Türkçe Notunuz Giriniz :");
        turkce = scanner.nextInt();

        System.out.print("Tarih Notunuz Giriniz :");
        tarih = scanner.nextInt();

        System.out.print("Müzik Notunuz Giriniz :");
        muzik = scanner.nextInt();

        int ortalama = ((mat + fizik + kimya + turkce + tarih + muzik) / 6.0);

        String sonuc = ortalama >= 60 ? "Başarılı Oldunuz Tebrikler" : "Başarılı olmak için daha fazla çalışmalısın!";
        
        System.out.println(sonuc);
    } //main kapama
}//class kapama
