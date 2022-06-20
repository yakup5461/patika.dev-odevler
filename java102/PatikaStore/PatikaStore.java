
import java.util.Scanner;

public class PatikaStore {

    Scanner in = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("""
                    1 - Notebook İşlemleri
                    2 - Cep Telefonu İşlemleri
                    3 - Marka Listele
                    4 - Çıkış Yap""".indent(1));
            System.out.print("Yapmak istediğiniz işlem numarasını seçiniz : ");

            switch (in.nextInt()) {
                case 1 -> {
                    Notebooks notebook = new Notebooks();
                    notebook.menu();
                }
                case 2 -> {
                    MobilePhones mobilePhone = new MobilePhones();
                    mobilePhone.menu();
                }
                case 3 -> Brands.printBrands();
                case 4 -> {
                    System.out.println("Çıkış yapılıyor.");
                    System.exit(0);
                }
                default -> System.out.println("Yanlış değer girdiniz.");
            }
        }
    }
}