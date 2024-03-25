import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine());
        int a, b;
        
        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());
            a  = Integer.parseInt(st.nextToken());
            b  = Integer.parseInt(st.nextToken());
            
            bw.write(a+b + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}