import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    ArrayList<Integer> calories = new ArrayList<Integer>();
        try {
            File myFile = new File("input.txt");
            Scanner myReader = new Scanner(myFile);
            int num = 0;
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                if(!line.isEmpty()) {
                    num += Integer.parseInt(line);
                } else {
                    calories.add(num);
                    num = 0;
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured");
            System.err.println(e);
        }
        calories.sort(Collections.reverseOrder());
        System.out.println(calories);
    }
}