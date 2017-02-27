package algorithm;
import java.io.*;
public class QuickSort {
	public static void main(String args[])throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringBuilder sb = new StringBuilder();
		int[] arr = new int[10];
		for(int i =0; i< 10; i++)
			arr[i] = Integer.parseInt(br.readLine());
		quick_sort(arr, 0, arr.length-1);
		for(int a : arr)
			sb.append(a);
		System.out.println(sb.toString());
	}
	public static void quick_sort(int arr[], int left, int right){
		if(left<right){ //����� ȣ�� 
			int q=partition(arr,left,right); //2���� �κй����� ������
			quick_sort(arr,left,q-1);  // ���� ��������� ����
			quick_sort(arr,q+1,right); // ������ ��������� ����
	     }
	}
	public static int partition(int arr[], int left, int right){
	    int temp;
	    int low = left+1;
	    int high = right;
	    int pivot = arr[left]; //�Ǻ��� �迭�� �� ���� ������ ����
	    
	    while(true){
	    	//arr[low] ���� pivot ���� ���� ���� �ܿ� �Ѿ
	    	while(arr[low] < pivot && low < right)low++;
	    		    	//arr[high] ���� pivot ���� ���� ū ��� �Ѿ
	    	while(arr[high] > pivot && high > left) high--;
	    	if(low<high){
	    	temp = arr[low];
	    	arr[low] = arr[high];
	    	arr[high] = temp;
	    	} else break;
	    }
	    temp = arr[left];
		arr[left] = arr[high];
		arr[high] = temp;
		
	    return high;
	}
}