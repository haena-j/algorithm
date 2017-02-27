/*
 * OX∞‘¿” OXOOXOOO = 1+0+1+2+0+1+2+3
 */
package algorithm;
import java.io.*;
public class OXGame{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int cnt, total;
        for(int i=0; i<num; i++){
            String str = br.readLine().trim();
            total = cnt = 0;
            for(int j =0; j < str.length(); j++){
                if(str.charAt(j)=='O') cnt++;
                else cnt = 0;
                total += cnt;
            }
            sb.append(total+"\n");
        }
        System.out.println(sb);
    }
}