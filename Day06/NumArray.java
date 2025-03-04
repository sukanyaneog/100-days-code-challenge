package Day06;

class NumArray {
    private int [] sum;

    public NumArray(int[] nums) {
        for( int i=1; i<nums.length; i++) {
            nums[i] += nums[i-1];
        }
        this.sum = nums;
    }
    
    public int sumRange(int left, int right) {
        if (left==0) {
            return sum[right];
        }
        else {
            return sum[right] - sum[left-1];
        }
    }
}