/*
 * By Joe Comiskey
 */
public class Circle  extends Shape{
	//instance var
	private double radius;
	//param. constructor
	public Circle(double r)
	{
		//super to inherit from Shape class
		super();
		radius = r;
		super.area = Math.PI * radius * radius;
		super.type = "Circle";
	}
	//print method that overrides Shape print method
	public void print()
	{
		System.out.println("Circle Radius: " + radius);
		super.print();
	}
}
