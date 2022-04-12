import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select,result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        n1=scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2=scanner.nextInt();

        System.out.print("1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme \nİşlemi seçiniz : ");

        select=scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplama işleminin sonucu :"+n1+" + "+n2+" = "+ (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma işleminin sonucu : "+n1+" - "+n2+" = "+ (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma işleminin sonucu : "+n1+" x "+n2+" = "+ (n1*n2));
                break;
            case 4:
                System.out.println("Bölme işleminin sonucu : "+n1+" / "+n2+" = "+ (n1/n2));
                break;
        }

    }
}
