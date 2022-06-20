

import java.util.TreeSet;

import java.util.*;

public class Brands {
    private final int id;
    private String name;
    private static TreeSet<Brands> brandList=new TreeSet<>(new Comparator<Brands>() {
        @Override
        public int compare(Brands b1, Brands b2) {
            return b1.getName().compareTo(b2.getName());
        }
    });

    static {
        createBrands();
    }

    public Brands(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void createBrands(){
        brandList.add(new Brands(1,"Samsung"));
        brandList.add(new Brands(2,"Lenovo"));
        brandList.add(new Brands(3,"Apple"));
        brandList.add(new Brands(4,"Huawei"));
        brandList.add(new Brands(5,"Casper"));
        brandList.add(new Brands(6,"Asus"));
        brandList.add(new Brands(7,"HP"));
        brandList.add(new Brands(8,"Xiaomi"));
        brandList.add(new Brands(9,"Monster"));
    }

    public static void printBrands() {
        System.out.println("Marka Listesi ");
        for (Brands brand : brandList) {
            System.out.println(brand.id + " " + brand.getName());
        }
        System.out.println("----------------------------");
    }

    public static Brands getBrand(int id){
        for(Brands b:brandList){
            if(id==b.getId()){
                return b;
            }
        }
        return null;
    }
}