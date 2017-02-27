package algorithm;
public class q7 {
	public static final String HELLO = "hello";
	public static void main(String[] args){
		//2. 쓰레드 시작
		HelloThread ht = new HelloThread();
		ht.start();
		System.out.print("finish");
	}
}

//1. Thread를 상속한 클래스를 생성후
// 0.3초 간격으로 hello를 프린트하는 로직 작성
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
 * 3. 만일 메인함수에서 쓰레드의 run메서드를 호출하면 출력결과는 finishhello가 된다. 그 이유는?
 * 
 */