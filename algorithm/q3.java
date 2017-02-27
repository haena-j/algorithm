package algorithm;
// 3. Anonymous class 문법으로 생성후 아래 함수 호출
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
