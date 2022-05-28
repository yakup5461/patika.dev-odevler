import java.util.Scanner;

public class MineSweeper {
	private char[][] map;
	private char[][] ui;
	private long start,stop;
	private int row,column;
	private int openedCellCount;
	private int cleanCellCount;//tüm hücrelerden bomba konulanlar çıkartılınca kalan miktar.
	Scanner scan = new Scanner(System.in);
	
	public MineSweeper() {
		info();
		MineSweeper ms = new MineSweeper(row,column);
		run(ms);
		}
	
	private MineSweeper(int row, int column) {
	
		start = System.currentTimeMillis();
		map = new char[row][column];
		ui = new char[row][column];
		fillUI();
		printUI();
		calculateMap();
		openedCellCount = 0;
	}
	
	private Integer checkIntInput (String txt) {
		try {
		return Integer.parseInt(txt);
		} catch (Exception ex) {
		return 1461;}
		}
	
	private void info() {
	
		try {
		System.out.println("Mayin Tarlasi Oyununa Hoşgeldiniz !");
		System.out.println("Amacımız Mayın Olmayan Yerlerin Tamamını Açmak !");
		System.out.println("Ne kadar büyük bir haritada oynamak istiyorsunuz?");
		
		System.out.print("Satir sayisi giriniz : ");
		row = scan.nextInt();
		
		System.out.print("Sütun sayisi giriniz : ");
		column = scan.nextInt();
		System.out.println("===================================");
		
		}catch (Exception e) {//Yanlış Karakter Hatasını yakalayıp kullanıcıya bildiriyoruz.
				System.out.println("Lütfen rakam giriniz!");
				String txt =scan.next();
				
				while ((checkIntInput(txt)) == 1461)  {
				System.err.println("girdi: " +txt);
				break;
				}
				info();
		}//catch blok kapaması
		} //info metod kapaması

	private void fillUI() {
		for(int i=0; i<ui.length; i++) {
			for (int j = 0; j < ui[0].length; j++) {
				ui[i][j] = '-';
			}
		}
	}

	private void printUI() {
		for(int i=0; i<ui.length; i++) {
			for (int j = 0; j < ui[0].length; j++) {
				System.out.print(ui[i][j] + " ");
			}
			System.out.println();
		}
	}

	private void calculateMap() {
		int bombCount = (map.length * map[0].length) / 4;
		cleanCellCount = (map.length * map[0].length) - bombCount;

		for (int i = 0; i < bombCount; i++) {
			placeBomb();//mayın dolduruyoruz.
		}

		for(int i=0; i<map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				if(map[i][j] == '*' )
					continue;
				calcCell(i, j);//mayın sayılarını hesaplayıp hücrelere yazıyoruz.
			}
		}
	}

	private void placeBomb() {
		int row = (int) (Math.random() * map.length); 
		int column = (int) (Math.random() * map[0].length); 
		if(map[row][column] == '*') {//hücrenin içini kontrol ediyor ve if e giriyor.
			placeBomb();//eğer hücrede mayın varsa recursive olarak metodu tekrarlıyor.
			return;
		}

		map[row][column] = '*';//eğer hücrede mayın yoksa mayın basıyor.
	}

	private void calcCell(int row, int column) {
		int value = 0;
		for(int i=row-1; i<=row+1; i++) {//satırların altını ve üstünü kontrol ediyoruz.
			if (i < 0 || i >= map.length)//satırların dizi dışına taşıp taşmadığını kontrol ediyoruz.
				continue;

			for(int j=column-1; j<=column+1; j++) {//sutunların  altını ve üstünü kontrol ediyoruz.
				if(j < 0 || j >= map[0].length)//sutunların dizi dışına taşıp taşmadığını kontrol ediyoruz.
					continue;

				if(map[i][j] == '*')//satır ve sutunları kontrol ediyoruz.
					value++;		//varsa mayınları sayıyoruz.
			}//ilk for döngüsü kapaması
		}//ikinci or döngüsü kapaması
		map[row][column] = Character.forDigit(value,10);//map dizisine '*' karakterini yani mayın sayısının rakam olarak karaktere çevirip yazıyoruz.
	}

	private boolean openCell(int row, int column) {//oyunun girilen değerlerini
		try {
			//kodu kontrol edebilmek için mayın tarlasını yazdırıyoruz.
			ui[row][column] = map[row][column];
			printUI();
			System.out.println("===================================");

			if(map[row][column] == '*') {//mayına denk gelirsek oyunu bitiriyoruz.
				for(int i=0;i<100000;i++) {/*biraz gecikme yapması için game over yazısını geciktirmek için*/}
				System.err.println("Game Over!!!");//err den yazmamızın amacı yazı kırmızı olması için
				System.out.println();
				return false;
				}//if kapaması

			openedCellCount++;
			if (openedCellCount == cleanCellCount) {//tüm mayın olmayan hücreleri bulunca oyunu kazandığını yazdırıyoruz.
				System.out.println("Tebrikler Oyunu Kazandınız !");
				return false;
				}//if kapaması
			return true;

		} catch (ArrayIndexOutOfBoundsException e) {//sınır aşım hatasını yakalayıp kullanıcıya bildiriyoruz.
			System.err.println("Lütfen sınırlar içinde bir değer giriniz!");
			System.err.println("Satır Sayısı "+map.length+" Sutun Sayısı "+map[0].length);
			return true;
		}//catch blok kapaması
		catch (Exception e) {//Yanlış Karakter Hatasını yakalayıp kullanıcıya bildiriyoruz.
			System.err.println("Lütfen doğru karakteri giriniz!");
			return true;
		}//catch blok kapaması
	}//metod kapaması

	private boolean fillMarkUI(int row, int column) {
		try {
		ui[row][column]='$';
		printUI();
		return true;
		} catch (ArrayIndexOutOfBoundsException e) {//sınır aşım hatasını yakalayıp kullanıcıya bildiriyoruz.
			System.err.println("Lütfen sınırlar içinde bir değer giriniz!");
			System.err.println("Satır Sayısı "+map.length+" Sutun Sayısı "+map[0].length);
			return true;
		}//catch blok kapaması
		catch (Exception e) {//Yanlış Karakter Hatasını yakalayıp kullanıcıya bildiriyoruz.
			System.err.println("Lütfen doğru karakteri giriniz!");
			return true;
		}//catch blok kapaması
	}//illMarkUI metod kapaması
	
	public void printMap() {//dolu haritayı yazdırıyoruz.
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===================================");
	}
	
	public void printTime() {
		stop= System.currentTimeMillis();
		int minute=(int)((stop-start)/1000)/60;
		int second=(int)((stop-start)/1000)%60;
		System.out.println("Oyunda Geçirdiğiniz Süre : "+ minute+" Dakika  "+second+" Saniyedir");
	}
	
	public void run(MineSweeper ms) {
		
		while(true) {
			System.out.println("Mayını İşaretlemek için '+' giriniz !");
			System.out.println("Harita Hücresi Açmak için '-' giriniz !");
			String choice =scan.next();
			if(choice.equals("+")) {
				System.out.println("Satır ve Sutunlar 1'den başlamaktadır.");
				System.out.print("Satir giriniz : ");
				row = (-1)+checkIntInput(scan.next());
				System.out.print("Sütun giriniz : ");
				column =(-1)+ checkIntInput(scan.next());
				if(!ms.fillMarkUI(row, column)) {
					break;}
			}
			else if(choice.equals("-")) {
			System.out.println("Satır ve Sutunlar 1'den başlamaktadır.");
			System.out.print("Satir giriniz : ");
			row = (-1)+checkIntInput(scan.next());
			System.out.print("Sütun giriniz : ");
			column =(-1)+checkIntInput(scan.next());
			if(!ms.openCell(row, column))
				break;
			} else {
				System.err.println("yanlış seçim yaptınız ! Lütfen '-' veya '+' giriniz ! ");
				System.out.println("===================================");
			}
			}
		System.out.println("===================================");
		ms.printMap(); 
		ms.printTime();
		scan.close();
	}
	
	public void thanks() {
		System.out.println("Oyunumuzu Oynadığınz İçin Teşekkürler !!");
		}
	}