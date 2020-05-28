package binarysearch;


public class BSearchLast {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 8, 8, 8, 11, 18};
        int pos = bSearchLast(arr, 8);
        System.out.println(pos);

    }
    //获取数组中等于给定值的最后出现的位置
    public static int bSearchLast(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (arr[mid] > value) {
                high = mid - 1;
            } else if (arr[mid] < value) {
                low = mid + 1;
            } else if (mid == arr.length - 1 || arr[mid + 1] != value) {
                return mid;
            } else {
                low = mid + 1;
            }
        }

        return -1;//数组中没有给定的值
    }
}
