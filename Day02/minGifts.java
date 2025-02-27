import java.util.Scanner;
public class minGifts{
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0) {
            int N = sc.nextInt();
            int[] rank = new int[N];
            for(int i=0; i<N; i++){
                rank[i] = sc.nextInt();
            }
            int[] gifts = new int[N];
            gifts[0]=1;
            //left to right
            for (int i=1; i<N; i++){
                if (rank[i]>rank[i-1]){
                    gifts[i]=gifts[i-1]+1;
                }
                else {
                    gifts[i]=1;
                }
            }
            //right to left
            for (int i=N-2; i>=0; i--){
                if ((rank[i]>rank[i+1]) && (gifts[i]<=gifts[i+1])){
                    gifts[i] = gifts[i+1]+1;
                }
            }
            int sum=0;
            for (int G : gifts){
                sum += G;
            }
            System.out.println(sum);
            T--;
        }
        sc.close();;
    }   
}