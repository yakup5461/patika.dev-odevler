import java.util.Calendar;

public class Employee {
    String employeeName;
    double baseSalary,salary,tax=0.0;
    int workHours;
    int contractYear;
    int currentYear;

    //isci sınıımızın yapıcı metodu
    public Employee(String employeeName, double salary, int workHours, int contractYear) {
        this.employeeName = employeeName;
        this.baseSalary=salary;
        this.salary = salary;
        this.workHours = workHours;
        this.contractYear = contractYear;
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    // Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
    public void bonus() {
        if (this.workHours > 40) {
            this.salary += (this.workHours - 40) * 30;
        }
    }

    //Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
    public void raiseSalary() {
        if (this.currentYear - this.contractYear < 10) {
            this.salary *= 1.05;
        } else if (this.currentYear - this.contractYear < 20) {
            this.salary *= 1.1;
        } else {
            this.salary *= 1.15;
        }
    }

    //1000 tl den fazla maaşa uygulanan vergiyi hesaplıyoruz. %0,3 uyguluyoruz
    public void tax() {
        if (this.salary > 1000) {
            tax=this.salary*0.03;
            this.salary *= 0.97;
        }
    }

    //işçi bilgilerini yazdırıyoruz.
    public void printEmployee() {
        System.out.println("--------------------------------------------------");
        System.out.println("Adı \t\t: " + this.employeeName);
        System.out.println("Maaşı \t\t: " + this.baseSalary);
        System.out.println("Çalışma Saati\t: " + this.workHours);
        System.out.println("Başlangıç Yılı\t: " + this.contractYear);
        System.out.println("Vergi\t\t: " + (int)this.tax);
        System.out.println("Bonus\t\t: " + (int)(this.salary-this.baseSalary+this.tax));//maaşta vergi çıktığı için tekrar eklendi.
        System.out.println("Maaş Artışı\t: " +(int)( this.salary-this.baseSalary));
        System.out.println("Toplam Maaş\t: " + (int)(this.salary+this.tax));
        System.out.println("Vergiler çıktıktan sonra bonuslu maaş: " + (int)(this.salary));        
        
    }

    public void newYear() {
        this.bonus();
        this.raiseSalary();
        this.tax();
        this.printEmployee();
    }
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Kemal", 2000, 45, 1985);
        Employee emp2 = new Employee("Yaşar USTA", 2000, 55, 2019);

        emp1.newYear();
        emp2.newYear();
	}

}
/* örnek  istenen çıktı
Adı : kemal
Maaşı : 2000.0
Çalışma Saati : 45
Başlangıç Yılı : 1985
Vergi : 60.0
Bonus : 150.0
Maaş Artışı : 300.0
Toplam Maaş : 2300.0
Vergi ve Bonuslar ile birlikte maaş : 2090.0
*/