package binarysearch;

//非递归实现二分查找
public class BinarySearch_0 {

    public static void main(String[] args) {
        int[] arr = {8,11,19,23,27,33,45,55,67,98};
        int index = binarySearch(arr, 10, 22);
        System.out.println(index);
    }

    /**
     * @param arr   数组
     * @param n     数组大小
     * @param value 要查找的值
     */
    public static int binarySearch(int[] arr, int n, int value) {

        int low = 0;
        int high = n - 1;
        int mid;//等效于除以2

        while (low <= high) {
            mid = (high + low) >> 1;
            if (arr[mid] == value) return mid;
            if (arr[mid] < value) low = mid + 1;
            if (arr[mid] > value) high = mid - 1;
        }

        return -1;
    }
}
