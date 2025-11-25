public class Teacher {
    String name;
    String branch;
    String mpno; //mobile phone no

    Teacher(String name,String branch, String mpno){
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }
    void print(){
        System.out.println("Adi \t:" + this.name);
        System.out.println("Dali \t:" + this.branch);
        System.out.println("Phone \t:" + this.mpno);
    }
}
