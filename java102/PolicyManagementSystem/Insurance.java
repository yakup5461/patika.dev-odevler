package java102.PolicyManagementSystem;


import java.util.Date;

public abstract class Insurance {
    private final String name;
    private double price;
    private final Date startDate;
    private final Date finishDate;

    public abstract void calculate(String insuranceType);

    public Insurance(String name,Date startDate,Date finishDate){
        this.name=name;
        this.startDate=startDate;
        this.finishDate=finishDate;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

}
