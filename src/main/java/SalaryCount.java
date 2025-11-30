public class SalaryCount {
    public static void main(String[] args) {
    Employee e1 = new Employee("kemal",2000,45,1985);
        System.out.println(e1); // ile nesneyi direkt yazdırabilirsin, ayrıca ekstra print çağrısına gerek kalmaz.
    }
}

/*
toString() metodu, Employee nesnesinin tüm bilgilerini okunabilir bir formatta String olarak döndürür.
Bu sayede nesneyi System.out.println() ile yazdırdığınızda, çalışanın adı, maaşı, çalışma saati,
başlangıç yılı, vergi, bonus ve maaş artışı gibi bilgiler tek bir satırda kolayca görüntülenir.

 */

