package java_start;   
import java.util.Scanner;   
   
   
class Person{   

	String name;   
	 String gender;   
	 String Phone_number;   
	 int age;   //private   
	  
	  
	public Person(String name, int age, String gender, String Phone_number ) {   
		this.name = name;   
		this.gender = gender;   
		this.Phone_number = Phone_number;   
		this.age = age;   
	}   
	   
	public int getage() {   
		return age;   
	}   
	   
	public String getName() {   
        return name;   
    }   
	  
	public String getPhone_number() {   
		return Phone_number;   
	}   
	   
	public void setPhone_number(String Phone_number) {   
		this.Phone_number=Phone_number;   
	}   
	   
	public String getGender() {   
		return gender;   
	}   
	   
	   
}   
public class test_first {   
   
  
	   
	public static void main(String[] args) {   
	  
		Scanner Person1 = new Scanner(System.in);   
		  
		  
		  
		System.out.println("학생의 이름을 입력하세요:");   
		String name=Person1.next();   
		System.out.println(name);  
		  
		System.out.println("학생 나이를 입력하세요:");   
		int age=Person1.nextInt();   
		System.out.println(age);  
  
		System.out.println("학생 성별 입력하세요:" );   
		String gender=Person1.next();   
		System.out.println(gender);  
		  
		System.out.println("학생 전화번호를 입력하세요:");   
		String Phone_number=Person1.next();   
		System.out.println(Phone_number);  

		Person st = new Person(name, age, gender,Phone_number);   
		
		System.out.println("학생의 이름:" + st.getName() + "학생의 나이:" + st.getage() + "학생의 성별" + st.getGender() + "학생의 전화번호:" + st.getPhone_number());   

		System.out.println("수정할 전화번호를 입력하세요:");
		String Phone_number1=Person1.next();
		System.out.println(Phone_number1); 
		
		st.setPhone_number(Phone_number1);
		System.out.println("수정한 전화번호:" + st.getPhone_number());   

		Person1.close();   
  
   
	}   
   
} 
/*
st.setPhone_number(Phone_number1);

System.out.println("수정한 전화번호:" + st.getPhone_number());    
이렇게 각 코드의 설명을 해주고 왜 이렇게 적었고 왜 사용했는지도 위치는 왜 이렇게 되는지 알려줘*/