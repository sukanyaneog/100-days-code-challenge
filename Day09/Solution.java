package Day09;
import java.util.*;
class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        int n = arr.length;
        int[] hash = new int[n+1];
        
        for(int i=0; i<n; i++) {
            hash[arr[i]]++;    
        }
        
        List<Integer> result = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            result.add(hash[i]);
        }
        return result;
        
    }
}