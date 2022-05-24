import java.util.Arrays;

public class DiziElemanFrekansBulma {

	public static void main(String[] args) {
        int[] dizi = {12,3,-3,-43,56,61,79,12,58,-3,76,-43,20,61,-15,-30,42,33,61,12,3,79,58,12};
        int[] frekans = new int[dizi.length];

        for (int i = 0; i < dizi.length; i++)
            frekans[i] = 1;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i != j) && (dizi[i] == dizi[j])) {
                    frekans[i]++;
                }
            }
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i != j) && (dizi[i] == dizi[j])) {
                    dizi[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(dizi));
        for (int i = 0; i < dizi.length; i++) {
            if (frekans[i] > 1) {
                if (dizi[i] != 0)
                    System.out.println(dizi[i] + "\t sayisi " + frekans[i] + " kere tekrar edildi.");
            }
        }
    }
}