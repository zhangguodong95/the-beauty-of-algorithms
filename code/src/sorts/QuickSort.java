package sorts;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 4, 5, 1,10,5};
        quickSort(0,arr.length -1,arr);
        for (int i : arr) {
            System.out.println(i);

        }
    }

    public static void quickSort(int left, int right, int[] arr) {

        if (left >= right) return;
        int pivot = partition(left, right, arr);
        quickSort(left,pivot-1,arr);
        quickSort(pivot + 1, right,arr);
    }

    //分区函数 找到分区坐标
    private static int partition(int left, int right, int[] arr) {
        int counter = left;
        //将比数组最后一个数小的放到数组的前面
        for (int i = left; i < right; i++) {
            //交换 i 和 counter的值
            if (arr[i] < arr[right]) {
                int temp = arr[i];
                arr[i] = arr[counter];
                arr[counter] = temp;
                counter++;
            }
        }
        //将数组最后一个元素放到分区的位置
        int temp = arr[counter]; arr[counter] = arr[right]; arr[right] = temp;

        return counter;
    }
}
