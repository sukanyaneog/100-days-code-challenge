package Day15;

import java.util.ArrayList;
//import java.util.Scanner;

public class MergerSorting {
    public static void main(String args[]) {
        //Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Solution.mergeSort(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
class Solution {

    static void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r) {
            return;
        }
        int mid = (l+r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr,mid+1,r);
        merge(arr, l, mid, r);
    }

    static void merge(int[] arr, int l, int mid, int r) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = l;
        int right = mid+1;
        
        while(left<=mid && right<=r) {
            if(arr[left]<=arr[right]) {
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }
        }

        while(left<=mid) {
            temp.add(arr[left]);
            left++;
        }
        while(right<=r) {
            temp.add(arr[right]);
            right++;
        }
        
        for (int i=l; i<=r; i++) {
            arr[i] = temp.get(i-l);
        }
    }
}
