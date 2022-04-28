package java101.StudentInfoSystem;

public class Main {

    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course sozluMat=new Course("Matematik Sözlü","MSZL101","MSZL");
        Course soluFizik=new Course("Fizik Sözlü","FSZL101","FSZL");
        Course sozluKimya=new Course("Kimya Sözlü","KSZL101","KSZL");

        Teacher t1 = new Teacher("Mahmut Hoca", "05421452369", "MAT");
        Teacher t2 = new Teacher("Ahmet Babayiğit","05557895623", "FZK");
        Teacher t3 = new Teacher("Bilal Sonses", "05325203020", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Tulum Hayri", 4, "1234567890", mat, fizik, kimya,sozluMat,soluFizik,sozluKimya);
        s1.addBulkExamNote(80,50,66,29,79,61);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "1234567891", mat, fizik, kimya,sozluMat,soluFizik,sozluKimya);
        s2.addBulkExamNote(85,75,40,65,65,50);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "1234567892", mat, fizik, kimya,sozluMat,soluFizik,sozluKimya);
        s3.addBulkExamNote(95,70,40,75,65,45);
        s3.isPass();

    }
}
