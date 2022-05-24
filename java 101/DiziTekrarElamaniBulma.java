public class DiziTekrarElamaniBulma {
	public static boolean isValue(int [] arry, int value ) {//gelen değerin dizide olup olmadığına baktık
		for(int v: arry) {
			if(v==value) {
				return true;}
			}
		
	return false ;	
	}

	public static void main(String[] args) {
		int [] arr= {12,3,56,61,79,12,58,-3,76,-43,20,61,-15,-30,42,33,61,12,3,79,58,12};
		int [] RpeatArr=new int[arr.length];
		int index=0;
		for(int i =0;i<arr.length;i++) {//diziyi gezmeye başladık
			for(int j=0 ; j<arr.length ; j++){
				if( (i!=j) && (arr[i]==arr[j]) ) {//dizinin aynı elemanı olup olmadığına baktık ve değerine baktık
				if(!isValue(RpeatArr,arr[i])) {// metod ile kontrol yaptık ve tekrar dizimize ekledik
					RpeatArr[index++]=arr[i];
				}
			}
		}}//for döngü kapamaları
		
		for(int v :RpeatArr) { //diziyi oluştururken default değerleri yazdırmadık 
			if((v!=0)&& (0!=v%2))//ödevde istenen çift olmayan tekrar edenleri seçip bastırdık
		System.out.println(v);
		}
	}
}