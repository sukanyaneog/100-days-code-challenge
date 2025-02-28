import java.util.Scanner;
public class BitWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int OddOur = findOddOur(n);
        int EvenOur = findEvenOur(n);
        int OddPara = findOddPara(n);
        int EvenPara = findEvenPara(n);
        int diff = (OddPara + EvenPara) - (OddOur + EvenOur);
        diff = diff%1000;
        System.out.println(diff);
        sc.close();
    }
    private static int findOddOur(int n){
        return 2 * n - 1;
    }
    private static int findEvenOur(int n){
        return 2 * n;
    }
    private static int findOddPara(int n){
        int no = findNumWithBits(n,3);
        return no;
    }
    private static int findEvenPara(int n){
        int no = findNumWithBits(n,2);
        return no;
    }
    private static int findNumWithBits(int n, int k) {
        int count=0, num=0;
        while (count<n) {
            num++;
            if(Integer.bitCount(num)==k) {
                count++;
            }
        }
        return num;
    }
}