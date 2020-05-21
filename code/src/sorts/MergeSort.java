package sorts;


public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 4, 5, 1,10,5};
        mergeSort(0,arr.length -1,arr);
        for (int i : arr) {
            System.out.println(i);

        }
    }


    //归并排序 对数组进行归并排序
    public static void mergeSort(int left, int right, int[] arr) {
        if (left >= right) return;
        int mid = (left + right) >> 1;//右移操作的时间复杂度低
        mergeSort(left, mid, arr);
        mergeSort(mid + 1, right, arr);
        merge(left, mid, right, arr);
    }

    //将两个数组合并成一个有序数组
    private static void merge(int left, int mid, int right, int[] arr) {
        //创建一个中间数组
        int[] temp = new int[right - left + 1];
        int i = left;//数组1角标
        int j = mid + 1;//数组2角标
        int pos = 0; //新数组角标·

        while (i <= mid && j <= right) {
            temp[pos++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        //数组1已经完全排序
        while (j <= right) temp[pos++] = arr[j++];

        //数组2已经完全排序
        while (i <= mid) temp[pos++] = arr[i++];

        //将数组赋值到原数组中
        System.arraycopy(temp, 0, arr, left, right + 1 - left);

    }
}
