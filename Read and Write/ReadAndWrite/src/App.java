// Creating classes out of csv data

import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<People> peopleDB = new ArrayList<People>();

        // try-with-resources construction: automatic garbage collection by java
        try(Scanner fname = new Scanner(Paths.get("src\\guestlist.txt"))) {
            while(fname.hasNextLine()) {
                String row = fname.nextLine();

                if(row.isEmpty()) {
                    continue;
                }

                String split[] = row.split(",");
                String name = split[0];
                int age = Integer.valueOf(split[1]);
                String job = split[2];

                peopleDB.add(new People(name, age, job));
            }

        } catch (Exception e) {
            System.out.println("Cannot find file.");
        }

        for(People element:peopleDB) {
            element.promotion();
            System.out.println(element);
        }
    }
}
