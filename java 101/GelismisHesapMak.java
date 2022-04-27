import java.util.Scanner;

public class GelismisHesapMak {
	static int sayi1,sayi2,secim,sonuc,araSayi=1;
	static Scanner scn= new Scanner(System.in);
	
	static void standartGirdi() {
		System.out.println("İşlem için ilk sayıyı giriniz :");
		sayi1 =scn.nextInt();
		System.out.println("İşlem için ikinci sayıyı giriniz :");
		sayi2 =scn.nextInt();
		}
	
	static void toplama(int a,int b) {sonuc=a+b;System.out.println("Sonuç :"+sonuc);}
	
	static void cikartma(int a,int b) {sonuc=a-b;System.out.println("Sonuç :"+sonuc);}
	
	static void carpma(int a,int b) {sonuc=a*b;System.out.println("Sonuç :"+sonuc);}
	
	static void bolme(int a,int b) {if(b!=0) {sonuc=a/b;System.out.println("Sonuç :"+sonuc);}else{System.out.println("Sıfıra Bölüm Tanımsızdır");}}
	
	static void usAlma(int a,int b) {araSayi=1;for(int i=1;i<=b;i++) {araSayi*=a;} sonuc=araSayi;System.out.println("Sonuç :"+sonuc);}
	
	static void faktoriyel(int a) {araSayi=1;for(int i=1;i<=a;i++){araSayi*=i;}sonuc=araSayi;System.out.println("Sonuç :"+sonuc);}
	
	static void mod(int a,int b) {sonuc=a%b;System.out.println("Sonuç :"+sonuc);}
	
	static void dikdortgenAlanCevre(int a,int b) {System.out.println("Dikdörtgen Çevre :"+(2*(a+b))+"\nDikdörtgen Alan :"+(a*b));}
	
	public static void main (String [] args) {
		
	System.out.println(
			  "1- Toplama İşlemi\n"
			+ "2- Çıkarma İşlemi\n"
			+ "3- Çarpma İşlemi\n"
			+ "4- Bölme işlemi\n"
			+ "5- Üslü Sayı Hesaplama\n"
			+ "6- Faktoriyel Hesaplama\n"
			+ "7- Mod Alma\n"
			+ "8- Dikdörtgen Alan ve Çevre Hesabı");
	while(true) {
	System.out.println("Lütfen Yapmak istediğiniz İşlem Numarasını giriniz :");
	secim=scn.nextInt();
	switch(secim){
	case 1:
		standartGirdi();
		toplama(sayi1, sayi2);
	break ;		
	case 2:
		standartGirdi();
		cikartma(sayi1, sayi2);
	break ;		
	case 3:
		standartGirdi();
		carpma(sayi1, sayi2);
	break ;		
	case 4:
		standartGirdi();
		bolme(sayi1, sayi2);
	break ;		
	case 5:
		standartGirdi();
		usAlma(sayi1, sayi2);
	break ;		
	case 6:
		System.out.println("İşlem için sayıyı giriniz :");
		sayi1 =scn.nextInt();
		faktoriyel(sayi1);
	break ;		
	case 7:
		standartGirdi();
		mod(sayi1, sayi2);
	break ;		
	case 8:
		standartGirdi();
		dikdortgenAlanCevre(sayi1, sayi2);
	break ;
	default:
	System.out.println("geçersiz bir seçim yaptınız. Lütfen Geçerli bir seçenek giriniz!!!");	
	break ;		
	}//swich sonu
	}//while sonu
}//main sonu
}//class sonu