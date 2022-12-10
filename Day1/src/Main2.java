import java.util.ArrayList;
import java.util.Collections;

public class Main2 {
    public static void main(String[] args) {
        // Variables
        ArrayList<Integer> data;

        // Read file
        data = FileReader.readFile("data.txt");

        // Compute
        int result = 0;
        for (int i = 0; i < data.size(); i++) {

        }
        int sum = 0;
        sum += Collections.max(data);
        data.remove(data.indexOf(Collections.max(data)));
        sum += Collections.max(data);
        data.remove(data.indexOf(Collections.max(data)));
        sum += Collections.max(data);
        data.remove(data.indexOf(Collections.max(data)));

        // Print
        System.out.println("Result: " + sum);
    }
}
