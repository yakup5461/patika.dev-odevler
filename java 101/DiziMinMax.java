import java.util.Scanner;

public class DiziMinMax {
static int [] arr= {12,-3,-5,20,61,55,42,27,30,8,44,78,96,32,65,41,12};
static int KucukPivot=Integer.MIN_VALUE,BuyukPivot=Integer.MAX_VALUE,girilen;


	public static void main(String[] args) {
		System.out.println("Lütfen referans bir değer giriniz !");
		Scanner scn=new Scanner(System.in);
		girilen=scn.nextInt();
		scn.close();
		
		 for (int i : arr) {
	            if (i<girilen) {
	            	if(i>KucukPivot) {
	               KucukPivot = i;
	               }
	               
	            }
	            if (i>girilen) {
	            	if(i<BuyukPivot) {
	            	BuyukPivot = i;
	            	}
	            }
	        }

	        System.out.println("Girilen Değere En Yakın Büyük Değer " + BuyukPivot);
	        System.out.println("Girilen Değere En Yakın Küçük Değer " + KucukPivot );
	}

}
