package java102.PolicyManagementSystem;


import java.util.ArrayList;
import java.util.Date;

public class User {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
    private final String job;
    private final int age;
    private final String membership;
    private final ArrayList<Address> addressList=new ArrayList<>();
    private final Date lastLogin;
    private Insurance insurance;
    private final ArrayList<Insurance> insuranceList=new ArrayList<>();

    public User(String firstName,String lastName,String email,String password,String job,int age,Address address,String membership){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.password=password;
        this.job=job;
        this.age=age;
        this.addressList.add(address);
        this.lastLogin =new Date(System.currentTimeMillis());
        this.membership=membership;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(Address addressList) {
        this.addressList.add(addressList);
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(Insurance insurance) {
        this.insuranceList.add(insurance);
    }

    public String getMembership(){
        return this.membership;
    }
}
