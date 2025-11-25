/* Onemli not :
private → dış sınıflar direkt erişemez, getter/setter ile erişim sağlanır.
default → aynı paket içinden direkt erişim mümkün.
public → her yerden direkt erişim mümkün.
 */

public class Student {
    String name, stuNo;
    String classes;
    Course c1; // Course sinifindaki note lara erismek icin boyle yaptik
    Course c2;
    Course c3;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;

    }

    // Ogrencilere note girilmesine yarayan davranis method (func)
    void examNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1; // burda erisebiliyoruz Course icindeki note'a
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2; // burda erisebiliyoruz Course icindeki note'a
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3; // burda erisebiliyoruz Course icindeki note'a
        }
    }

    void oralNote(int not1, int not2, int not3) {
        if (not1 >= 0 && not1 <= 100) {
            this.c1.oralNote = not1; // burda erisebiliyoruz Course icindeki note'a
        }
        if (not2 >= 0 && not2 <= 100) {
            this.c2.oralNote = not2; // burda erisebiliyoruz Course icindeki note'a
        }
        if (not3 >= 0 && not3 <= 100) {
            this.c3.oralNote = not3; // burda erisebiliyoruz Course icindeki note'a
        }

    }

    void addNote(int note1, int note2, int note3, int not1, int not2, int not3) {
        examNote(note1, note2, note3);
        oralNote(not1, not2, not3);
    }
    void calcAverage() {
        this.average = ((this.c1.note * 0.80 + this.c1.oralNote * 0.20 + this.c2.note * 0.80 + this.c2.oralNote * 0.20 + this.c3.note * 0.80 + this.c3.oralNote * 0.20)) / 6.0;
    }

    void isPass() {
        System.out.println("=====================");
        if (this.average > 55) {
            System.out.println("Sinifi gectiniz! ");
//            this.isPass = true; // ileride ispass kulaancaksak burayi acmak gerekir ekrana bastirmada sorun olmaz
        } else {
            System.out.println("Sinifta kaldiniz! ");
//            this.isPass = false;
        }
        calcAverage();
        printNote();
    }


    void printNote() {
        System.out.println(this.c1.name + " Notu \t:" + this.c1.note);
        System.out.println(this.c2.name + " Notu \t:" + this.c2.note);
        System.out.println(this.c3.name + " Notu \t:" + this.c3.note);
        System.out.println("=============== Sozlu Notlari ===============");
        System.out.println(this.c1.name + " Notu \t:" + this.c1.oralNote);
        System.out.println(this.c2.name + " Notu \t:" + this.c2.oralNote);
        System.out.println(this.c3.name + " Notu \t:" + this.c3.oralNote);
        System.out.println("Oratalamaniz: " + this.average);

    }
}
