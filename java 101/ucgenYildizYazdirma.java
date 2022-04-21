import java.util.Scanner;

public class ucgenYildizYazdirma {
    public static void main(String[] args) {
        int sayi;
        System.out.print("Bir sayı giriniz: ");
        Scanner scanner = new Scanner(System.in);
        sayi = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= sayi; i++) {
            	for (int j = 0; j < (sayi - i); j++) {
                System.out.print(" ");
                }
            	for (int k = 0; k < (i + (i - 1)); k++) {
                System.out.print("*");
            	}
            System.out.println();
        }//ilk for döngüsü kapaması
        
        for (int i = sayi - 1; i > 0; i--) {
            	for (int j = 0; j < (sayi - i); j++) {
                System.out.print(" ");
            	}
            	for (int k = 0; k < (i + (i - 1)); k++) {
                System.out.print("*");
            	}
            System.out.println();
        }//ikinci for döngüsü kapaması
}//main metod kapatılması
}//sınıf kapaması