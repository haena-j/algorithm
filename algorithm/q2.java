package algorithm;
//2. Anonymous class�������� �����ϰ� onClick ȣ��
public class q2 {
	public static void main(String[] args){
		ClickListener h = new ClickListener(){
			public void onClick(){
				System.out.println("Clicked");
			}
		};
		h.onClick();
	}
}