import java.util.Scanner;

public class MainClassStudentSystem {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "555");

        Teacher t2 = new Teacher("Isaac Newton", "FZK", "0001");

        Teacher t3 = new Teacher("Cahit Arf", "MAT", "111");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course mat = new Course("Matematik", "103", "MAT");
        mat.addTeacher(t3);

        Student s1 = new Student("Tunahan", "21", "131", tarih, fizik, mat);
        // Student nesnesinden Student Classinin davranisini kullanmak icin s1 den sonra s1. yaptik

        s1.addNote(100,100,100,100,10,100);
        s1.isPass();

        Student s2 = new Student("Ahmet", "13", "131", tarih, fizik, mat);

        s2.addNote(100,30,70,20,30,90);
        s2.isPass();


    }
}
