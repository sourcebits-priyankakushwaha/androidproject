package com.example.areacalculator;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Shape s1 = new Circle(12.9);
		Shape s2 = new Rectangle(12.9, 45);
		Shape s3 = new Square(12);
		Shape s4 = new Triangle(4, 8);
		Shape s5 = new Cube(12);

		System.out.println("area of circle = " + s1.area());
		System.out.println("area  of rectangle = " + s2.area());
		System.out.println("area of square = " + s3.area());
		System.out.println("area of triangle= " + s4.area());
		System.out.println("area of cube= " + s5.area());

	}

}
