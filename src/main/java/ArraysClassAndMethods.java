import java.util.Arrays; // HelperArray.java file ile yapilan islemleri bu libarary kolayligiyla yapariz HelperArray gerek kalmamis olur

// Bunu yapmayip java.util.Arrays; dahil edip bu yapilanlara gerek kalmaz.
// (HelperArray.java ya gerek kalmaz)

/* Eger bir metodun basina static yazarsak main metodu icinde kullanabiliyorduk ve ayrica yeniden nesne olusturmadan kullanadabiliyoruz
       " HelperArray helper = new HelperArray(); " buna gerek kalmadan -> HelperArray.print(list); diyerek artik boyle cagirabiliriz !!!
*/
public class ArraysClassAndMethods {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4};
        int[] list2 = {4, 5, 6, 8, 9, 10, 13, 15, 17};
        int[] liste = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};
        int[] list4 = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        int[] list5 = {2, 3, 4, 5, 6, 7, 8};
        int[] list6 = {6, 7, 8, 9, 10, 11};
        double[] list3 = {4.3, 5.2, 6.1};
        int[] list7 = {1, 2, 3};
        int[] list8 = {1, 2, 3};
        int[] list9 = {1, 2, 10,5};
//
//        HelperArray helper = new HelperArray();
//        helper.print(list); //print metodunun basina "static" koayrsak helper nesnesi olusturmamiza gerek kalmaz
//        System.out.println();
//        helper.print(list2);
//        System.out.println();
        // HelperArray.print(list3); // static metod olarak yazdigimiz icin "helper" nesnesine gerek kalmadi!!!
        // System.out.println();
        /* Dizinin elemanlarini ekrana direkt bastiran method
        - Yeni bir nesne uretmeye method uretmeye gerek kalmadan ekran bastiririz!!
        Arrays.toString()
        */

        System.out.println(Arrays.toString(list));
        // override a gerek kalmadan Arrays.toString yazarak double da cagirilip printlenebilir

        System.out.println(Arrays.toString(list3));

        /* Arrays.fill metodu ile dizilerimizin belirli bir bölümlerine değerler atayabiliriz.
        Arrays.fill()
        */
        System.out.println(Arrays.toString(liste)); //once varsayilan degerleri verelim
        Arrays.fill(liste, 2); // tum elemanlari 2 yaptik
        System.out.println(Arrays.toString(liste));

//        HelperArray.fill(list2,4);

        HelperArray.print((HelperArray.fill(list2, 4)));

        /* Arrays.fill() kulanirken aralik vererek te degerleri degistirebiliriz!!  */

        Arrays.fill(list2, 2, 5, 11);
        System.out.println(Arrays.toString(list2));

        // DIZILERDE EKRANA PRINT YAP<AYA YARAR!!!
        // System.out.println(Arrays.toString());
        /* Arrays.sort() Siralama methodu
        - Arrays.sort() metodu ile dizilerdeki elemanları sıralayabiliriz.
         */
        System.out.println(Arrays.toString(list4)); //siralanmadan onceki hali
        Arrays.sort(list4);
        System.out.println(Arrays.toString(list4));

        /* Arrays.binarySearch()
        - Java'da dizideki bir elemanın indis değerini bulmak için binarySearch kullanılabilir.
        - Ama bu metodu kullanabilmek için, dizinin sıralı olması gerekmektedir.
         */
        System.out.println(Arrays.binarySearch(list4, 55));

        //Ayni durum Arrays methodsuz kullanimi
        System.out.println(HelperArray.search(list4, 21));

        /* Arrays.copyOf() ve Arrays.copyOfRange() metotu
        - Mevcut diziden belli bir uzunlukta yeni bir dizi oluşturmak için Arrays.copyOf() metotu kullanılır
        - Mevcut diziden belli bir aralıkta yeni bir dizi oluşturmak için ise Array.copyOfRange() metodu kullanılır.
         */


        //araliga kadar kopyalamak istersek soldan indis sayisinca verilir
        int[] copyList4 = Arrays.copyOf(list4, 4);
        System.out.println(Arrays.toString(copyList4));

        //ayni boyutta kopyalamak istersek list.length deriz
        int[] copyList = Arrays.copyOf(list4, list4.length);
        System.out.println(Arrays.toString(copyList));

        // aralikli kopyalamak istersek copyofRange() kukllanilir , aralik indisleri verilirek yapilir !!
        int[] copyliste = Arrays.copyOfRange(list4, 2, 6);
        System.out.println(Arrays.toString(copyliste));

        //Ayni durum copyof icin Arrays methodsuz kullanimi
        System.out.println(Arrays.toString(HelperArray.copy(list5, 4)));

        //Ayni durum copyofRange icin Arrays methodsuz kullanimi
        System.out.println(Arrays.toString(HelperArray.copyOfRangeBenim(list6, 1, 4)));

        /*Arrays.equals() Methodu
         - Java'da iki dizinin eşitliğini kontrol etmek için Arrays.equals() metotu kullanılır.
         */

        System.out.println(Arrays.equals(list7,list8));

        // Ayni durum Arrays.equals olmadan methodsuz kulanimi kendi methodumuzla kullanimi yani
        System.out.println(HelperArray.equals(list7,list8));

    }
}
