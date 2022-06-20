package java102.PolicyManagementSystem;


import java.util.Scanner;

public abstract class Account implements Comparable<Account> {
    protected Scanner in=new Scanner(System.in);
    private final User user;


    public Account(User user){
        this.user=user;
    }

    public void addAddress(){
        AddressManager.addAddress(this.user);
        AddressId.id++;



    }
    public void deleteAddress(){
        printAddresses();
        System.out.print("Lutfen silmek istediginiz adresin id numarasını yazın : ");
        int id=in.nextInt();
        AddressManager.deleteAddress(user,id);
    }

    public void login(String email,String password,Account account) throws InvalidAuthenticationException {
        if(account.getUser().getEmail().equals(email) && account.getUser().getPassword().equals(password)){
            AuthenticationStatus success = AuthenticationStatus.SUCCESS;
            System.out.println(success);
        }
        else{
            AuthenticationStatus fail = AuthenticationStatus.FAIL;
            throw new InvalidAuthenticationException("Hatali Giris" + fail);}
    }

    public final void showUserInfo(){
        System.out.println("Kullanici adi soyadi : "+user.getFirstName()+" "+user.getLastName());
        System.out.println("Email : "+user.getEmail()+" Meslegi : "+ user.getJob());
        System.out.println("Yas : "+ user.getAge()+" Son giris tarihi : "+ user.getLastLogin()+" Uyelik turu : "+user.getMembership());
        printInsurances();
        printAddresses();
    }
    public void printAddresses(){
        for (Address address: user.getAddressList()){
            address.showAddressInfo();
        }
    }

    public void printInsurances(){
        for(Insurance insurance: user.getInsuranceList()){
            System.out.println("Sigorta Turu : "+insurance.getName()+", Ucreti : "+ insurance.getPrice()+
                    ", Baslangıc Tarihi : "+insurance.getStartDate()+", Bitis Tarihi : "+ insurance.getFinishDate());
        }
    }

    public abstract void addPolicy();

    public User getUser() {
        return user;
    }


}