import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr1 = {4, 2, 9, 1, 8};
        arr1 = bubbleSort(arr1);
        for (int i: arr1) {
            System.out.println(i);
        }
        //System.out.println(linearSearch(arr1, 9));
        System.out.println(binarySearch(arr1, 9));
    }

    public static int[] selectionSort(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        boolean sorted = false;
        int tmp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    sorted = false;
                }
            }
        }

        return arr;
    }

    public static int linearSearch(int[] arr, int key) {
        int idx = -1; // not found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                idx = i;
                break;
            }
        }
        return idx;
    }

    public static int binarySearch(int[] arr, int key) {
        return binarySearch(arr, key, 0, arr.length - 1);
    }
    
    private static int binarySearch(int[] arr, int key, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
    
            if (arr[mid] == key) {
                return mid; // Key found, return it
            } else if (arr[mid] < key) {
                return binarySearch(arr, key, mid + 1, high); // Search in the right half
            } else {
                return binarySearch(arr, key, low, mid - 1); // Search in the left half
            }
        }
    
        return -1; // Key not found
    }
}
