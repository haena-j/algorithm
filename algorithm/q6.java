package algorithm;

public class q6 {
	public static void main(String[] args){
		Result<String> a1 = new Result<String>("AAA");
		Result<Integer> a2 = new Result<Integer>(3);
		
		System.out.println("Answer is " + a1.getObject()+ "," + a2.getObject());
	}
}
class Result<T> {
	private T object;
	//1. �����Լ����� �ν��Ͻ��� �����ǵ��� �ùٸ� ������ �ۼ�
	public Result(T object) {
		this.object = object;
	}
	//2. �����Լ����� "Answer is AAA,3" �� ��µǵ��� �ùٸ� getObject() �Լ� �ۼ�
	public T getObject() {
		return object;
	}
	
}

/*
 * 3. T�� K�� �ٲ㵵 ����ȴ�. �Ϲ������� T�� Type�� �ǹ��Ѵ�.
 */
