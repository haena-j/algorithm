package algorithm;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class B2957 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		TreeMap<Integer, Integer> tm = new TreeMap<>();
		
		int n = sc.nextInt();
		int tmp = sc.nextInt();
		int left = tmp,right = tmp;
		tm.put(tmp, 0);
		Iterator<Integer> it;
		for(int i=0;i<n;i++){
			it = tm.keySet().iterator();
			tmp = sc.nextInt();
			while(it.hasNext()){
				if(it.next()<tmp &&it.next()>left)
					left=it.next();
				else if((Integer)it.next()>tmp &&it.next()<right)
					right=it.next();
			}
			if(left>=right) tm.put(tmp, tm.get(left)+1);
			else tm.put(tmp, tm.get(right)+1);
			System.out.println(it);
		}
	}
}
