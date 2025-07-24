package day4;
interface ArraySorter {
    void sort();
    void display();
}


class BubbleSorter implements ArraySorter {
    private int[] arr;

    public BubbleSorter(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void sort() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array sorted using Bubble Sort.");
    }

    @Override
    public void display() {
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

// Main class
public class SortArraInterface {
    public static void main(String[] args) {
        int[] numbers = {4, 1, 9, 2, 5};

        ArraySorter sorter = new BubbleSorter(numbers);
        sorter.sort();
        sorter.display();
    }
}
