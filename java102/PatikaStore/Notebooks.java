

import java.util.ArrayList;

public class Notebooks extends Products {

    private static int notebookId;
    private static final ArrayList<Notebooks> notebooks = new ArrayList<>();

    public Notebooks(String name,  int discountRate, int amount, int ram, int memory,double price, double screenSize, Brands brand) {
        super(name, notebookId, discountRate, amount, ram, memory,price, screenSize, brand);
        notebookId++;
    }
    public Notebooks(){

    }

    @Override
    public void menu() {
        System.out.println("""
                1-Notebook Listesini görüntüle
                2-Listeye Notebook ekle
                3-Listeden Notebook sil
                4-Listeyi id numaralarına göre sırala
                5-Listeyi markalara göre filtrele""");
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

    @Override
    public void addItem() {
        System.out.println("Ürünün Fiyatı : ");
        double price = in.nextDouble();
        System.out.println("Ürünün Adı : ");
        in.nextLine();
        String name = in.nextLine();
        System.out.println("Ürünün indirim oranı :% ");
        int discountRate=in.nextInt();
        System.out.println("Ürünün Stok Bilgisi : ");
        int amount = in.nextInt();
        System.out.println("Ürünün Ram Bilgisi : ");
        int ram = in.nextInt();
        System.out.println("Ürünün Ekran Boyutu : ");
        double screenSize = in.nextDouble();
        System.out.println("Ürünün Hafıza Bilgisi : ");
        int memory = in.nextInt();
        Brands.printBrands();
        System.out.println("Lütfen Marka Secimini Yapınız : ");
        Brands brand = Brands.getBrand(in.nextInt());
        Notebooks notebook = new Notebooks(name,discountRate,amount,ram,memory,price,screenSize,brand);
        notebooks.add(notebook);
        System.out.println("Eklenen Notebook'un Id'si :"+notebook.getId());

    }

    @Override
    public void getProducts() {
        print(null);

    }

    @Override
    public void deleteItem() {
        getProducts();
        System.out.println("Silmek istediginiz Notebook'un Id Numarasını giriniz : ");
        int id = in.nextInt();
        notebooks.remove(id-1);
        System.out.println("Güncellenmis Notebook Listesi");
        getProducts();

    }
        private void brandFilter() {
            in.nextLine();
            System.out.print("Filtrelemek istediğiniz ürün markasını giriniz :");
            String filter= in.nextLine();
            ArrayList<Notebooks> filterNotebooks=new ArrayList<>();
            for (Notebooks n:notebooks){
                if(filter.equals(n.getBrand().getName())){
                    filterNotebooks.add(n);
                }
            }
            print(filterNotebooks);
        }

    private void print(ArrayList<Notebooks> filterNotebooks) {
        if (filterNotebooks==null)filterNotebooks= notebooks;
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                  | Fiyatı          | Markası         | Stoğu        | İndirim Oranı      | RAM    | Ekran Boyutu      | Hafızası   |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Notebooks n:filterNotebooks){
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | \n",
                    n.getId(),n.getName(),n.getPrice(),n.getBrand().getName(),n.getAmount(),
                    n.getDiscountRate(),n.getRam(),n.getScreenSize(),n.getMemory());
        }
    }

}