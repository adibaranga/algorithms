import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * Sorting an array using bubble sort, selection sort, insertion sort, quicksort and merge sort
 * <p/>
 * Created with IntelliJ IDEA.
 * User: baranga
 * Date: 1/4/10
 */
public class SortMethods {

    enum SortType {
        BUBBLE_SORT,
        SELECTION_SORT,
        INSERTION_SORT,
        QUICK_SORT,
        MERGE_SORT
    }

    public static void main(String[] args) {
        int[] array1 = {3, 100, 5, 7, 4, 23, 56, 78, 9, 1, 200, 2, 6, 8, 0};
        sortByType(array1, SortType.BUBBLE_SORT);

        int[] array2 = {3, 100, 5, 7, 4, 23, 56, 78, 9, 1, 200, 2, 6, 8, 0};
        sortByType(array2, SortType.SELECTION_SORT);

        int[] array3 = {3, 100, 5, 7, 4, 23, 56, 78, 9, 1, 200, 2, 6, 8, 0};
        sortByType(array3, SortType.INSERTION_SORT);

        int[] array4 = {3, 100, 5, 7, 4, 23, 56, 78, 9, 1, 200, 2, 6, 8, 0};
        sortByType(array4, SortType.QUICK_SORT);

        int[] array5 = {3, 100, 5, 7, 4, 23, 56, 78, 9, 1, 200, 2, 6, 8, 0};
        sortByType(array5, SortType.MERGE_SORT);
    }

    private static void sortByType(int[] array, SortType type) {
        System.out.println("Original Array: ");
        displayResult(array);
        switch (type) {
            case BUBBLE_SORT:
                bubbleSort(array);
                break;
            case SELECTION_SORT:
                selectionSort(array);
                break;
            case INSERTION_SORT:
                insertionSort(array);
                break;
            case QUICK_SORT:
                quickSort(array);
                break;
            case MERGE_SORT:
                mergeSort(array);
                break;
        }
        System.out.println("Sorted Array by " + type);
        displayResult(array);
    }


    private static void bubbleSort(int[] array) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    swap(array, i - 1, i);
                    swapped = true;
                }
            }
        }
    }

    private static void selectionSort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min]) {
                    min = i;
                }
            }
            swap(array, j, min);
        }
    }


    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                swap(array, j - 1, j);
                j--;
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int i = partition(array, low, high);
            quickSort(array, low, i - 1);
            quickSort(array, i + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivotIndex = low + (high - low) / 2;
        int pivotValue = array[pivotIndex];
        swap(array, pivotIndex, high);

        int i = low;
        int j = high - 1;

        while (i <= j) {
            if (array[i] > pivotValue) {
                swap(array, i, j);
                j--;
            } else {
                i++;
            }
        }

        swap(array, i, high);

        return i;
    }

    private static void mergeSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int m = low + (high - low) / 2;
            mergeSort(array, low, m);
            mergeSort(array, m + 1, high);
            merge(array, low, m, high);
        }
    }

    private static void merge(int[] array, int low, int m, int high) {
        int[] tempArray = new int[array.length];

        for (int i = low; i <= m; i++) {
            tempArray[i] = array[i];
        }

        for (int j = m + 1; j <= high; j++) {
            tempArray[high + m + 1 - j] = array[j];
        }

        int i = low;
        int j = high;

        for (int k = low; k <= high; k++) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j--;
            }
        }
    }

    private static void displayResult(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
