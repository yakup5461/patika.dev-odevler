import java.util.Scanner;

public class recursiveAsalSayıBulma {
	
	private static int isPrime(int sayi, int i) {
	        if (i==1){return 1;}
	        else {
	            if (sayi%i==0){return 0;}
	            else return isPrime(sayi,i-1);}
	    }//metod kapama

    public static void main(String[] args) {
    	int sayi, prime ;
    	Scanner scan=new Scanner(System.in);    
        System.out.print("Asallık Kontrolü yapılacak sayi giriniz : ");
        sayi= scan.nextInt();
        prime=isPrime(sayi,sayi/2);
        if (prime==1){
            System.out.println(sayi+" sayisi asaldir");
        }else {
            System.out.println(sayi+" sayisi asal değildir");
        }
scan.close();
}//main metod kapama
}//sınıf kapama