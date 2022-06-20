
import java.util.*;

public abstract class Products {

    private String name;
    private int id,discountRate,amount,ram,memory;
    private double price, screenSize;
    private Brands brand;

    static HashSet<Brands> brands = new HashSet<>();

    Scanner in = new Scanner(System.in);

    public Products(String name, int id, int discountRate, int amount, int ram, int memory,double price, double screenSize, Brands brand) {
        this.name = name;
        this.id = id;
        this.discountRate = discountRate;
        this.amount = amount;
        this.ram = ram;
        this.memory = memory;
        this.screenSize = screenSize;
        this.brand = brand;
        this.price = price;
    }
    
    public Products(){

    }
    public abstract void menu();
    public abstract void addItem();
    public abstract void getProducts();
    public abstract void deleteItem();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }
}