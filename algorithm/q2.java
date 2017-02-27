package algorithm;
//2. Anonymous class문법으로 생성하고 onClick 호출
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