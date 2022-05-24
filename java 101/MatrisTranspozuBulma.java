

import java.util.Scanner;

public class MatrisTranspozuBulma {
	static Scanner scn=new Scanner (System.in);
	static int x,y;
public static void main (String arg[]) {
	System.out.print("kaç satırlık matris oluşturmak istiyorsanız giriniz :");
	x=scn.nextInt();
	System.out.print("kaç sutunluk matris oluşturmak istiyorsanız giriniz :");
	y=scn.nextInt();
	int matris1[][]=new int[x][y];
	int matris2[][]=new int[y][x];
	for(int i =0;i<x;i++) {
		for(int j=0;j<y;j++) {
			System.out.print(i+"\t satır "+j+"\t sutun için sayı giriniz :");
			matris1[i][j]=scn.nextInt();
		}}//dizimizi oluşturduk.iki for döngü kapama

		for(int k=0;k<y;k++) {
			for(int l=0;l<x;l++) {
				matris2[k][l]=matris1[l][k];
			}}//transpoz atama aptık  ve 2 tane for döngüsünü kapadık
		
	System.out.println("matris 	:");//matrisi yazdırıyoruz
	for(int i=0;i<x;i++) {
		for(int j=0;j<y;j++) {
		System.out.print(matris1[i][j]+"\t");	
		}
		System.out.println("");
	}
	System.out.println("Transpozu 	:");//transpozu yazdırıyoruz
	for(int i=0;i<y;i++) {
		for(int j=0;j<x;j++) {
		System.out.print(matris2[i][j]+"\t");	
		}
		System.out.println("");
		}
	}
}