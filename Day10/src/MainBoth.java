import java.util.ArrayList;

public class MainBoth {
    public static void main(String[] args) {
        // Variables
        ArrayList<String> data;

        // Read file
        data = FileReader.readFile("data.txt");

        // Compute
        int result = 0;
        int cycle = 1;
        int var = 1;
        drawPixel(cycle,var);
        for (int i = 0; i < data.size(); i++) {
            cycle++;
            drawPixel(cycle,var);
            if (((cycle)-20)%40 == 0) {
                result += var * (cycle);
            }
            if (data.get(i).split(" ").length > 1) {
                var += Integer.parseInt(data.get(i).split(" ")[1]);
                cycle++;
                if (((cycle)-20)%40 == 0) {
                    result += var * (cycle);
                }
                drawPixel(cycle,var);
            }

        }

        // Print
        System.out.println();
        System.out.println("Result: " + result);
    }

    private static void drawPixel(int pix_in, int position) {
        int pixel = pix_in%40;
        if (pixel >= position && pixel <= position+2) {
            System.out.print("#");
        }
         else {
            System.out.print("-");
        }
         if (pix_in%40 == 0) {
             System.out.println();
         }
    }
}
