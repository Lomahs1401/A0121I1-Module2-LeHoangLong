public class BinarySearchUsingRecursion {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    static int binarySearchRecursion(int[] list, int low, int high, int key) {
        if (high >= low) {
            int mid = (low + high) / 2;
            if (list[mid] == key) {
                return mid;
            } else if (list[mid] > key) {
                return binarySearchRecursion(list, low, mid - 1, key);
            } else {
                return binarySearchRecursion(list, mid + 1, high, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int high = list.length - 1;
        System.out.println("index: " + binarySearchRecursion(list, 0, high,  2));
        System.out.println("index: " + binarySearchRecursion(list, 0, high,11));
        System.out.println("index: " + binarySearchRecursion(list, 0, high, 79));
        System.out.println("index: " + binarySearchRecursion(list, 0, high,1));
        System.out.println("index: " + binarySearchRecursion(list, 0, high,5));
        System.out.println("index: " + binarySearchRecursion(list, 0, high, 80));
    }
}
