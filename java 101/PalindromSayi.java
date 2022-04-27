import java.util.Scanner;

public class PalindromSayi {
	
	static boolean isPalindrom (int sayi) {
		int tutucu=sayi, sonBasamak , yeniSayi=0;
		//sayinı son basamağından ilk basamağına kadar gidecek bir döngü kurup elde ettiğimiz sayıyı kıyaslıyoruz.
		while(tutucu !=0) {
			sonBasamak=tutucu%10;
			yeniSayi=yeniSayi*10+sonBasamak;
			tutucu/=10;
		}
		if(sayi==yeniSayi)return true ;
		else return false;
	}

	public static void main(String[] args) {
		System.out.println("palindrom sayı kontrolü yapılacak sayıyı giriniz");
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		scn.close();
	System.out.print(isPalindrom(n));
	}
}