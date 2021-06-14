public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; ++i) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Before selection sort: ");
        for (double value : list) {
            System.out.print(value + " ");
        }
        System.out.println("\nAfter selection sort: ");
        SelectionSort.selectionSort(list);
        for (double value : list) {
            System.out.print(value + " ");
        }
    }
}
