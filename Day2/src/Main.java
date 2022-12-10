import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Variables
        ArrayList<String> data;

        // Read file
        data = FileReader.readFile("data.txt");

        // Compute
        int result = 0;
        int score = 0;
        for (int i = 0; i < data.size(); i+= 2) {
            int you, them;
            switch (data.get(i)) {
                case "A":
                    them = 1;
                    break;
                case "B":
                    them = 2;
                    break;
                case "C":
                    them = 3;
                    break;
                default:
                    them = 0;
            }
            switch (data.get(i+1)) {
                case "X":
                    you = 1;
                    break;
                case "Y":
                    you = 2;
                    break;
                case "Z":
                    you = 3;
                    break;
                default:
                    you = 0;
            }
            score += you;
            System.out.println("------------");
            if (you == them) {
                score += 3;
                System.out.println("draw");
            }else {
                if ((you == 2 && them == 1) || (you == 3 && them == 2) || (you == 1 && them == 3)) {
                    score += 6;
                    System.out.println("win");
                }
                else {
                    System.out.println("lose");
                }
            }
        }

        // Print
        System.out.println("Result: " + score);
    }
}
