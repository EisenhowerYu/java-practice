import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(1);
        list.add(8);
        // selectionSort(list);
        System.out.println(findMin(list));
    }

    public static int findMin(ArrayList<Integer> list) {
        int minIdx = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(minIdx) > list.get(i)) {
                minIdx = i;
            }
        }
        return list.get(minIdx);
    }

    // public static int selectionSort(ArrayList<Integer> list) {
    //     for (int i = 0; i < list.size(); i++) {
    //         findMin(list);
    //     }
    //     return 0;
    // }
}
