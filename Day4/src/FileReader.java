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
                String [] z = data.split(",");
                String [] a = z[0].split("-"), b = z[1].split("-");


                result.add(Integer.parseInt(a[0]));
                result.add(Integer.parseInt(a[1]));
                result.add(Integer.parseInt(b[0]));
                result.add(Integer.parseInt(b[1]));
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
