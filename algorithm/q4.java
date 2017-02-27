package algorithm;
//4. 람다식으로 인스턴스를 생성
public class q4 {
	public static void main(String[] args){
		ClickListener c = ()->{System.out.println("Clicked");};
		c.onClick();
	}
}

/*
5. q2.class 와 q2$1.class(익명클래스) 가 생성된다.
6. 클래스의 이름이 없기 때문에 익명클래스이다.
7. ClickListener 인터페이스를 구현한 익명클래스를 넣으라는 것.
8. static 메서드가 먼저 컴파일 되기 때문에 static이 아닌 메서드는 아직 정의되지 않았기 때문에 에러가 생긴다.
*/