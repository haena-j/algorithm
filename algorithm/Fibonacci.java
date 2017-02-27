//피보나치함수
package algorithm;
import java.io.*;
public class Fibonacci {
	static int[] cnt = new int[2];
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine().trim());
        int[] list = new int[num];
        for(int i =0; i<num;i++)
            list[i] = Integer.parseInt(br.readLine().trim());
        for(int i=0;i<list.length; i++){
            f(list[i]);
            System.out.println(cnt[0]+" "+cnt[1]);
            cnt[0] = cnt[1] = 0;
        }
    }
    public static int f(int num){
        if(num == 0){
            cnt[0]++;
            return 0;
        }else if (num == 1){
            cnt[1]++;
            return 1;
        }
        return f(num-1) + f(num-2);
    }
}