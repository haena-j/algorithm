//계수정렬
package algorithm;
import java.io.*;
public class CountingSort {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        int max = 0;
        for(int i = 0; i < size; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(max < arr[i]) max = arr[i]; //입력받은 값중 가장 큰 숫자를 max에 대입
        }
        br.close();
        int[] cArr = new int[max+1]; //가장 큰 숫자+1 크기의 int배열선언

        for(int i=0; i<arr.length;i++){
            cArr[arr[i]]++;
        }
        for(int i=0;i<cArr.length;i++){
            for(int j=0; j<cArr[i]; j++){
                bw.write(i+"\n");
            }
        }
        bw.close();
    }
}