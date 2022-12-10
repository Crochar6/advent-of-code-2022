import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Variables
        ArrayList<String> data;

        // Read file
        data = FileReader.readFile("data.txt");

        // Compute
        int result = 0;
        Set<Character> a = new HashSet<>();
        for (int i = 0; i < data.get(0).length() - 3; i++) {
            for (int j = 0; j < 4; j++) {
                a.add(data.get(0).charAt(i + j));
            }
            if (a.size() >= 4) {
                result = i+4;
                break;
            }
            a.clear();
        }

        // Print
        System.out.println("Result: " + result);
    }
}
