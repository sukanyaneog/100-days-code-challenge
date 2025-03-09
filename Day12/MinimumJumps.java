class Solution {
    static int minJumps(int[] arr) {
        // code here
        int n = arr.length;
        if (n<=1){
            return 0;
        }
        if(arr[0] == 0){
            return -1;
        }
        int step = arr[0];
        int range = arr[0];
        int jump = 1;
        
        for( int i=1; i<n; i++) {
            if(i==n-1){
                return jump;
            }
            
            range = Math.max(range, i+arr[i]);
            
            if(i==step) {
                jump++;
                step = range;
                
                if(step >= n-1) {
                    return jump;
                }
            }
            if(i>=range) {
                return -1;
            }
        }
        return -1;
    }
}