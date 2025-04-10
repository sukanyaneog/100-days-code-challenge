package Day21;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        /*int sum1 = (n*(n+1))/2;
        int sum2 = 0;
        for(int i=0; i<n; i++){
            sum2 +=nums[i];
        }
        int missing = sum1 - sum2;
        return missing;*/
        int xor1=0, xor2=0;
        for (int i=0; i<n; i++){
            xor1 = xor1 ^ (i+1);
            xor2 = xor2 ^ nums[i];
        }
        return xor1 ^ xor2;
    }
}
