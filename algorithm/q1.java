package algorithm;

//1. �������̽��� implements�ϴ� Ŭ���� ����
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