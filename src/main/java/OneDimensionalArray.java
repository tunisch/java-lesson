public class OneDimensionalArray {
    public static void main(String[] args) {
        /* Tek Boyutlu Diziler : */
        // ikiside ayni tanimlamadir !
        double[] list1;
        list1 = new double[10];

        double[] list = new double[10];
        list[0] = 3.1; // listenin ilk elemani index 0 olani 3.1 dedik
        System.out.println(list[0]);

        String[] days = {"Pazartesi", "Sali", "Carsamba"}; // boyut sayisi = 3 Array de 3 deger var cunku

        // Iksiide ayni islevi saglar ayni tanimalmadir ayni anlamdir!

        String[] weekendDays = new String[]{"Cumartesi", "Pazar"};

        String[] weekendDays2 = {"Cumartesi", "Pazar"}; // boyut sayisi 2

        System.out.println(weekendDays[0]);

        // Sadece Tek boyutlu dizilerde arrayin boyutunu ogrenmek icin ;
        System.out.println(weekendDays.length);

        System.out.println(days.length);

        // Tek boyuttaki dizilerdeki icerigi gezerken "for" ile cok rahat gezebiliriz!

        String[] footballTeam = {"Barca", "Real", "Atletico", "Fenerbahce"};
        for (int i = 0; i < footballTeam.length; i++){
            System.out.println(footballTeam[i]);
        }

    }
}
