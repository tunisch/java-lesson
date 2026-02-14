public class MineSweeper {
    int rows;
    int cols;
    int mayinCount;

    String[][] mineField;
    String[][] gameBoard;

    // Constructor’ın görevi de zaten Mainden gelen bu değerleri (row ve col) almak.
    MineSweeper(int r, int c) { // Constructor
        // row ve col parametreleri disardan yani Mainden alinir

        this.rows = r; // - this.row → sınıfın içindeki gerçek değişken
        // - row → constructor parametresi

        this.cols = c;

        /*
        - Oyun başlamadan önce board’ların RAM’de oluşturulması gerekiyor
        - Bu board’lar tüm metodlar tarafından kullanılacak
        - Bu yüzden constructor içinde oluşturmak en doğru yer

         */

        mineField = new String[this.rows][this.cols];
        gameBoard = new String[this.rows][this.cols];
    }

    public void prepareBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mineField[i][j] = "-";
                gameBoard[i][j] = "-";
            }
        }
    }

    /*
    - Kaç tane mayın koyacağımızı hesaplamak
    - Rastgele hücre seçmek
    - Eğer o hücrede mayın yoksa '*' koymak
    - Aynı yere iki kere mayın koymamak
    - Mayın sayısı bitene kadar devam etmek
    */



    public void placeMine() {

        // Yerlestirilen mayin sayisini takip eden sayac
        // şu ana kadar kaç mayın koyduğumuzu tutuyor


        // mayinCoutn = mc
        double mc = (rows * cols) / 4.0;  // toplam koymamız gereken mayın sayısı
        mayinCount = (int) Math.round(mc);
        int placed = 0; // her mayin koydugumuzda 1 artacak  ve hatta - placed == mineCount olunca döngü bitecek

        while (placed < mayinCount) {

            int randomRow = (int) (Math.random() * rows); //rastgele satir secer
            int randomCol = (int) (Math.random() * cols); //rastgele col secer
            if (mineField[randomRow][randomCol].equals("-")) {
                mineField[randomRow][randomCol] = "*";
                placed++;
            }
        }
    }

    public void calculateMine() {
        for (int r = 0; r < this.rows; r++) {
            for (int c = 0; c < this.cols; c++) {
                if (mineField[r][c].equals("*")) {
                    continue;
                }
                int count = 0; //count her hücre için sıfırlanmalı.
                // dr ve dc yonlerdir mesela > dr, r (rowdan) bir once bir fazlasi yani komsularina bakar rowun
                for (int dr = -1; dr <= 1; dr++) {
                    for (int dc = -1; dc <= 1; dc++) {
                        if (dr == 0 && dc == 0) continue; //Bu, kendisi olan hücreyi atlar.
                        int newRow = r + dr;
                        int newCol = c + dc;
                        if (newRow >= 0 && newRow < this.rows && newCol >= 0 && newCol < this.cols) { //sınır kontrolü
                            if (mineField[newRow][newCol].equals("*")) { // komşu mayınsa count++
                                count++;
                            }
                        }
                    }
                }
                mineField[r][c] = String.valueOf(count); // mineField string deger, count int birbirine esitlenemez bu yuzden count String e cevirdik String.valueOf (obj) ile boylelikle komsu mayinlari sayip o satir ve sutundaki karaye mayin sayisini yaziyor
            }
        }
    }

    public void printMine() {
        for (int r = 0; r < this.rows; r++) {
            for (int c = 0; c < this.cols; c++) {
                System.out.print(mineField[r][c]);
            }
            System.out.println();
        }
        System.out.println("============================");
    }

    public void printBoard() { // kullanıcıya görünen board
        for (int r = 0; r < this.rows; r++) {
            for (int c = 0; c < this.cols; c++) {
                System.out.print(gameBoard[r][c]);
            }
            System.out.println();
        }
    }

    int openedCell = 0;
    public boolean openCell(int rowChoice, int colChoice) {
        /* aynı hücreye iki kere basmayı engelleme */
//esit degilse -> !...... .equals
        //- Hücre daha önce açılmış mı?
        if (!gameBoard[rowChoice][colChoice].equals("-")) {
            //- Evet → uyarı ver → return
            System.out.println("You already opened this cell. Please choose another one.");
            return true;
        }
        if (mineField[rowChoice][colChoice].equals("*")) {
            System.out.println("GAME OVER!");
            printMine(); // Mayına basınca → printMine() cunku bizim mayin tablosu printMine icinde zaten oyun bitti cevaplar gozukebilir
            return false;
        } else {

            //hucre acilinca minefieldedki degerler yazilmali gameboarda
            gameBoard[rowChoice][colChoice] = mineField[rowChoice][colChoice]; // rowChoise userdan aldigimiz secme yeri

            // Açılan hücre sayısını artır

            openedCell++;
            // Kazanma kontrolü
            if (openedCell == ((rows * cols) - mayinCount)) {
                System.out.println("YOU WIN!");
                return false; // oyun biter
            }
        }
        printBoard(); // Normal açınca → printBoard()
        return true; // oyun devam
    }
}







