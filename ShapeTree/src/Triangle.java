/*
 * By Joe Comiskey
 */
public class Triangle extends Shape {
	//instance vars
	private double side1;
	private double side2;
	//param. constructor
	public Triangle(double s1, double s2)
	{
		super();
		side1 = s1;
		side2 = s2;
		super.area = (side1 * s2) /2;
		super.type = "Right Triangle";
	}
	public void print()
	{
		System.out.println("Right Triangle Side 1: " + side1 + " Side 2: " + side2);
		super.print();
	}

}
