import java.util.Scanner;
public class recursiveUsAlma {
static int araSayi=1,sonuc,taban,us;
static Scanner scn= new Scanner(System.in);

static int recursiveUsAlmaMetdod(int a,int b){
	if (b==0)
	return 1;
	else if(a==1)
	return 1;
	else
	return taban*recursiveUsAlmaMetdod(a, (b-1));
}

public static void main(String[] args) {
	System.out.println("Üs Alma İşlem için Taban sayıyısını giriniz :");
	taban=scn.nextInt();	
	System.out.println("Üs Alma İşlem için Kuvvet sayıyı giriniz :");
	us=scn.nextInt();
	sonuc = recursiveUsAlmaMetdod(taban,us);
	System.out.println(taban+" Üzeri "+us+" : "+sonuc);
}
}