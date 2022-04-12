import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        double tutar;
        double kdv8 = 0.08;
        double kdv18 = 0.18;
        
        System.out.print("Ürün tutarı giriniz: ");
        Scanner scanner = new Scanner(System.in);

        double input = scanner.nextDouble();
        tutar = input <= 1000 ? input + input * kdv8 : input + input * kdv18;


        System.out.println("Katma Değer Vergisi : " + tutar + " ₺");
        System.out.println("Ürüne Uygulanan Katma Değer Vergisi Dilimi : " + (input <= 1000 ? "%08" : "%18"));
        System.out.println("Ürünün ham fiyatı : " + input);
        System.out.println("Ürünün Katma Değer Vergili Fiyatı : " + tutar + " ₺");

    }
}
