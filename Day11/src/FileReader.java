import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public static ArrayList<Monkey> readFile(String fileName) {
        // Data variables
        ArrayList<Monkey> result = new ArrayList<>();

        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                myReader.nextLine();
                String data1[] = myReader.nextLine().split(" ");
                String data2[] = myReader.nextLine().split(" ");
                String data3[] = myReader.nextLine().split(" ");
                String data4[] = myReader.nextLine().split(" ");
                String data5[] = myReader.nextLine().split(" ");
                ArrayList<Long> items = new ArrayList<>();
                for (int i = 4; i < data1.length; i++) {
                    items.add(Long.parseLong(data1[i].split(",")[0]));
                }
                if (myReader.hasNextLine()) myReader.nextLine();

                result.add(new Monkey(items, data2[7].equals("old"), data2[7].equals("old") ? 0 : Integer.parseInt(data2[7]), data2[6].equals("+"), Integer.parseInt(data3[5]), Integer.parseInt(data4[9]), Integer.parseInt(data5[9])));
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
