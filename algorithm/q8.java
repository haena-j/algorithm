package algorithm;

public class q8{
	public static final String HELLO = "hello";
	public static void main(String[] args){
		//4. Thread를 상속하지 말고, Thread(Runnable r)을 사용하여 구현하여보시오.
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
