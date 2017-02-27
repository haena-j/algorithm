/* 관련연습문제)백준알고리즘 2577번 숫자의갯수
 * split(regex, limit)을 쓰면 regex 가 나올때마다 String으로 나누고 String[] 에 순서대로 저장된다.
 * limit이 0일 경우, zero length string은 무시된다. limit이 양수일 경우 배열의 최대개수는 limit을 넘지 못한다.
 * limit이 음수 일 경우 zero length string도 포함한다.
 * 예) "12434444"  //4가 5개
 * split("4", 0) -> {"12","3"} // length=2
 * split("4", 4) -> {"12","3","","44"} // length=4
 * split("4",-1) -> {"12","3", "", "", "", ""} //length=6
 * 4의 개수를 구하고 싶은경우 'str.split("4",-1).length-1' 
 */
package algorithm;
public class SplitPractice {
	public static void main(String args[]){
		String str = "12434444";
		System.out.println(str.split("4",-1).length);
		for(String a : str.split("4",-1))
			System.out.println("result: " + a);
	}
}