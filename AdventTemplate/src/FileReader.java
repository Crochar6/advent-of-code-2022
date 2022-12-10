import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public static ArrayList<Integer> readFile(String fileName) {
        // Data variables
        ArrayList<Integer> result = new ArrayList<Integer>();

        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                result.add(Integer.parseInt(data));
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
