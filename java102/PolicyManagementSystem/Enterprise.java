package java102.PolicyManagementSystem;

public class Enterprise extends Account{
    public Enterprise(User user) {
        super(user);
    }

    @Override
    public void addPolicy() {
        System.out.println("Sigorta Türlerimiz");
        System.out.println("""
                1- Saglık Sigortası
                2- Konut Sigortası
                3- Seyahat Sigortası
                4- Araba Sigortası""");
        System.out.print("Yapmak istediginiz sigorta türünün numarasini giriniz : ");
        String enterprise = "Enterprise";
        switch (in.nextInt()) {
            case 1:
                if (checkInsurance(new HealthInsurance(enterprise))){
                    getUser().setInsurance(new HealthInsurance(enterprise));
                    getUser().setInsuranceList(getUser().getInsurance());
                    System.out.println("Sigortaniz yapilmistir.");
                }else System.out.println("Bu sigorta sizde mevcut.");

                break;
            case 2:
                if(checkInsurance(new ResidenceInsurance(enterprise))){
                    getUser().setInsurance(new ResidenceInsurance(enterprise));
                    getUser().setInsuranceList(getUser().getInsurance());
                    System.out.println("Sigortaniz yapilmistir.");

                }else System.out.println("Bu sigorta sizde mevcut.");
                break;
            case 3:
                if(checkInsurance(new TravelInsurance(enterprise))){
                    getUser().setInsurance(new TravelInsurance(enterprise));
                    getUser().setInsuranceList(getUser().getInsurance());
                    System.out.println("Sigortaniz yapilmistir.");
                }else System.out.println("Bu sigorta sizde mevcut.");

                break;
            case 4:
                if(checkInsurance(new CarInsurance(enterprise))){
                    getUser().setInsurance(new CarInsurance(enterprise));
                    getUser().setInsuranceList(getUser().getInsurance());
                    System.out.println("Sigortaniz yapilmistir.");
                }else System.out.println("Bu sigorta sizde mevcut.");

                break;
            default:
                System.out.println("Gecersiz veri girdiniz!");
                break;
        }
    }

    private boolean checkInsurance(Insurance insurance) {
        for(Insurance i:getUser().getInsuranceList()){
            if(i.getName().equals(insurance.getName())){
                return false;
            }
        }
        return true;
    }

    @Override
    public int compareTo(Account o) {
        return this.getUser().getFirstName().compareTo(o.getUser().getFirstName());
    }
}