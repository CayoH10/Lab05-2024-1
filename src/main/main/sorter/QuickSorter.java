package main.sorter;

public class QuickSorter implements Sorter {
    public int[] sort(int[] values) {
        // quicksort implementation
        return values;
    }

    public int partition(int[] values, int low, int high) {
        int pivo = values[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (values[j] <= pivo) {
                i++;

                int temp = values[i];
                values[i] = values[j];
                values[j] = temp;
            }
        }

        int temp = values[i + 1];
        values[i + 1] = values[high];
        values[high] = temp;
        return i + 1;
    }
    
}
