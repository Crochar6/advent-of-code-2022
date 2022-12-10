import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Variables
        ArrayList<Integer> data;

        // Read file
        data = FileReader.readFile("data.txt");

        // Compute
        int result = 0;
        for (int i = 0; i < data.size(); i+=4) {
            int a = data.get(i), b = data.get(i+1), c = data.get(i+2), d = data.get(i+3);
            if (((a <= c && b >= d) || (c <= a && d >= b))) {
                result++;
            }
        }

        // Print
        System.out.println("Result: " + result);
    }
}
