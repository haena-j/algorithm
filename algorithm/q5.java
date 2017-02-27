package algorithm;

import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;

public class q5 {
	public static void main(String[] args){
		//2. 제네릭 커렉션에 담기
		CopyOnWriteArrayList<BookVO> bookList = new CopyOnWriteArrayList<BookVO>();
		bookList.add(new BookVO("콩쥐팥쥐", 20000, "미상", 1));
		bookList.add(new BookVO("흥부놀부", 25000, "미상", 2));
		bookList.add(new BookVO("자바의정석", 35000, "정석", 3));
		bookList.add(new BookVO("안드로이드정복", 15000, "김상형", 4));
		
		//3. 책 총 비용 구하기
		int total = 0;
		for(BookVO book : bookList)
			total += book.getPrice();
		System.out.println("책 총 비용 : " + total);
		
		//4. 제목순으로 소팅한 후에 제목 출력하기
		Collections.sort(bookList, new TitleCompare());
		for(BookVO book : bookList)
			System.out.println("책 제목순 : " + book.getTitle());
		
		//5. 가격이 2만원 미만인 책을 제거한 후 출력하기
		//오류수정을위해 ArrayList -> CopyOnWriteArrayList로 변경
		for(BookVO b : bookList){
			if(b.getPrice()<20000){
				bookList.remove(b);
			}
		}
		for(BookVO book : bookList)
			System.out.println("2만원이상 책 제목 순 : " + book.getTitle());
	}
	static class TitleCompare implements Comparator<BookVO> {
		@Override
		public int compare(BookVO list1, BookVO list2) {
			return list1.getTitle().compareTo(list2.getTitle());
		}
		
	}
}
