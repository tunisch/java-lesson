public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;
    int nowYear = 2021;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax() {
        if (this.salary < 1000) {
            return 0;
        }
        return this.salary * 0.03;
    }

    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary() {
        if (this.nowYear - this.hireYear < 10) {
            return salary * 0.05;
        } else if (this.nowYear - this.hireYear > 9 && this.nowYear - this.hireYear < 20) {
            return salary * 0.10;
        }
        return salary * 0.15;
    }
/*
toString() metodu, Employee nesnesinin tüm bilgilerini okunabilir bir formatta String olarak döndürür.
Bu sayede nesneyi System.out.println() ile yazdırdığınızda, çalışanın adı, maaşı, çalışma saati,
başlangıç yılı, vergi, bonus ve maaş artışı gibi bilgiler tek bir satırda kolayca görüntülenir.

 */
    public String toString() { // nesnenin metinsel temsilini verir !
        return
                        "\n  Adi : " + this.name +
                        "\n  Maasi : " + this.salary +
                        "\n  Calisma Saati : " + this.workHours +
                        "\n  Baslangic Yili : " + this.hireYear +
                        "\n  Vergi : " + tax() +
                        "\n  Bonus : " + bonus() +
                        "\n  Maas Artisi : " + raiseSalary() +
                        "\n  Vergi ve Bonuslar ile birlikte maas : " + (this.salary + bonus() - tax()) +
                        "\n  Toplam Maas : " + (this.salary + bonus() + raiseSalary() - tax());
    }
}


