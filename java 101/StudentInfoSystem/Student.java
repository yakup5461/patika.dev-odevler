package java101.StudentInfoSystem;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    Course sozluMat;
    Course sozluKimya;
    Course sozluFizik;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya, Course sozluMat, Course sozluFizik,Course sozluKimya ) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.sozluMat = sozluMat;        
        this.sozluFizik = sozluFizik;
        this.sozluKimya = sozluKimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya, int sozluMat, int sozluKimya, int sozluFizik) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (sozluMat >= 0 && sozluMat <= 100) {
            this.sozluMat.note = sozluMat;
        }
        if (sozluKimya >= 0 && sozluKimya <= 100) {
            this.sozluKimya.note = sozluKimya;
        }
        if (sozluFizik >= 0 && sozluFizik <= 100) {
            this.sozluFizik.note = sozluFizik;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.sozluMat.note == 0 || this.sozluKimya.note == 0 || this.sozluFizik.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.fizik.note * 0.8) + (this.fizik.sozluFizik * 0.2)) + ((this.mat.note * 0.8) + (this.mat.sozluMat * 0.2)) + ((this.kimya.note * 0.8) + (this.kimya.sozluKimya * 0.2))) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("============================================================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + " Matematik Sözlü Notu : " + this.sozluMat.note);
        System.out.println("Fizik Notu : " + this.fizik.note + " Fizik Sözlü Notu : " + this.sozluFizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note + " Kimya Sözlü Notu : " + this.sozluKimya.note);
    }

}
