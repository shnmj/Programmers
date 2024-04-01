import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 바구니  갯수
        int m = sc.nextInt(); // 공 교환 횟수
        
        int arr[] = new int[n+1]; // 바구니
        
        for(int i=1; i<=n; i++) {
            arr[i] = i; // 공 초기화
        }
        
        for(int k=0; k<m; k++) { // m번 공 교환
            int i   = sc.nextInt();
            int j   = sc.nextInt();
            int tmp = arr[i];
            arr[i]  = arr[j];
            arr[j]  = tmp;
        }
        
        for(int i=1; i<=n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}