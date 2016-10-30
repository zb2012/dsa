/**
 * Created by wuyuanwei on 2016/10/30.
 */
public class NumArray {

    int[] sums;

    public NumArray(int[] nums) {
        int len = nums.length;
        sums = new int[len + 1]; sums[0] = 0;
        for (int i = 0; i < len; i++)
            sums[i + 1] = sums[i] + nums[i];
    }

    public int sumRange(int i, int j) {
        return sums[j +1] - sums[i];
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));
        System.out.println(numArray.sumRange(0, 1));
        System.out.println(numArray.sumRange(1, 2));
    }
}