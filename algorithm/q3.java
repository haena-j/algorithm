package algorithm;
// 3. Anonymous class �������� ������ �Ʒ� �Լ� ȣ��
public class q3 {
	public static void main(String[] args){
		ClickListener h = new ClickListener(){
			public void onClick(){
				System.out.println("Clicked");
			}
		};
		setClickListener(h);
	}
	
	public static void setClickListener(ClickListener l){
		l.onClick();
	}
}
