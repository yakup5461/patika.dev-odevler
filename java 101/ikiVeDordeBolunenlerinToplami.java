import java.util.Scanner;

public class ikiVeDordeBolunenlerinToplami {
	public static void main(String [] args) {
	int tekrar = 0, sayi, toplam = 0;
		        Scanner scanner = new Scanner(System.in);
		        		
		        do {
		            System.out.print("Sayı giriniz: ");
		            sayi = scanner.nextInt();
		            if (sayi % 4 == 0) {
		                toplam += sayi;
		                tekrar++;
		            }
		        } while (sayi % 2 == 0);
				//daha önce sayı girip girmediğini kontrol ediyoruz.
				if(tekrar==0){
					System.out.println("Daha önce hiç çift ve 4 e bölünen sayı girmediniz");}
				else{
		        System.out.println(" Girilen değerlerden çift ve 4'ün katları olan sayıların toplamı: \t" +toplam);
		        System.out.println(" Girilen değerlerden çift ve 4'ün katları olan sayıların ortalaması:\t" + (toplam / tekrar));
		        scanner.close();}
		    
    }

}
