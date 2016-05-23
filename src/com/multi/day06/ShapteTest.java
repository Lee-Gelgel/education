package com.multi.day06;

public class ShapteTest {
	public static void main(String[] args) {
		
		//도형을 만들다
		
		Rectangle s1 = new Rectangle(10, 20, 30, 40);
		Circle s2 = new Circle(60, 70, 80);
		shapeUse(s1);
		shapeUse(s2);
			
		
		//변수는 클래스(type)를 따른다
		//함수는 오브젝트(인스턴스)를 따른다
	}
	
	public static void shapeUse(Shape s){
		//도형을 그리다
		s.draw();
		
	}
}
