import java.util.Scanner;

public class cinZodyagi {
    public static void main(String[] args) {
        int dogumTarihi,sonuc;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        dogumTarihi= scanner.nextInt();
		
		scanner.close();
        String str = "Çin zodyak burcunuz: ";
        sonuc=dogumTarihi%12;
        switch (sonuc) {
            case 0 -> System.out.print(str + "Maymun");
            case 1 -> System.out.print(str + "Horoz");
            case 2 -> System.out.print(str + "Köpek");
            case 3 -> System.out.print(str + "Domuz");
            case 4 -> System.out.print(str + "Fare");
            case 5 -> System.out.print(str + "Öküz");
            case 6 -> System.out.print(str + "Kaplan");
            case 7 -> System.out.print(str + "Tavşan");
            case 8 -> System.out.print(str + "Ejderha");
            case 9 -> System.out.print(str + "Yılan");
            case 10 -> System.out.print(str + "At");
            case 11 -> System.out.print(str + "Koyun");
        }

        }
}
