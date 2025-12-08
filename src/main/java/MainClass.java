import java.util.Arrays; // HelperArray.java file ile yapilan islemleri bu libarary kolayligiyla yapariz HelperArray gerek kalmamis olur

// Bunu yapmayip java.util.Arrays; dahil edip bu yapilanlara gerek kalmaz.
// (HelperArray.java ya gerek kalmaz)

/* Eger bir metodun basina static yazarsak main metodu icinde kullanabiliyorduk ve ayrica yeniden nesne olusturmadan kullanadabiliyoruz
       " HelperArray helper = new HelperArray(); " buna gerek kalmadan -> HelperArray.print(list); diyerek artik boyle cagirabiliriz !!!
*/
public class MainClass {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4};
        int[] list2 = {4, 5, 6, 8};
        double[] list3 = {4.3, 5.2, 6.1};
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






    }
}
