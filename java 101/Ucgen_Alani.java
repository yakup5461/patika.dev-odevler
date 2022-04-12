package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class UcgenAlani {
    public static void main(String[] args) {
        int a, b, c;
        double alan, u;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üçgenin 1. kenarını giriniz : ");
        a = scanner.nextInt();
        System.out.print("Üçgenin 2. kenarını giriniz : ");
        b = scanner.nextInt();
        System.out.print("Üçgenin 3. kenarını giriniz : ");
        c = scanner.nextInt();

        u = (a + b + c) / 2f;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı : " + alan);
    }
}
