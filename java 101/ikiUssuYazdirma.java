import java.util.Scanner;

public class ikiUssuYazdirma {
	public static void main(String[] args) {
		
	//girilen sayıya kadar 2'nin kuvvetlerini yazdıracağız
	System.out.println("Lütfen üst sınır sayısını giriniz !");
	
	//kullanıcıdan sayımızı alıyoruz
	Scanner scn=new Scanner(System.in);
	int input = scn.nextInt();
	
	//döngümüzü kuruyoruz ve konsola yazdırıyoruz.
	for(int i=1;i<=input;i*=2){
		System.out.println(i);
		scn.close();//veri girişini kapatıyoruz.
	}

}//main metod kapama
}//sınıf kapama
