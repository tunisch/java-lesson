import java.io.*;
import java.util.*;

public class HackerrankJava1DArrayExamp {
    static boolean canWin(int leap, int [] game,int index, boolean [] visited){

        if(index >= game.length) return true;
        if(index < 0 || game[index] == 1 || visited[index]) return false;

        visited[index] = true;

        return canWin(leap, game, index + 1,boolean[] visited) || canWin(leap,game, index - 1, boolean[] visited) || canWin(leap, game, index + leap,boolean[] visited);
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);


        int q = inp.nextInt();
        while (q > 0) {
            int n = inp.nextInt();
            int leap = inp.nextInt();

            int [] game = new int[n];

            boolean[] visited = new boolean[game.length];

            for(int i = 0; i < n; i++){
                game[i] = inp.nextInt();
            }

            System.out.println(canWin(leap, game,0,boolean[] visited) ? "YES" : "NO");

            q--;
        }
    }
}
}
