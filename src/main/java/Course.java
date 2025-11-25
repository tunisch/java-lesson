public class Course {
    Teacher teacher; // Teacher sinifinin teacher niteligi
    String name;
    String code;
    String prefix;
    // default / package-private ayni package icinde yani java package da o yuzden erisilebilri "." ile !!
    int note;
    int oralNote;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int oralNote = 0;
    }

    void addTeacher(Teacher teacher) {
        // Stringlerde esitleme (=) -> .equals(esitlenecek ifade ) ile yapilis
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
//            printTeacher(); // ogretmenleri ekrana basar
        } else {
            System.out.println("Ogretmen ve ders bolumleri uyusmuyor! ");
        }
    }

    void printTeacher() {
        this.teacher.print();
    }

}
