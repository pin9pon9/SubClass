
package com.test1.kh;

public class Test1 {
	// static int a = 10; class 메모리 영역에 메모리를 할당
	public static void main(String[] args) {
		
		Rect ob1 = new Rect(); // 뒤의 Rect();
		//Rect() : 생성자의 역할 2가지 1. 메모리할당 > 무엇을? > 힙 메모리 영역에 width 와 heigth 를 할당 해줌  
		//2.초기화
		Rect ob2 = new Rect(); 
		//이제 메모리를 2개 할당 받는다.
		
		ob1.set(10, 5);
		System.out.println(ob1.area()); //50
		System.out.println(ob2.area()); //0
		System.out.println(ob1.len()); // 30
	}
}
class Rect {
	private int width, height; // 접근을 못하기떄문에 set 으로 이용하거나 , 생성자를 이용하는방법 
	
	public void set(int w, int h){//실행하고 끝 결과물이 돌아올 필요가없다
		width = w; height = h;
	}
	/*{
		width = 40;
	}초기화 블럭*/ 
	//public Rect(){} // 컴파일 시점에 생성이 된다 : 디폴트 생성자
	
	public int area() {
		return width*height;
	}
	
	public int len() {
		return (width+height)*2;
	}
}
