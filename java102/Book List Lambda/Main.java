import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Main {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book("Hayvan Çiftligi",185,"George Orwel" , new Date(System.currentTimeMillis()) ));
		books.add(new Book("Şeker Portakalı",296,"Jose Mauro De Vasconcelos" , new Date(System.currentTimeMillis()) ));
		books.add(new Book("Kürk Mantolu Madonna",212,"Sabahattin Ali" , new Date(System.currentTimeMillis()) ));
		books.add(new Book("Sırça Köşk",146,"Sabahattin Ali" , new Date(System.currentTimeMillis()) ));
		books.add(new Book("Gece Yarısı Kütüphanesi",283,"Matt Haig" , new Date(System.currentTimeMillis()) ));
		books.add(new Book("Zeytindağı",176,"Falih Rıfkı Atay" , new Date(System.currentTimeMillis()) ));
		books.add(new Book("Simyacı",184,"Paulo Coelho" , new Date(System.currentTimeMillis()) ));
		books.add(new Book("Fareler ve İnsanlar",111,"John Steinbeck" , new Date(System.currentTimeMillis()) ));
		books.add(new Book("Saatleri Ayarlama Enstitüsü",382,"Ahmet Hamdi Tanpınar" , new Date(System.currentTimeMillis()) ));
		books.add(new Book("1984",350,"George Orwel" , new Date(System.currentTimeMillis()) ));
		
		Map<String, String> booksMap = new HashMap<>();
		
		books.forEach(i->{
			booksMap.put(i.getBookName(),i.getAuthorName());
        });
		
		 ArrayList<Book> pageSizeOneHundredBooks = new ArrayList<>();

	        books.stream().forEach(i -> {
	            if (i.getPageNum() > 100){
	                pageSizeOneHundredBooks.add(i);
	            }
	        });
	        
	        System.out.println("===================================================");
		
		for(int i=0; i<books.size();i++) {
			booksMap.put(books.get(i).BookName, books.get(i).AuthorName);
		}
		
		
		
	}
	
}
