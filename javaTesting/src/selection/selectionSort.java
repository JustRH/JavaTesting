package selection;

public class selectionSort {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        int minIndex = selectSort(array);
        System.out.println("选择排序:");
        printArray(array);
        System.out.println("最小值索引: " + minIndex);
    }

    // 选择排序算法
    static int selectSort(int[] arr) {
        int n = arr.length;
        int minIndex = 0, temp;
        for (int i = 0; i < n - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return minIndex; // 直接返回最小值的索引
    }

    // 打印数组元素
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
