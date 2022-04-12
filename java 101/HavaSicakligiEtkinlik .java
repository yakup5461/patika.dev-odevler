import java.util.Scanner;

public class HavaSicakligiEtkinlik {
    public static void main(String[] args) {
        int heat;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz : ");
        heat = scanner.nextInt();
/*
        if (heat < 5) {
            System.out.println("Kayak");
        } else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("Sinema");
            }
            if (heat >= 10) {
                System.out.println("Piknik");
            } else {
                System.out.println("Yüzme");
            }
        }
 */
        /*
        İF KULLANMADAN YAP
        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        */
        switch ((heat < 5) ? 0 : (heat < 15) ? 1 : (heat <= 25) ? 2 : 3) {
            case 0 -> System.out.println("Kayak");
            case 1 -> System.out.println("Sinema");
            case 2 -> System.out.println("Piknik");
            case 3 -> System.out.println("Yüzme");
        }

    }
}
