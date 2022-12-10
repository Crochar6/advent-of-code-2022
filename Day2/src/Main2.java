import java.util.ArrayList;

public class Main2 {
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
            if (you == 2) {
                score += 3;
                you = them;
            }else if (you == 3){
                you = (them +1);
                if (you == 4) you = 1;
                score += 6;
            } else {
                you = (them -1);
                if (you == 0) you = 3;
            }

            score += you;
        }

        // Print
        System.out.println("Result: " + score);
    }
}
