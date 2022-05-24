import java.util.Scanner;
import java.util.Arrays;

public class DiziElemanSiralama {
	static int index=0 ;
	static int dizi[];
	static Scanner scn =new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Kaç elemanlı bir dizi oluştumak istiyorsunuz ? ");
		index=scn.nextInt();
		dizi=new int[index];
		System.out.println("dizinin elemanlarını giriniz ! ");
		for(int i=0;i<index;i++) {
			System.out.println((i+1)+". Elemanı Giriniz :");
			dizi[i]=scn.nextInt();
		}//for döngü kapaması
		System.out.println("Dizi Sıralaması :");
		Arrays.sort(dizi);//Arrays sınıfı kullanılarak sıraladık.
		for(int v:dizi) {
			System.out.print(v+" ");
		}
	}
}