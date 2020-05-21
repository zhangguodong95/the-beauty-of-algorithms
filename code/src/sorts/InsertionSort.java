package sorts;


public class InsertionSort {


    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 4, 5, 1,10,5};
        insertionSort(arr, 8);
        for (int item : arr) {
            System.out.println(item);

        }
    }

    //插入排序 实现从小到大排序
    private static void insertionSort(int[] arr, int n) {//n是数组的大小
        for (int i = 1; i < n; i++) {//插入的次数
            //一次插入需要完成的操作
            int value = arr[i];
            int j = i - 1;
            //搬移数据 寻找插入的位置
            for (; j >= 0; j--) {
                if (arr[j] > value) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = value;
        }
    }

}
