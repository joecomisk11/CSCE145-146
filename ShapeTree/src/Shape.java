/*
 * Written by Joe Comiskey
 */
public class Shape {
	//instance vars
	public double area;
	public String type;
	//constructor
	public Shape()
	{
		area = 0.0;
		type = "null";
	}
	//accessors
	public double getArea()
	{
		return area;
	}
	public String getType()
	{
		return type;
	}
	//print method
	public void print()
	{
		System.out.println("Area: " + area);
	}
	//compareTo method used for adding shapes
	public int compareTo(Shape aShape)
	{
		if(aShape == null)
			return -1;
		if(this.area < aShape.getArea())
			return -1;
		else if(this.area > aShape.getArea())
			return 1;
		else
			return this.type.compareTo(aShape.getType());
	}
}
