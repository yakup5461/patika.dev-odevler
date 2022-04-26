import java.util.Scanner;

	public class EBOB_EKOK {
	    public static void main(String[] args) {
	        int ebob = 0, ekok = 0;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("ilk sayısını giriniz: ");
	        int n1 = scanner.nextInt();
	        System.out.print("ikici sayısını giriniz: ");
	        int n2 = scanner.nextInt();
	        scanner.close();
	        // ilk sayı daha büyükse yer değiştirme
	        if (n1 > n2) {
	            int pivot = n1;
	            n1 = n2;
	            n2 = pivot;
	        }

	        int k = 1;
	        while (k != n1) {
	            if ((n1 % k == 0) && (n2 % k == 0)) {
	                ebob = k;
	            }
	            k++;
	        }

	        int j = 1;
			int max=n1*n2;
	        while (max >= j) {
	            if ((j % n1 == 0) && (j % n2 == 0)) {
	                ekok = j;
	                break;
	            }
	            j++;
	        }
	        System.out.println("EBOB: " + ebob);
	        System.out.println("EKOK: " + ekok);
	    }
	}