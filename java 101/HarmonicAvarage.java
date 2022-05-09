public class HarmonicAvarage { 
static double avarageHarmonic(int[] array ) {
    double total = 0 ;
    int j = 0;
    for(int i : array) {
    total += ( 1.0 / i ) ;
    j++;
    }
    total = total/j;
    return total ;
    }
       public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.print("Harmonic avarage of array is : ");
        System.out.printf("%.2f" , avarageHarmonic(arr));
    	    }
}