import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int ay, gun;
        String burc = "";
        boolean hata = false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğduğunuz ay(sayıyla): ");
        ay = scanner.nextInt();
        System.out.print("Doğduğunuz gün(sayıyla): ");
        gun = scanner.nextInt();
/*
        switch (ay) {
            case 1:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        burc = "Oğlak";
                    } else burc = "Kova";
                } else hata = true;
                break;
            case 2:
                if (gun >= 1 && gun <= 28) {
                    if (gun < 20) {
                        burc = "Kova";
                    } else burc = "Balık";
                } else hata = true;
                break;
            case 3:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 21) {
                        burc = "Balık";
                    } else burc = "Koç";
                } else hata = true;
                break;
            case 4:
                if (gun >= 1 && gun <= 30) {
                    if (gun < 21) {
                        burc = "Koç";
                    } else burc = "Boğa";
                } else hata = true;
                break;
            case 5:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        burc = "Boğa";
                    } else burc = "İkizler";
                } else hata = true;
                break;
            case 6:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23) {
                        burc = "İkizler";
                    } else burc = "Yengeç";
                } else hata = true;
                break;
            case 7:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23) {
                        burc = "Yengeç";
                    } else burc = "Aslan";
                } else hata = true;
                break;
            case 8:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23) {
                        burc = "Aslan";
                    } else burc = "Başak";
                } else hata = true;
                break;
            case 9:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23) {
                        burc = "Başak";
                    } else burc = "Terazi";
                } else hata = true;
                break;
            case 10:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23) {
                        burc = "Terazi";
                    } else burc = "Akrep";
                } else hata = true;
                break;
            case 11:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        burc = "Akrep";
                    } else burc = "Yay";
                } else hata = true;
                break;
            case 12:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        burc = "Yay";
                    } else burc = "Oğlak";
                } else hata = true;
                break;
            default:
                hata = true;

        }
*/

        // İFLER İLE ÖDEV
        if (ay == 1) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) {
                    burc = "Oğlak";
                } else burc = "Kova";
            } else hata = true;
        }else if(ay==2){
            if (gun >= 1 && gun <= 28) {
                if (gun < 20) {
                    burc = "Kova";
                } else burc = "Balık";
            } else hata = true;
        }else if(ay==3){
            if (gun >= 1 && gun <= 31) {
                if (gun < 21) {
                    burc = "Balık";
                } else burc = "Koç";
            } else hata = true;
        }else if(ay==4){
            if (gun >= 1 && gun <= 30) {
                if (gun < 21) {
                    burc = "Koç";
                } else burc = "Boğa";
            } else hata = true;
        }else if(ay==5){
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) {
                    burc = "Boğa";
                } else burc = "İkizler";
            } else hata = true;
        }else if(ay==6){
            if (gun >= 1 && gun <= 31) {
                if (gun < 23) {
                    burc = "İkizler";
                } else burc = "Yengeç";
            } else hata = true;
        }else if(ay==7){
            if (gun >= 1 && gun <= 31) {
                if (gun < 23) {
                    burc = "Yengeç";
                } else burc = "Aslan";
            } else hata = true;
        }else if(ay==8){
            if (gun >= 1 && gun <= 31) {
                if (gun < 23) {
                    burc = "Aslan";
                } else burc = "Başak";
            } else hata = true;
        }else if(ay==9){
            if (gun >= 1 && gun <= 31) {
                if (gun < 23) {
                    burc = "Başak";
                } else burc = "Terazi";
            } else hata = true;
        }else if(ay==10){
            if (gun >= 1 && gun <= 31) {
                if (gun < 23) {
                    burc = "Terazi";
                } else burc = "Akrep";
            } else hata = true;
        }else if(ay==11){
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) {
                    burc = "Akrep";
                } else burc = "Yay";
            } else hata = true;
        }else if(ay==12){
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) {
                    burc = "Yay";
                } else burc = "Oğlak";
            } else hata = true;
        }
        System.out.println(hata ? "Hatalı tarih girdiniz" : ("Burcunuz: " + burc));

    }
}
