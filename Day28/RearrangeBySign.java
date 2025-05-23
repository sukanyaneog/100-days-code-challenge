package Day28;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] positive = new int[n];
        int[] negative = new int[n];
        int j=0,k=0;
        for(int i=0; i<n; i++) {
            if(nums[i]>=0) {
                positive[j]=nums[i];
                j++;
            } else {
                negative[k] = nums[i];
                k++;
            }
        }
        for(int i=0; i<n/2; i++) {
            nums[2*i] = positive[i];
            nums[2*i+1] = negative[i];
        }
        return nums;
    }
}
