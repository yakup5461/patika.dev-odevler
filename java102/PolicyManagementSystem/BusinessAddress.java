package java102.PolicyManagementSystem;

public class BusinessAddress  implements Address {

    private final int addressId;
    private final String city;
    private final String district;
    private final String street;
    private final String addressDetails;


    public BusinessAddress(String city,String district,String street,String addressDetails){
        addressId=AddressId.id;
        this.city=city;
        this.district=district;
        this.street=street;
        this.addressDetails=addressDetails;

    }


    @Override
    public void showAddressInfo() {
        System.out.println("İs adresi :");
        System.out.println("Id : "+this.getAddressId() +"- Sehir : " + this.getCity() + ", Ilce : " + this.getDistrict() + ", Sokak  : " + this.getStreet());
        System.out.println("Detaylı Adres : " + this.getAddressDetails());
    }
    @Override
    public int hashCode()
    {
        return this.addressId;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }

        if(this.getClass().getName().equals("BusinessAddress")){
            BusinessAddress businessAddress = (BusinessAddress) obj;
            return (businessAddress.getAddressId() != this.getAddressId());
        }

        return true;
    }



    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public String getStreet() {
        return street;
    }

    public String getAddressDetails() {
        return addressDetails;
    }

    public int getAddressId() {
        return addressId;
    }

}