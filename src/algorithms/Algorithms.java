package algorithms;

public class Algorithms {

    public static void main(String[] args) {
        int[] array = {15, 20, 10, 17, 7, 2, 12, 13, 16, 25};
        Sorter.heapSort(array);
        Sorter.printArray(array);
    }
}
