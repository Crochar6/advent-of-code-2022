import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        // Variables
        ArrayList<String> data;

        // Read file
        data = FileReader.readFile("data.txt");

        // Compute
        int result = 0;
        for (int i = 1; i < data.size() -1; i++) {
            for (int j = 1; j < data.get(0).length() -1; j++) {
                int current = Integer.parseInt("" + data.get(i).charAt(j));
                int columnUp = 0, columnDown = 0, rowRight = 0, rowLeft = 0;
                for (int a = i-1; a >= 0 ; a--) {
                    if (Integer.parseInt("" + data.get(a).charAt(j)) < current) {
                        columnUp++;
                    } else {
                        columnUp++;
                        break;
                    }
                }
                for (int a = i+1; a < data.size() ; a++) {
                    if (Integer.parseInt("" + data.get(a).charAt(j)) < current) {
                        columnDown++;
                    } else {
                        columnDown++;
                        break;
                    }
                }
                for (int b = j-1; b >= 0; b--) {
                    if (Integer.parseInt("" + data.get(i).charAt(b)) < current) {
                        rowLeft++;
                    } else {
                        rowLeft++;
                        break;
                    }
                }
                for (int b = j+1; b < data.get(0).length(); b++) {
                    if (Integer.parseInt("" + data.get(i).charAt(b)) < current) {
                        rowRight++;
                    } else {
                        rowRight++;
                        break;
                    }
                }
                int partial = columnUp * columnDown * rowLeft * rowRight;
                if (partial > result) {
                    result = partial;
                }
            }
        }

        // Print
        System.out.println("Result: " + result);
    }
}
