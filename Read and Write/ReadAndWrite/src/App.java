import java.util.Scanner;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the name of the guest?");
        String guest = input.nextLine();
        input.close();

        boolean invited = false;
        // try-with-resources construction: automatic garbage collection by java
        try(Scanner fname = new Scanner(Paths.get("src\\guestlist.txt"))) {
            while(fname.hasNextLine()) {
                String row = fname.nextLine();

                if(row.isEmpty()) {
                    continue;
                }

                String split[] = row.split(",");
                String vip = split[0];
                int age = Integer.valueOf(split[1]);
                
                if(guest.equals(vip) && age >= 20) {
                    System.out.println("Guest is invited.");
                    invited = true;
                    break;
                }
            }

            if (!invited) {
                System.out.println("Guest is not invited.");
            }

        } catch (Exception e) {
            System.out.println("Cannot find file.");
        }
    }
}
