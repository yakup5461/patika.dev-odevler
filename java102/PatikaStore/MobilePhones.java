
import java.util.ArrayList;

public class MobilePhones extends Products {

    private static int phoneId;
    private int battery,cam;
    private String colour;
    private static final ArrayList<MobilePhones> phones = new ArrayList<>();

    public MobilePhones(){

    }
    public MobilePhones(String name,  int discountRate, int amount, int ram, int memory, double price, double screenSize, Brands brand, int battery, int cam, String colour) {
        super(name, phoneId, discountRate, amount, ram, memory, price, screenSize, brand);
        this.battery = battery;
        this.cam = cam;
        this.colour = colour;
    }

    @Override
    public void menu() {
        System.out.println("""
                1-Telefon Listesini görüntüle
                2-Listeye Telefon ekle
                3-Listeden Telefon sil
                4-Telefonları id numaralarına göre sırala
                5-Telefonları markalara göre filtrele""");
        System.out.println("Lütfen yapmak istediginiz islemi seciniz : ");
        int choice =in.nextInt();
        switch (choice) {
            case 1, 4 -> getProducts();
            case 2 -> addItem();
            case 3 -> deleteItem();
            case 5 -> brandFilter();
            default -> {
            }
        }
    }

     public void print(ArrayList<MobilePhones> phoneList){
    if(phoneList==null) phoneList= phones;
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("| ID | Ürün Adı                  | Fiyatı          | Markası         | Stoğu        | İndirim Oranı      | RAM    | Ekran Boyutu      | Hafızası   | Pil Kapasitesi  | Renk           | Kamera    |");
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    for (MobilePhones n:phoneList){
        System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | %-15s | %-14s | %-9s | \n",
                n.getId(),n.getName(),n.getPrice(),n.getBrand().getName(),n.getAmount(),
                n.getDiscountRate(),n.getRam(),n.getScreenSize(),n.getMemory(),n.getBattery(),n.getColour(),n.getCam());
    }
}

    @Override
    public void addItem() {
        System.out.println("Ürünün Fiyatı : ");
        double price = in.nextDouble();
        System.out.println("Ürünün Adı : ");
        in.nextLine();
        String name = in.nextLine();
        System.out.println("Ürünün Indirim Oranı");
        int discountRate= in.nextInt();
        System.out.print("Ürünün stoğu : ");
        int amount= in.nextInt();
        System.out.print("Ürünün rami : ");
        int ram= in.nextInt();
        System.out.print("Ürünün ekranı : ");
        double screenSize= in.nextDouble();
        System.out.print("Ürünün hafızası :");
        int memory= in.nextInt();
        System.out.print("Ürünün pili : ");
        int battery= in.nextInt();
        in.nextLine();
        System.out.print("Ürünün rengi : ");
        String colour= in.nextLine();
        System.out.print("Kamera çözünürlüğü : ");
        int cam= in.nextInt();
        Brands.printBrands();
        System.out.print("Marka Seçiniz : ");
        Brands brand=Brands.getBrand(in.nextInt());
        MobilePhones phone=new MobilePhones(name,   discountRate,  amount,  ram,  memory,  price,  screenSize,  brand,  battery,  cam, colour);
        phones.add(phone);
        System.out.println("Eklenen telefonun id'si :"+phone.getId());
    }




    @Override
    public void getProducts() {
        print(null);

    }

    @Override
    public void deleteItem() {
        getProducts();
        System.out.print("Silmek istediğiniz telefonun Id numarasını giriniz : ");
        int id=in.nextInt();
        phones.remove(id-1);
        System.out.println("Güncel telefon listesi ");
        getProducts();

    }
    public void brandFilter(){
        in.nextLine();
        System.out.print("Filtrelemek istediğiniz ürün markasını giriniz :");
        String filter= in.nextLine();
        ArrayList<MobilePhones> filterPhones=new ArrayList<>();
        for (MobilePhones n:phones){
            if(filter.equals(n.getBrand().getName())){
                filterPhones.add(n);
            }
        }
        print(filterPhones);
    }


    public int getBattery() {
        return battery;
    }

    public int getCam() {
        return cam;
    }

    public String getColour() {
        return colour;
    }

}
