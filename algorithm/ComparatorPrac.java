package algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorPrac {
	public static void main(String args[]){
		int[] testArr = new int[]{3, 24, 253, 535464, 64};
		Student[] stdArr = new Student[5];
		for(int i =0; i<5;i++){
			Student s = new Student("user"+i,17+i,60-i);
			stdArr[i] = s;
		}
		
		Arrays.sort(testArr);
		for(int a:testArr)
			System.out.println(a);
		
		Arrays.sort(stdArr, new Comparator<Student>(){
			@Override
			public int compare(Student o1, Student o2){  //나이순 정렬
				if(o1.age>o2.age) return 1;
				else if(o1.age<o2.age) return -1;
				return 0;
			}
		}); 
		for(Student s:stdArr)
			System.out.println(s.toString());
	}
	static class Student{
		String name;
		int age;
		int score;
		
		public Student(String name, int age, int score){
			this.name = name;
			this.age = age;
			this.score = score;
		}
		public String toString(){
			return "이름: " + name + " 나이: " + age + " 점수: " + score;
		}
		
	}
}


