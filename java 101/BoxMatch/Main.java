package java101.BoxMatch;

public class Main {
    public static void main(String[] args) {
        Fighter Mike = new Fighter("Mike Tyson", 15, 10, 93,91);
        Fighter Vitali = new Fighter("Vitali Klistchko", 17,8,92,90);
        Ring boxing = new Ring(Mike, Vitali);
        boxing.run();
    }
}
