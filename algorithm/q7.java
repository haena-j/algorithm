package algorithm;
public class q7 {
	public static final String HELLO = "hello";
	public static void main(String[] args){
		//2. ������ ����
		HelloThread ht = new HelloThread();
		ht.start();
		System.out.print("finish");
	}
}

//1. Thread�� ����� Ŭ������ ������
// 0.3�� �������� hello�� ����Ʈ�ϴ� ���� �ۼ�
class HelloThread extends Thread{
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println("hello");
			try{
				Thread.sleep(300);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

/*
 * 3. ���� �����Լ����� �������� run�޼��带 ȣ���ϸ� ��°���� finishhello�� �ȴ�. �� ������?
 * 
 */