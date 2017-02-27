/* ���ÿ�������)���ؾ˰��� 2577�� �����ǰ���
 * split(regex, limit)�� ���� regex �� ���ö����� String���� ������ String[] �� ������� ����ȴ�.
 * limit�� 0�� ���, zero length string�� ���õȴ�. limit�� ����� ��� �迭�� �ִ밳���� limit�� ���� ���Ѵ�.
 * limit�� ���� �� ��� zero length string�� �����Ѵ�.
 * ��) "12434444"  //4�� 5��
 * split("4", 0) -> {"12","3"} // length=2
 * split("4", 4) -> {"12","3","","44"} // length=4
 * split("4",-1) -> {"12","3", "", "", "", ""} //length=6
 * 4�� ������ ���ϰ� ������� 'str.split("4",-1).length-1' 
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