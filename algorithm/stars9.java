//º°Âï±â -9
/* ÀÔ·Â : 5
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
 */
package algorithm;
import java.util.*;
public class stars9 {
	static int n;
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++){
			CalStars(sb, i);
		}
		for(int i = n-2; i >= 0; i--){
			CalStars(sb,i);
		}
		System.out.println(sb);
		sc.close();
	}
	static void CalStars(StringBuilder sb, int i){
			for(int j = 0; j < i; j++)sb.append(" ");
			for(int j = 0; j < 2*(n-i)-1; j++)sb.append("*");
			sb.append("\n");
	}
}
