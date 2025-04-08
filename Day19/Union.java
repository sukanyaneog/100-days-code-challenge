package Day19;

import java.util.ArrayList;
import java.util.HashSet;

public class Union {
    
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        HashSet <Integer> s=new HashSet<>();
        ArrayList < Integer > Union=new ArrayList<>();
        for (int i = 0; i < n; i++)
            s.add(arr1[i]);
        for (int i = 0; i < m; i++)
            s.add(arr2[i]);
        for (int it: s)
            Union.add(it);
        return Union;
    }
    public static void main(String args[]) {
        int arr1[] = {-7,8};
        int arr2[] = {-9,-8,-3,8};
        ArrayList<Integer> Union = FindUnion(arr1, arr2);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union)
            System.out.print(val+" ");
        }
}
