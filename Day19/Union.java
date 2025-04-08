package Day19;

import java.util.ArrayList;
import java.util.HashSet;

public class Union {
    
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[]) {
        int n = arr1.length;
        int n2 = arr2.length;
        HashSet <Integer> s=new HashSet<>();
        ArrayList < Integer > Union=new ArrayList<>();
        for (int i = 0; i < n; i++)
            s.add(arr1[i]);
        for (int i = 0; i < n2; i++)
            s.add(arr2[i]);
        for (int it: s)
            Union.add(it);
        return Union;
    }
}
