package sorts;

//优化的冒泡排序
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 4, 5, 1};
        bubbleSort(arr, 6);
        for (int item : arr) {
            System.out.println(item);
        }
    }

    public static void bubbleSort(int[] arr, int n) {

        boolean flag = false; //标记是否有数据交换

        for (int i = 0; i < n - 1; i++) {
           //一次冒泡的过程
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {//交换数据
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true; //有数据交换
                }
            }
            //判断本次冒泡过程是否有数据交换
            if(!flag) break;
        }

    }
}
