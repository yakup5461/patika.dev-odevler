 public class ArmstrongSayi {
	 public static void main(String[] args) {
		 int sayi , basamakSayisi=0,basamakDeger=0,tutucu=0,basamakToplam = 0;
		 
	System.out.println("100 ile 999 arasındaki armstrog sayılar!!! \n ");
	//for döngüsü ile 100 ile 999 arasındaki saylardan armstrog sayıları bulup yazdıran bir döngü
	for(sayi=100;sayi<=999;sayi++) {

		 tutucu=sayi;
		 //basamak sayısını bulacağımız döngü
		 while(tutucu!=0) {
			 tutucu/=10;
			 basamakSayisi++; 		 
		 }//while döngü bitişi.
		 
		 
		 tutucu=sayi;
		 
		 //sayının rakamlarınn amrmstrong değerini bulacağımız döngü
		 while(tutucu!=0) {
			 basamakDeger=tutucu%10;
			 
			 		int basamakKuvveti=1;//çarpmanın etkisiz elemanını atıyoruz
					for(int i=1;i<=basamakSayisi;i++) {
					basamakKuvveti*=basamakDeger;//değerin üssünü alma işlemi uyguluyoruz
					}//for döngü kapaması
					
			basamakToplam+=basamakKuvveti;		 
			tutucu/=10; 	 
		 	}//while döngü bitişi.
		 
		 //sayiKontrol=basamakToplam*basamakSayisi;//basamak değerleri ile basamak sayısını çarpıp kontrol yapacağım
		 
		 //sayımızın Armstrong sayı olup olmadığını kontrol ettiğmiz yapı
		 if(sayi==basamakToplam) {
			 System.out.println(sayi+" Sayısı bir Armstrong Sayıdır.");
		 }
		
		 basamakSayisi=0;
		 basamakToplam=0;
	}//for döngü bitişi
}//main metod kapama
}//sınıf kapama
