package sorts;


//选择排序实现从小到大排序
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 4, 5, 1,10};
        selectionSort(arr, 6);
        for (int item : arr) {
            System.out.println(item);

        }
    }

    public static void selectionSort(int[] arr, int n) {//n是数组大小

        for (int i = 0; i < n - 1; i++) {//要进行选择的次数
            int min = arr[i]; //最小值
            int pos = i; //一次选择的最小值的角标
            //找到最小值和其对应的角标
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    pos = j;
                }
            }
            //交换数据
            int temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }

    }
}
