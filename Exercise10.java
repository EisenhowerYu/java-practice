import java.util.ArrayList;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> name_lst = new ArrayList<>();

        while (true) {
            System.out.println("Enter a name. Press x to stop. ");
            String name = input.nextLine();

            if (name.equals("x")) {break;}
            
            name_lst.add(name);

        }

        System.out.println("In which order is the name you want me to call positioned in? ");

        System.out.println(name_lst.get(input.nextInt() - 1));

        input.close();

    }
}
