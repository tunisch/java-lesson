import java.util.Scanner;

public class MineSweeperMain {
    public static void main(String[] args) {

        System.out.println("Welcome to MineSweeper!");

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = inp.nextInt(); // rows degeri icin r satir sayisini userdan almamizi saglayacak 0
        System.out.print("Enter number of columns: ");
        int c = inp.nextInt(); // coloumns degeri icin c sutun sayisini girmemizi saglayacak

        if (r <= 2 || c <= 2) {
            System.out.println("You need at least 2 rows and columns.");
            return;
        }

        MineSweeper game = new MineSweeper(r, c);
        game.prepareBoard();
        game.placeMine();
        game.calculateMine();
        game.printBoard();

        while (true) {

            // kullanicidan row col secmesi icin indexler alinir
            System.out.print("Enter number of rowChoice: ");
            int rowChoice = inp.nextInt();
            System.out.print("Enter number of columnChoice: ");
            int colChoice = inp.nextInt();

            // yanlis bir deger girildiginde tekrar hak verir ama oyun mantigi diswindan dolayi sonsuz hak verir
            if (rowChoice < 0 || rowChoice >= r || colChoice < 0 || colChoice >= c) {
                System.out.println("Invalid choice, try again.");
                continue;
            }
            boolean result = game.openCell(rowChoice, colChoice); // hucreyi ac
            if (!result) break;
        }
    }
}

