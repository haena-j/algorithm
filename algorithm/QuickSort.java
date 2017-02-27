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
		if(left<right){ //재귀적 호출 
			int q=partition(arr,left,right); //2개의 부분문제로 나눈다
			quick_sort(arr,left,q-1);  // 왼쪽 재귀적으로 정렬
			quick_sort(arr,q+1,right); // 오른쪽 재귀적으로 정렬
	     }
	}
	public static int partition(int arr[], int left, int right){
	    int temp;
	    int low = left+1;
	    int high = right;
	    int pivot = arr[left]; //피봇을 배열의 맨 왼쪽 것으로 설정
	    
	    while(true){
	    	//arr[low] 값이 pivot 보다 값이 작은 겨우 넘어감
	    	while(arr[low] < pivot && low < right)low++;
	    		    	//arr[high] 값이 pivot 보다 값이 큰 경우 넘어감
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