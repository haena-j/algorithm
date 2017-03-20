package algorithm;

public class q8{
	public static final String HELLO = "hello";
	public static void main(String[] args){
		//4. Thread�� ������� ����, Thread(Runnable r)�� ����Ͽ� �����Ͽ����ÿ�.
		Thread t = new Thread(new q8Test());
		t.start();
		System.out.print("finish");
	}
	static class q8Test implements Runnable{
		@Override
		public void run() {
			for(int i = 0; i < 10; i++){
				System.out.println(HELLO);
				try{
					Thread.sleep(300);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}	
		}
	}

}
