import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        // Variables
        ArrayList<String> data;

        // Read file
        data = FileReader.readFile("data.txt");

        // Compute
        int result = 0;
        for (int i = 0; i < data.size(); i+= 3) {
            String stri1 = data.get(i);
            String stri2 = data.get(i+1);
            String stri3 = data.get(i+2);
            Set<Character> set1 = new HashSet<>();
            Set<Character> set2= new HashSet<>();
            for (int j = 0; j < stri1.length(); j++) {
                set1.add(stri1.charAt(j));
            }
            for (int j = 0; j < stri2.length(); j++) {
                set2.add(stri2.charAt(j));
            }
            for (int j = 0; j < stri3.length(); j++) {
                if (set1.contains(stri3.charAt(j)) && set2.contains(stri3.charAt(j))) {
                    if (stri3.charAt(j) > 'Z') {
                        result += stri3.charAt(j) - 'a' + 1;
                    } else {
                        result += stri3.charAt(j) - 'A' + 27;
                    }
                    break;
                }
            }
        }

        // Print
        System.out.println("Result: " + result);
    }
}
