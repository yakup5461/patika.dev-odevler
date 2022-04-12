package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class DaireninAlanVeCevresi {
    public static void main(String[] args) {

        int r;
        double alan, cevre, pi = 3.14 ;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yarıçapı girniz : ");
        r = scanner.nextInt();

        alan = pi * Math.pow(r, 2);
        cevre = 2 * pi * r;

        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi : " + cevre);

    }
}
