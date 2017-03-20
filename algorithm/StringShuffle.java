package algorithm;
import java.io.*;
/* ¹®ÀÚ¿­ ¼¯±â
 * ex)  "abc" "def"  ->  "adbecf"
 */
public class StringShuffle{
	 public static void main(String args[]) throws IOException{
		  String a ="abc";
		  String b = "def";
		  String s = "";
		  String[] a1 = a.split("");
		  String[] b1 = b.split("");
		  int i;
		  if(a1.length>=b1.length){
			  for(i=0; i<b1.length;i++)
				  s += a1[i]+b1[i];
			  while(i<a1.length)
				  s += a1[i++];
		  }else{
			  for(i=0; i<a1.length;i++)
				  s += a1[i]+b1[i];
			  while(i<b1.length)
				  s += b1[i++];
		  }
		  System.out.println(s);
	}
}