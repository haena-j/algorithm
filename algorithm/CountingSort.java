//�������
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
            if(max < arr[i]) max = arr[i]; //�Է¹��� ���� ���� ū ���ڸ� max�� ����
        }
        br.close();
        int[] cArr = new int[max+1]; //���� ū ����+1 ũ���� int�迭����

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