import java.util.Scanner;

public class Fibonacci {
	    public static void main(String[] args) {
	        int n, pivot1 = 0, pivot2 = 1, pivot3;
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Bir sayı giriniz: ");
	        n = scanner.nextInt();
	        scanner.close();

	        System.out.print("0 1");
	        for (int i = 1; i < n; i++) {
	            pivot3 = pivot1 + pivot2;
	            System.out.print(" " + pivot3);
	            pivot1 = pivot2;
	            pivot2 = pivot3;
	        }
	    }
	}