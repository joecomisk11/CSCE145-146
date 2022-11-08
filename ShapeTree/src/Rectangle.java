/*
 * Written by Joe Comiskey
 */
public class Rectangle  extends Shape{
	//instance vars
	private double side1;
	private double side2;
	//parameterized constructor
	public Rectangle(double s1, double s2)
	{
		//need super to extend from Shape class
		super();
		side1 = s1;
		side2 = s2;
		super.area = side1 * side2;
		super.type = "Rectangle";
	}
	//overrides print method in Shape class
	public void print()
	{
		System.out.println("Rectangle Side 1: " + side1 + " Side 2: " + side2);
		super.print();
	}
}
