
/**
 * Author : hyl
 * TIME : 2019/10/29 22:09
 */
public class Question33 {
    /**
     * 查找给定值的位置
     * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int index = -1;
        int offset = 0;
        int[] copyNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1 && nums[i + 1] < nums[i]) {
                index = i;
            }
        }
        if (index != -1) {
            //存在偏移
            offset = nums.length - 1 - index;
            for (int i = 0; i < copyNums.length; i++) {
                copyNums[i] = nums[(i + nums.length - offset) % (nums.length)];
            }
        } else {
            for (int i = 0; i < copyNums.length; i++) {
                copyNums[i] = nums[i];
            }
        }
        int low = 0;
        int high = copyNums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (copyNums[mid] > target) {
                high = mid - 1;
            } else if (copyNums[mid] < target) {
                low = low + 1;
            } else {
                if (index == -1) {
                    return mid;
                } else {
                    return (mid + copyNums.length - offset) % (copyNums.length);
                }
            }
        }

        return -1;
    }
}
