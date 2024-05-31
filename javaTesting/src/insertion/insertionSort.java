package insertion;

public class insertionSort {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        insertSort(array);
        System.out.println("插入排序:");
        printArray(array);
    }

    // 插入排序算法
    static void insertSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int tmp = arr[i];
            int j = i - 1;
            while (j >= 0 && tmp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = tmp;
        }
    }

    // 打印数组元素
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
