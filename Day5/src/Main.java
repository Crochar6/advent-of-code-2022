import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Variables
        ArrayList<Integer> data;
        Stack[] fifo = new Stack[]{new Stack(), new Stack(), new Stack(), new Stack(), new Stack(), new Stack(), new Stack(), new Stack(), new Stack()};

        // This is just bad, I was blocked, just use charAt() -.-
        fifo[0].add("Q");
        fifo[0].add("F");
        fifo[0].add("M");
        fifo[0].add("R");
        fifo[0].add("L");
        fifo[0].add("W");
        fifo[0].add("C");
        fifo[0].add("V");

        fifo[1].add("D");
        fifo[1].add("Q");
        fifo[1].add("L");

        fifo[2].add("P");
        fifo[2].add("S");
        fifo[2].add("R");
        fifo[2].add("G");
        fifo[2].add("W");
        fifo[2].add("C");
        fifo[2].add("N");
        fifo[2].add("B");

        fifo[3].add("L");
        fifo[3].add("C");
        fifo[3].add("D");
        fifo[3].add("H");
        fifo[3].add("B");
        fifo[3].add("Q");
        fifo[3].add("G");

        fifo[4].add("V");
        fifo[4].add("G");
        fifo[4].add("L");
        fifo[4].add("F");
        fifo[4].add("Z");
        fifo[4].add("S");

        fifo[5].add("D");
        fifo[5].add("G");
        fifo[5].add("N");
        fifo[5].add("P");

        fifo[6].add("D");
        fifo[6].add("Z");
        fifo[6].add("P");
        fifo[6].add("V");
        fifo[6].add("F");
        fifo[6].add("C");
        fifo[6].add("W");

        fifo[7].add("C");
        fifo[7].add("P");
        fifo[7].add("D");
        fifo[7].add("M");
        fifo[7].add("S");

        fifo[8].add("Z");
        fifo[8].add("N");
        fifo[8].add("W");
        fifo[8].add("T");
        fifo[8].add("V");
        fifo[8].add("M");
        fifo[8].add("P");
        fifo[8].add("C");

        // Read file
        data = FileReader.readFile("data.txt");

        // Compute
        for (int i = 0; i < data.size(); i+=3) {
            for (int j = 0; j < data.get(i); j++) {

                String a = (String) fifo[data.get(i+1)-1].remove(fifo[data.get(i+1)-1].size() - 1);
                fifo[data.get(i+2)-1].add(a);

            }

        }
        System.out.print("Result: ");
        for (Stack a: fifo) {
            System.out.print(a.remove(a.size()-1));
        }
        System.out.println();

    }
}
