package algorithm;
import java.io.*;

public class test{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine().trim());
        int total = 1, m1 = 1, m2 = 1;
        for(int i=2; i<num; i++){
            total = m1+m2;
            m2 = m1;
            m1 = total;
        }
        System.out.println(total);
    }
}