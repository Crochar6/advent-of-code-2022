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
        for (int i = 0; i < data.size(); i++) {
            String stri = data.get(i);
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < stri.length(); j++) {
                if (j >= stri.length() / 2) {
                    if (set.contains(stri.charAt(j))) {
                        if (stri.charAt(j) > 'Z') {
                            result += stri.charAt(j) - 'a' + 1;
                        } else {
                            result += stri.charAt(j) - 'A' + 27;
                        }

                        break;
                    }
                } else {
                    set.add(stri.charAt(j));
                }
            }
        }

        // Print
        System.out.println("Result: " + result);
    }
}
