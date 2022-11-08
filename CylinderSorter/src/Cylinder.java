
public class Cylinder {
	private double radius;
	private double height;
	private String name;
	
	
	public Cylinder(String aN, double aR, double aH)
	{
		this.setHeight(aH);
		this.setRadius(aR);
		this.setName(aN);
	}
	public double getRadius()
	{
		return this.radius;
	}
	public double getHeight()
	{
		return this.height;
	}
	public String getName()
	{
		return this.name;
	}
	public void setRadius(double aR)
	{
		if(radius >= 0)
			this.radius = aR;
		else
			this.radius = 0.0;
	}
	public void setHeight(double aH)
	{
		if(height >= 0)
			this.height = aH;
		else
			this.height = 0.0;
	}
	public void setName(String aN)
	{
		this.name = aN;
	}
	public double volume()
	{
		return Math.PI * height * radius * radius;
	}
	
}
