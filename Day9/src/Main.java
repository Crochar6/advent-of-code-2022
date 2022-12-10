import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Variables
        ArrayList<Move> data;
        Set<String> uniquePos = new HashSet<>();

        // Read file
        data = FileReader.readFile("data.txt");

        Pos h = new Pos(0,0), t = new Pos(0,0);
        // Compute
        int result = 0;
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.get(i).amount; j++) {
                h.move(data.get(i).direction);
                t.follow(h);
                uniquePos.add(""+t.x+"."+t.y);
            }
        }

        // Print
        System.out.println("Result: " + uniquePos.size());
    }
}
