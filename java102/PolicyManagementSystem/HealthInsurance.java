package java102.PolicyManagementSystem;

import java.util.Date;

public class HealthInsurance extends Insurance{


    public HealthInsurance(String insuranceType) {
        super("Saglık sigortası", new Date(), new Date());
        calculate(insuranceType);
    }

    @Override
    public void calculate(String insuranceType) {
        double price=800;
        if(insuranceType.equals("Individual"))
        {
            setPrice(price);
        }
        if(insuranceType.equals("Enterprise")){
            setPrice(price*0.9);
        }
    }

}