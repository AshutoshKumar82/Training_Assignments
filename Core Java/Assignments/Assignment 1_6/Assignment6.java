package com.cognizant.shapes;

public class Circle {
private float radius;
private float pi=3.5f;;
public Circle() {
	radius =1.5f;
}
 Circle(float radius) {
	this(radius,3.5f);
this.radius=radius;
}
public Circle(float radius, float pi) {
	this.radius=radius;
}

public  float calculateCiecleArea(float radius) {
	return pi*radius*radius;
	
}
public float calculateCircumference(float radius) {
	return 2*pi*radius;
}
public static void main(String args[]) {
	Circle obj=new Circle();
	float fo=obj.calculateCiecleArea(10);
	System.out.println("The Area is "+ fo);
}
}
