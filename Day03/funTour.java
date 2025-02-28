import java.util.Scanner;
public class funTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for( int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = maxSum(n,arr);
        System.out.println(res);
        sc.close();
    }
    public static int maxSum(int n, int[] arr){
        int sum = arr[0];
        int maxSum = arr[0];

        for (int i=1; i<n; i++) {
            sum = Math.max(arr[i], sum+arr[i]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}