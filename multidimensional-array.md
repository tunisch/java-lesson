# Çok Boyutlu Diziler

Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar. Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken, matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek satır ve sütun sayısını girmemiz yeterli olacaktır.

İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar. Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

3x3 boyutunda bir matris örneği :

<img width="364" height="138" alt="image" src="https://github.com/user-attachments/assets/e4498582-8657-4f7c-95fd-9bbc4943daa2" />

Tablo oluşturup bu tablonun bilgilerini matris ile gösterelim. Örneğin, şehirler arasındaki mesafeyi gösteren bu tabloyu uzaklık değişkenimizde sakladık.

Mesafe Tablosu(KM)

<img width="537" height="278" alt="image" src="https://github.com/user-attachments/assets/3ed179c8-18fc-4ae5-8c25-0db0943cfdfb" />

```java
int[][] uzaklik ={
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };
```

# İki Boyutlu Dizi Tanımlama Yöntemleri

- İki boyutlu dizileri oluşturmanın farklı yöntemleri var şimdi bunlara bakalım.

- Bir değişkenin dizi olduğunu köşeli parantezler ile belirtmiştik. Bir tane köşeli parantez tek boyutlu dizi belirtir. Eğer çok boyutlu dizi oluşturmak istiyorsak, boyut sayısı kadar köşeli parantez belirtmeliyiz. Örneğin aşağıdaki satır 2 boyutlu bir dizi (yani matris) belirtir:

- degiskenTipi[][] arrayIsmi;
```java
	int matrix[][];
```
yada

```java
degiskenTipi arrayIsmi[][];  //bu yöntem tercih edilmez

```
- İki boyutlu dizimizi tanımlarken değerlerini atamak istersek aşağıdaki yöntemi kullanabiliriz.
```java
int[][] array = {
{1, 2, 3}, 
{4, 5, 6}, 
{7, 8, 9}, 
{10, 11, 12} 
};
```
- İlk köşeli parantez birinci boyutu (satırları), diğeri ise ikinci boyutu (sütunları) belirtir. Aşağıdaki kodu çalıştırırsak, 3 satırlı ve 4 sütunlu bir matris oluşturur:

```java
int matrix[][] = new int[3][4];

```
yada
```java
matrix = new int[3][4];
```
- oluşturulan matrix değişkeninin default değeri (a) ile gösterilen tablodaki gibidir.

```java
[0][1][2][3]
[0] 0 0 0 
[1] 0 0 0 
[2] 0 0 0 

    (a)
```
- Bu matrisin bütün elemanlarına ulaşmak için kullanmamız gereken indeks numaralarını aşağıdaki tabloda görebilirsiniz:

<img width="301" height="131" alt="image" src="https://github.com/user-attachments/assets/6b43e8b1-086b-4d24-9c86-1b10c4ab378c" />

```java
matrix[1][2]; // Matrisin 2. satır ve 3. sütunundaki elemana erişiliyor
matrix[0][3]; // Matrisin 1. satır ve 4. sütunundaki elemana erişiliyor
matrix[2][0]; // Matrisin 3. satır ve 1. sütunundaki elemana erişiliyor
```
- Matrisin 2. satırı ve 3. sütununda yer alan değerini 7 yapalım.

```java
matrix[2][1] = 7;
```
- Atadığımız 7 değerine ulaşmak istersek matrix[2] [][][1] ifadesini kullanırız.
- Fark ettiğiniz gibi matrislerin dizilerden tek farkı [] parantez yanına bir tane [] açıyoruz. Zaten her [] ifadesi yeni bir boyut anlamına geliyor. "double[][][] ucBoyutlu;" şeklinde bir ifadeyle 3 boyutlu veri saklayan bir veri yapısı oluşturmuş oluyoruz.

- Şimdi güzel bir örnek yapalım. 3 satırdan ve 4 sütundan oluşan bir matris yaratalım ve bu matrisin elemanlarını sırayla 1’den başlayacak şekilde dolduralım. Aşağıdaki kodu inceleyelim:

```java
int[][] matrix = new int[3][4];
int currentNumber = 1;

for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {

    int[] rowArray = matrix[rowIndex];   // O satırın gerçek dizisi

    for (int colIndex = 0; colIndex < rowArray.length; colIndex++) { // coloumn yazdırılı yanı coloumn olusturulur row sıfır verilerek
        rowArray[colIndex] = currentNumber;
        currentNumber++;
    }
}
```
- Şimdi yukarıdaki kodu inceleyelim. İki boyutlu diziyi oluşturduktan sonra önce for döngüsüyle dizinin satırlarını geziyoruz. Daha sonra içerideki for döngüsüyle dizinin sütunlarını dolaşıyoruz. Bu örneği vermemizdeki amaç, matrisin elemanlarına ulaşmak için iç içe 2 for döngüsü kullanmak gerektiğini göstermektir. Ayrıca dizinin length metodunun faydasını da burada görmüş oluyoruz.

- Yukarıdaki kod çalıştığında matrisin elemanları şu şekilde olur:

<img width="183" height="139" alt="image" src="https://github.com/user-attachments/assets/8eb049f4-e469-4c13-b8a9-ec5cdfe7e0d3" />

# İç İçe Döngülerle Dizilere Erişim ve Dizi İşlemleri

- Aşağıdaki kod bize bi matris değerini ekrana nasıl yazdıracağımızı gösterir. Döngüye girdikten sonra her sütun sayısı her satır için tek tek ekrana bastırılır. Her bir satırın tamamlanmasından sonra System.out.println() ile bir alt satıra geçilir.

```java
for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
    for (int colIndex = 0; colIndex < matrix[rowIndex].length; colIndex++) {
        System.out.print(matrix[rowIndex][colIndex] + " ");
    }
    System.out.println();
}
```
# İki Boyutlu Dizilerin Uzunlukları
- İki boyutlu diziler aslında her satırının tek boyutlu olduğu dizilerdir. Çok boyutlu dizilerinde boyutuna ulaşarak işlem yapabiliriz.
- Örneğin x = new int[3] [][][4] arrayinin x[0], x[1], x[2] değerleri tek boyutlu dizidir. Ve her biri aşağıdaki şekilde gösterildiği gibi 4 elemanı vardır. x.length değeri 3'tür, yani bize sahip olduğu 3 satırın değerini verir. Sütun sayısına ise her hangi bir satır değerinin uzunluğu kadardır. x[2].length değeri 4'tür.

<img width="467" height="152" alt="image" src="https://github.com/user-attachments/assets/a3656ea6-00f9-4280-857c-aeeb3c6eeedf" />

- Yukarıda öğrendiğimiz konuları pekiştirmek adına aşağıdaki kodu inceleyelim.

### Bu iki fonksiyon birlikte çalışıp klasik matris çarpımını gerçekleştiriyor. Matris çarpımı, satır–sütun nokta çarpımına (dot product) dayanır

```java
public double[][] multiplyMatrices(double[][] firstMatrix, double[][] secondMatrix) {
    // firstMatrix.length ile ilk matrisin satır sayısını buluyoruz. örneğimizde 3 olarak gelecektir.
	  // secondMatrix[0].length ile ikinci matrisin sütun sayısını buluyoruz. örneğimizde 4 olarak gelecektir.
    int rowCount = firstMatrix.length;
    int colCount = secondMatrix[0].length;

    // Bu sonuc matrısı = C dıyelim , Yani C matrisi çarpımın sonucunu tutacak matristir.
    double[][] result = new double[rowCount][colCount];

    // matrislerde çarpma, toplama gibi işlemleri yapabilmek için iç içe 3 tane döngüye ihtiyaç duyarız.
    for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) { //  rowIndex: C matrisinin hangi satırını doldurduğunu belirler
        for (int colIndex = 0; colIndex < colCount; colIndex++) { // colIndex: aynı satırda hangi sütunu doldurduğunu gösterir
            result[rowIndex][colIndex] = multiplyMatricesCell( // İki indeks birleşince C matrisinin bir hücresine (ör: C[2][3]) gidiyorsun
                    firstMatrix, 
                    secondMatrix, 
                    rowIndex, 
                    colIndex
            );
        }
    }

    return result;
}

double multiplyMatricesCell(double[][] firstMatrix, double[][] secondMatrix,
                            int rowIndex, int colIndex) {

  /*  A matrisinin satırı ile B matrisinin sütunu çarpma işlemi.
  *   rowIndex = 3, colIndex = 4  olarak gelecektir.
	*   k = 0 ise
	*   firstMatrix[3][0] * secondMatrix[0][4] 
	*   k = 1 ise
	*   firstMatrix[3][1] * secondMatrix[1][4] 
	*   k = 2 ise
	*   firstMatrix[3][2] * secondMatrix[2][4] 
	* şeklinde k değişerek satır ve sütun çarpılır.
	*/
    // Matris carpımı Bu tam olarak dot product.
    double sum = 0;

    for (int k = 0; k < secondMatrix.length; k++) {
        sum += firstMatrix[rowIndex][k] * secondMatrix[k][colIndex];
    }

    return sum;
}

```
- Yukarıdaki “multiplyMatrices” fonksiyonu iki tane matrisi girdi olarak alır. Fonksiyon matrislerin çarpım sonucunu matris olarak döndürür.
- “multiplyMatrices” fonksiyonu içinde bir başka fonksiyon daha çağrılmıştır. “multiplyMatricesCell” bu fonksiyon ise iki matrisin satır ve sütununu çarpıp sonucu double tipte bir değer döndürür.

# Sütun Kapasiteleri Farklı Matris Oluşturmak - Düzensiz Diziler
- Farklı sütun değerine sahip dizilere "Ragged Arrays" yani düzensiz diziler denir. Başka bir açıdan bakıldığında ise, 2 boyutlu dizileri, dizilerin dizisi (array of arrays) olarak düşünmek doğru olur. Yani iki boyutlu dizileri tek boyutlu diziler oluşturur.
- Diziler aynı türden elemanlardan oluşmak zorundadır. int türünde bir dizi olabileceği gibi, dizinin dizisi de olabilir.
- Yukarıdaki örneklerde matrisin sütun sayısını 4 olarak belirledik. Bu şekilde oluşturulursa matrisin bütün satırları 4 elemanlı olur. Fakat bu zorunlu değildir. Matris oluştururken sütun sayısı belirlemezsek, her bir satırdaki dizilerin kapasitesi farklı olabilir. Örneğin aşağıdaki kodu inceleyelim:

```java
int[][] matrix = new int[3][];
matrix[0] = new int[1];
matrix[1] = new int[2];
matrix[2] = new int[3];
```
- Burada önce 3 satırdan oluşan bir matris belirttik, fakat sabit bir sütun sayısı vermedik. Sonra her bir satır için ayrı ayrı sütun sayısı belirledik.
- Çok boyutlu dizi oluştururken, yalnızca ilk boyutun (en soldaki) kapasitesini belirlemeniz yeterlidir. Diğer boyutların kapasitesini dinamik olarak belirleyebilirsiniz.

# Examp
- Aşağıda verilen örneklerin cevaplarına bakmadan önce kendiniz kodlamaya çalışmanızı öneririz. Daha sonra zorlandığınız noktalarda ufak yardımlar almak için bakabilirsiniz. Bu sizin öğrenmenize daha yardımcı olacaktır.
- Matris boyutunu sizin belirlediğiniz matris değerlerini ise kullanıcının girdiği bir algoritma yazınız.
```java
int matrix[][] = new int[3][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and "
                + matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
```
- İstediğiniz boyutta matris oluşturarak matris değerlerine 0-99 arası random sayılar üreterek matrise atama yapınız.

### Cevap:

```java
int[][] matrix = new int[3][4];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
```
