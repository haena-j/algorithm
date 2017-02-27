package algorithm;

//1. 인터페이스를 implements하는 클래스 생성
public class q1 {
	public static void main(String[] args){
		Handler h = new Handler();
		h.onClick();
	}
	public static class Handler implements ClickListener{
		@Override
		public void onClick(){
			System.out.println("Clicked");
		}
	}
}