package binarysearch;

public class BSearchFirst {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 8, 8, 8, 11, 18};
        int pos = bSearchFirst(arr, 1);
        System.out.println(pos);

    }

    //查找数组中给定值第一次出现的位置
    public static int bSearchFirst(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) >> 1);//获取中间点坐标
            if (arr[mid] < value) {
               low = mid + 1;
            } else if (arr[mid] > value) {
                high = mid - 1;
                //如果是数组第一个元素就一定是第一次出现
                //不是第一个元素 但是前一个元素不等于value那么也一定是第一个元素
            } else if (mid == 0 || arr[mid - 1] != value) {
                return mid;
            } else {
                high = mid - 1;
            }
        }

        return  -1;//数组中没有给定的值
    }
}
