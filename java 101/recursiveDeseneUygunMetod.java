import java.util.Scanner;

public class recursiveDeseneUygunMetod {
	static void Islem(int sayi,int pivot,boolean durum,int sayac){
    if(durum){
        System.out.print(sayi+" ");
        sayi-=5;
        sayac++;
        if(sayi<=0)
        {
            durum=false;
        }
        Islem(sayi,pivot,durum,sayac);
    }
    else if(durum==false){
        System.out.print(sayi+" ");
        sayi+=5;
        sayac--;
        if(sayac>=0)
            Islem(sayi,pivot,durum,sayac);

    }
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    System.out.println("Desen Olacak Sayıyı Giriniz : ");
    int sayi=scanner.nextInt();
    Islem(sayi,sayi,true,0);
    scanner.close();
}
}