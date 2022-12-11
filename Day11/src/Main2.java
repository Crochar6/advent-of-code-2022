import java.util.ArrayList;
import java.util.Collections;

public class Main2 {
    public static void main(String[] args) {
        // Variables
        ArrayList<Monkey> monkeys;

        // Read file
        monkeys = FileReader.readFile("data.txt");

        // Compute
        long result = 0;
        int globalDivision = 1;
        for (Monkey monkey: monkeys) {
            globalDivision *= monkey.test;
        }
        for (int i = 0; i < 10000; i++) {
            for (Monkey monkey: monkeys) {
                monkey.calculateChill(monkeys, globalDivision);
            }
            System.out.println("Round "+ i + " completed.");
        }

        Collections.sort(monkeys);
        result = monkeys.get(0).inspected * monkeys.get(1).inspected;


        // Print
        System.out.println("Result: " + result);
    }
}
