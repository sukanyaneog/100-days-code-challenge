import java.util.Scanner;

public class robberry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int res = maximumMoney(n,arr);
        System.out.println(res);
        sc.close();
    }
    static int maximumMoney(int n, int[] arr) {
        int sum=0;
        int max=0;
        for( int i=0; i<n; i++) {
            for(int j=i+2; j<n; j++){
                sum = arr[i] + arr[j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }
}
