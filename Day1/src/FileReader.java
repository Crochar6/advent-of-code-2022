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

            int sum = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data == "") {
                    result.add(sum);
                    sum = 0;
                } else{

                    sum +=Integer.parseInt(data);
                }
            }
            result.add(sum);

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while opening the file " + fileName);
            e.printStackTrace();
            System.exit(-1);
        }
        return result;
    }
}
