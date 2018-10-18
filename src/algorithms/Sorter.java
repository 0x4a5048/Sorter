package algorithms;

public class Sorter {
    
    // swap
    private static void swap(int[] array, int p, int q) {
        if (p < 0 || q < 0 || p >= array.length || q >= array.length)
            return;
        int temp = array[p];
        array[p] = array[q];
        array[q] = temp;
    }
    
    // heapsort :: helper
    private static void sink(int[] array, int p, int len) {
        if (p < 0 || p >= len)
            return;
        int q = 2 * p + 1;
        if (q >= len)
            return;
        if (q + 1 < len && array[q + 1] > array[q])
            q++;
        if (array[q] > array[p]) {
            swap(array, p, q);
            sink(array, q, len);
        }
    }
    
    // heapsort :: helper
    public static void buildHeap(int[] array) {
        if (array == null || array.length < 2)
            return;
        for (int i = (array.length-2)/2; i != -1; i--)
            sink(array, i, array.length);
    }
    
    // heapsort :: algorithm
    public static void heapSort(int[] array) {
        buildHeap(array);
        for (int j = array.length - 1; j > 0; j--) {
            swap(array, 0, j);
            sink(array, 0, j-1);
        }
    }
    
    // printArray :: algorithm
    public static void printArray(int[] array) {
        if (array == null)
            return;
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }   
}
