import java.util.Scanner;

public class recursiveAsalSayıBulma {
	
private static int asalmi(int sayi, int i) {
//bu metodda girilen sayının yarısından başlanarak tam bölünüp bölünmediğine bakılıyor. ve kontrol saonucu döndürülüyor.
	   if (i==1){return 1;}
	        else {
	            if (sayi%i==0){return 0;}
	            else return asalmi(sayi,i-1);}
	    }//metod kapama

    public static void main(String[] args) {
    	int sayi, asal ;
    	Scanner scan=new Scanner(System.in);    
        System.out.print("Asallık Kontrolü yapılacak sayi giriniz : ");
        sayi= scan.nextInt();
        asal=asalmi(sayi,sayi/2);
        if (asal==1){
            System.out.println(sayi+" sayisi asaldir");
        }else {
            System.out.println(sayi+" sayisi asal değildir");
        }
scan.close();
}//main metod kapama
}//sınıf kapama
