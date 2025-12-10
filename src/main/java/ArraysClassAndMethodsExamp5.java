public class ArraysClassAndMethodsExamp5 {
    public static void main(String[] args) {
        String[][] arr = new String[6][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || i == 2 || i == 5) {
                    arr[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    arr[i][j] = " * ";
                } else {
                    arr[i][j] = "    ";
                }
            }
        }
        for (String[] row : arr) {
            for (String value : row) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
