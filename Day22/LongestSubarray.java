package Day22;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n = arr.length;
        int max = 0;
        for (int i=0; i<n; i++) {
            //int sum = arr[i];
                int sum = 0;
           for (int j=i; j<n; j++) {
                   sum += arr[j];
               if(sum == k) {
                       max = Math.max(max, j-i+1);
                   }
           }
        }
        return max;
    }
}