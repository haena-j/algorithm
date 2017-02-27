package algorithm;

import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;

public class q5 {
	public static void main(String[] args){
		//2. ���׸� Ŀ���ǿ� ���
		CopyOnWriteArrayList<BookVO> bookList = new CopyOnWriteArrayList<BookVO>();
		bookList.add(new BookVO("��������", 20000, "�̻�", 1));
		bookList.add(new BookVO("��γ��", 25000, "�̻�", 2));
		bookList.add(new BookVO("�ڹ�������", 35000, "����", 3));
		bookList.add(new BookVO("�ȵ���̵�����", 15000, "�����", 4));
		
		//3. å �� ��� ���ϱ�
		int total = 0;
		for(BookVO book : bookList)
			total += book.getPrice();
		System.out.println("å �� ��� : " + total);
		
		//4. ��������� ������ �Ŀ� ���� ����ϱ�
		Collections.sort(bookList, new TitleCompare());
		for(BookVO book : bookList)
			System.out.println("å ����� : " + book.getTitle());
		
		//5. ������ 2���� �̸��� å�� ������ �� ����ϱ�
		//�������������� ArrayList -> CopyOnWriteArrayList�� ����
		for(BookVO b : bookList){
			if(b.getPrice()<20000){
				bookList.remove(b);
			}
		}
		for(BookVO book : bookList)
			System.out.println("2�����̻� å ���� �� : " + book.getTitle());
	}
	static class TitleCompare implements Comparator<BookVO> {
		@Override
		public int compare(BookVO list1, BookVO list2) {
			return list1.getTitle().compareTo(list2.getTitle());
		}
		
	}
}
