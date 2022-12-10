import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Variables
        ArrayList<Integer> data;

        // Read file
        data = FileReader.readFile("data.txt");

        // Compute
        int result = 0;
        for (int i = 0; i < data.size(); i++) {

        }

        // Print
        System.out.println("Result: " + result);
    }
}
