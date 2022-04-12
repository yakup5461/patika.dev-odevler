import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy, kg, vki;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        boy = scanner.nextDouble();

        System.out.print("Kilonuzu kg cinsinden giriniz : ");
        kg = scanner.nextDouble();

        vki = kg / Math.pow(boy, 2);
        System.out.println("Vucut kitle indexiniz : " + vki);


    }
}
