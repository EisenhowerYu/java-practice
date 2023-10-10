public class App {
    public static void main(String[] args) throws Exception {
        int[] arr1 = {3, 2, 9, 1, 8};

        int tmp;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    tmp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = tmp;
                }
            }
        }

        for (int i: arr1) {
            System.out.println(i+" ");
        }
    }

    // public static int selectionSort(ArrayList<Integer> list) {
    //     for (int i = 0; i < list.size(); i++) {
    //         findMin(list);
    //     }
    //     return 0;
    // }
}
