import java.util.Scanner;

public class Faktoriyel {
	public static void main(String[] args) {
		int i;
	//girilen sayının faktoriyelini yazdıracağız
	System.out.println("Lütfen faktoriyelini almak istediğiniz sayısını giriniz !");
	
	//kullanıcıdan sayımızı alıyoruz
	Scanner scn=new Scanner(System.in);
	int input = scn.nextInt();
	scn.close();//veri girişini kapatıyoruz.
	
	//döngümüzü kuruyoruz ve konsola yazdırıyoruz.
	for( i=1;i<=input;i++){
		i*=i;
	}//döngü kapaması
	
	System.out.println("Girilen  "+input+"  sayısının Faktoriyeli "+i+"  dır.");
}//main metod kapama
}//sınıf kapama