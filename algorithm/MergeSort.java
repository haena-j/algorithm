package algorithm;
import java.io.*;
public class MergeSort {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		for(int i = 0; i < num; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		mergeSort(0,num-1, arr);
		
		for(int a:arr)
			bw.write(a+" ");
		bw.close();
	}
	
	static void mergeSort(int left,int right, int[] arr){
		int mid;
		if(left<right){
			mid=(left+right)/2;
			mergeSort(left, mid, arr);
			mergeSort(mid+1, right, arr);
			merge(left,right,mid,arr);
		}
	}
	static void merge(int left, int right, int mid, int[] arr){
		int[] result = new int[right+1];
		int i,j,k;
		i = left;
		j = mid+1;
		k = left; //��� �迭 �ε���
		
		while(i<=mid&&j<=right) //left����mid�����ǹ迭�� mid+1���� right�����ǹ迭�� ũ���
			if(arr[i]<arr[j]) //left ���� right ������ ������ left index ���� result�� ����
				result[k++] = arr[i++];
			else
				result[k++] = arr[j++];
			
		while(i<=mid) //�����ε����� ���� �����������
			result[k++] = arr[i++];
		
		while(j<=right)//�������ε����� ���� �����������
			result[k++] = arr[j++];
		
		for(int m=left; m<=right;m++)
			arr[m] = result[m];
	}
}
