package binarysearch;


public class BSearchFirstLarger {

    /**
     * 查找第一个大于等于给定值的位置
     * @param arr 数组
     * @param value 给定的值
     * @return 第一个大于的坐标
     */
    public  int bSearchFirstLarger(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (arr[mid] >= value) {
                if (mid == 0 || arr[mid - 1] < value) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
