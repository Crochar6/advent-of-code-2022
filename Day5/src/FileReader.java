import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class FileReader {
    public static ArrayList<Integer> readFile(String fileName) {
        // Data variables
        ArrayList<Integer> result = new ArrayList<Integer>();

        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            boolean start = false;

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (start) {
                    String[] a = data.split(" ");
                    result.add(Integer.parseInt(a[1]));
                    result.add(Integer.parseInt(a[3]));
                    result.add(Integer.parseInt(a[5]));
                }
                if (Objects.equals(data, "")) {
                    start = true;
                }
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while opening the file " + fileName);
            e.printStackTrace();
            System.exit(-1);
        }
        return result;
    }
}
