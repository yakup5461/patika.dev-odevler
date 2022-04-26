import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        String username, password;
        int right = 3;
        int select, price, balance = 61;
        Scanner scanner = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            username = scanner.nextLine();
            System.out.print("Şifreniz : ");
            password = scanner.nextLine();

            if (username.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz bankasına hoşgelsiniz!");

                do {
                    System.out.println("\nLütfen yapmak istediğiniz işlemi seçiniz.");
                    System.out.println("1-Para Yatırma\n"
                    				 + "2-Para Çekme\n"
                    				 + "3-Bakiye Sorgulama\n"
                    				 + "4-Çıkış Yap");
                    System.out.print("Seçiminiz: ");
                    select = scanner.nextInt();
                    switch (select) {
                        case 1 -> {
                            System.out.print("Yatırılacak para miktarını giriniz: ");
                            price = scanner.nextInt();
                            balance += price;
                        }
                        case 2 -> {
                            System.out.print("Çekilecek para miktarını giriniz: ");
                            price = scanner.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }

                        }
                        case 3 -> System.out.println("Bakiyeniz: " + balance);

                    }
                } while (select == 1 || select == 2 || select == 3);
                System.out.println("Görüşmek üzere");
                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("------------------");
                    System.out.println("Hesabınız bloke olmuştur");
                } else {
                    System.out.println("------------------");
                    System.out.println("Hatalı kullanıcı adı ve şifre. Tekrar deneyiniz.");
                    System.out.println("Kalan Hakkınız: " + right);
                	}
            	}
        }
        scanner.close();
    }
}