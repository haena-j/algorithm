package algorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class stars10{
    static int n;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int a,b;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a=i; b=j;
                while(a!=0||b!=0){
                    if(a%3==1 && b%3==1){
                        System.out.print(" ");
                        break;
                    }
                    else{
                        a/=3; b/=3;
                    }
                }
                if(a == 0 && b == 0)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}