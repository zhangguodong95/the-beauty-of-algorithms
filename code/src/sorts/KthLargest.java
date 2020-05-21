package sorts;

public class KthLargest {

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 4, 5, 1,10};
        int kthLargest = kthLargest(0, arr.length - 1, arr, 3);
        System.out.println(kthLargest);


    }

    //返回数组中第K大的元素
    public static int kthLargest(int begin, int end, int[] arr, int k) {
        int pivot;
        while (true) {
            pivot = partition(begin, end, arr);
            if (pivot == k - 1) return arr[pivot];
            if (pivot < k - 1) {
                begin = pivot + 1;
                continue;
            }
            if (pivot > k - 1) {
                end = pivot - 1;
                continue;
            }
        }
    }

    //分区操作
    public static int partition(int begin, int end, int[] arr) {
        int pivot = end;
        int counter = begin;

        for (int i = begin; i < end; i++) {
            if (arr[i] < arr[pivot]) {
                int temp = arr[i];
                arr[i] = arr[counter];
                arr[counter] = temp;
                counter++;
            }
        }

        int temp = arr[counter];
        arr[counter] = arr[pivot];
        arr[pivot] = temp;

        return counter;
    }
}
