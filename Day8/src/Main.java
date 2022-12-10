import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Variables
        ArrayList<String> data;

        // Read file
        data = FileReader.readFile("data.txt");

        // Compute
        int result = 0;
        result += (data.get(0).length() + data.size()) * 2 - 4;
        for (int i = 1; i < data.size() -1; i++) {
            for (int j = 1; j < data.get(0).length() -1; j++) {
                int current = Integer.parseInt("" + data.get(i).charAt(j));
                int columnUp = 0, columnDown = 0, rowRight = 0, rowLeft = 0;
                for (int a = 0; a < i ; a++) {
                    if (Integer.parseInt("" + data.get(a).charAt(j)) > columnUp) {
                        columnUp = Integer.parseInt("" + data.get(a).charAt(j));
                    }
                }
                for (int a = i+1; a < data.size() ; a++) {
                    if (Integer.parseInt("" + data.get(a).charAt(j)) > columnDown) {
                        columnDown = Integer.parseInt("" + data.get(a).charAt(j));
                    }
                }
                for (int b = 0; b < j; b++) {
                    if (Integer.parseInt("" + data.get(i).charAt(b)) > rowLeft) {
                        rowLeft = Integer.parseInt("" + data.get(i).charAt(b));
                    }
                }
                for (int b = j+1; b < data.get(0).length(); b++) {
                    if (Integer.parseInt("" + data.get(i).charAt(b)) > rowRight) {
                        rowRight = Integer.parseInt("" + data.get(i).charAt(b));
                    }
                }
                if (current > columnUp ||
                    current > columnDown ||
                    current > rowLeft ||
                    current > rowRight) {
                    result += 1;
                }
            }
        }

        // Print
        System.out.println("Result: " + result);
    }
}
