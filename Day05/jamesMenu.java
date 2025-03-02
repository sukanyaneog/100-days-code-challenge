package Day05;
import java.util.Scanner;

public class jamesMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i, j;
        int[][] arr = new int[n][m];
        for (i=0; i<n; i++) {
            for (j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }  
        }

        int[] maxPrice = new int[m];
        for (j=0; j<m; j++) {
            int max = 0;
            for (i=0; i<n; i++){
                if (arr[i][j]>max){
                    max = arr[i][j];
                }
            } 
            maxPrice[j] = max;
        }

        int finalCount = 0;
        double bestAvg = 0;
        int res = 0;
        
        for (i=0; i<n; i++){
            int count = 0;
            int sum = 0;
            for (j=0; j<m; j++){
                sum = sum + arr[i][j];
                if (maxPrice[j] == arr[i][j]){
                    count++;
                }
                
            }
            double avg =(double) sum/m;
            if (count>finalCount || (count==finalCount && avg>bestAvg)){
                bestAvg = avg;
                finalCount = count;
                res = i+1;
            }
        }
        System.out.println(res);
    }
}
