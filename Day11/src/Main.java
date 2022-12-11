import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Variables
        ArrayList<Monkey> monkeys;

        // Read file
        monkeys = FileReader.readFile("data.txt");

        // Compute
        long result = 0;
        for (int i = 0; i < 20; i++) {
            for (Monkey monkey: monkeys) {
                monkey.calculate(monkeys);
            }
        }

        Collections.sort(monkeys);
        result = monkeys.get(0).inspected * monkeys.get(1).inspected;


        // Print
        System.out.println("Result: " + result);
    }
}
