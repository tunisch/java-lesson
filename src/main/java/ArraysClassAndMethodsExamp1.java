
/* Pratik - Dizideki Elemanların Ortalamasını Bulan Program */

public class ArraysClassAndMethodsExamp1 {
    public static void main(String[] args) {
        int[] list = {1, 4, 6, 7, 8, 9, 10, 11, 12};

        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        double average = sum / list.length;
        System.out.println(average);
    /* Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
    Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
     */
        double harmonicSeries = 0.0;
        for (int i = 0; i < list.length; i++) {
            harmonicSeries += 1.0 / list[i];
        }
        double harmonicAverage = list.length / harmonicSeries;
        System.out.println(harmonicAverage);


    }
}
