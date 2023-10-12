import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Joy", "55 Eagle Street", 4000));
        persons.add(new Student("Ollie", "6381 Eastwood"));

        printPersons(persons);
    }

    public static void printPersons(ArrayList<Person> arr) {
        for (Person element : arr) {
            System.out.println(element);
        }
    }
}
