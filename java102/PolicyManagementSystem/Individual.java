package java102.PolicyManagementSystem;


public class Individual extends Account{
    public Individual(User user) {
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
        System.out.print("Yapmak istediginiz sigorta türünün numarasını giriniz : ");
        String individual = "Individual";
        int i = in.nextInt();
        if (i == 1) {
            if (checkInsurance(new HealthInsurance(individual))) {
                getUser().setInsurance(new HealthInsurance(individual));
                getUser().setInsuranceList(getUser().getInsurance());
                System.out.println("Sigortanız yapilmistir.");
            } else System.out.println("Bu sigorta sizde mevcut.");
        } else if (i == 2) {
            if (checkInsurance(new ResidenceInsurance(individual))) {
                getUser().setInsurance(new ResidenceInsurance(individual));
                getUser().setInsuranceList(getUser().getInsurance());
                System.out.println("Sigortanız yapilmistir.");

            } else System.out.println("Bu sigorta sizde mevcut.");
        } else if (i == 3) {
            if (checkInsurance(new TravelInsurance(individual))) {
                getUser().setInsurance(new TravelInsurance(individual));
                getUser().setInsuranceList(getUser().getInsurance());
                System.out.println("Sigortanız yapilmistir.");
            } else System.out.println("Bu sigorta sizde mevcut.");
        } else if (i == 4) {
            if (checkInsurance(new CarInsurance(individual))) {
                getUser().setInsurance(new CarInsurance(individual));
                getUser().setInsuranceList(getUser().getInsurance());
                System.out.println("Sigortanız yapilmistir.");
            } else System.out.println("Bu sigorta sizde mevcut.");
        } else {
            System.out.println("Gecersiz veri girdiniz!");
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