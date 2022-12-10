import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        // Variables
        ArrayList<Move> data;
        Set<String> uniquePos = new HashSet<>();

        // Read file
        data = FileReader.readFile("data.txt");

        Pos[] knots = new Pos[10];
        for (int i = 0; i < knots.length; i++) {
            knots[i] = new Pos(0,0);
        }
        // Compute
        int result = 0;
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.get(i).amount; j++) {
                knots[0].move(data.get(i).direction);
                for (int n = 1; n < knots.length; n++) {
                    knots[n].follow(knots[n-1]);
                }
                uniquePos.add(""+knots[knots.length-1].x+"."+knots[knots.length-1].y);

            }
        }

        // Print
        System.out.println("Result: " + uniquePos.size());
    }
}
