package java102.PolicyManagementSystem;

import java.util.Scanner;

public class LoginSystem {
    Scanner scanner=new Scanner(System.in);
    AccountManager accountManager=new AccountManager();
    public void login(){
        System.out.println("Sisteme hosgeldiniz.");
        System.out.print("Email giriniz : ");
        String email=scanner.nextLine();
        System.out.print("Sifre giriniz : ");
        String password=scanner.nextLine();
        Account loginAccount = accountManager.login(email,password);
        if(loginAccount!=null){
            loginAccount.showUserInfo();
            run(loginAccount);
        }
        else System.out.println("Gecersiz kullanıcı");

    }
    private void run(Account account){
        while (true){
            System.out.println("İslem listesi");
            System.out.println("""
                    1- Kullanici bilgilerini göster
                    2- Kullaniciya yeni poliçe yap
                    3- Kullaniciya yeni adres ekle
                    4- Kullanici adresi sil
                    9- Programdan cikiş yap.""");
            System.out.print("Yapmak istediginiz islem numarasını yazın : ");
            int value=scanner.nextInt();
            switch (value) {
                case 1 -> account.showUserInfo();
                case 2 -> account.addPolicy();
                case 3 -> account.addAddress();
                case 4 -> account.deleteAddress();
                case 9 -> System.exit(0);

            }
        }
    }
}