/*
 * Written by Joe Comiskey
 */

public class Apple {
	private String type;
	private double weight;
	private double price;
	
	
	public Apple() 
	{
		this.type = "Gala";
		this.weight = 0.0;
		this.price= 0.0;
	}
	public Apple(String aT, double aW, double aP)
	{
		this.setType(aT);
		this.setWeight(aW);
		this.setPrice(aP);
			}
	public String getType()
	{
		return this.type;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public double getPrice()
	{
		return this.price;
	}
	
	public void setType(String aT)
	{
		if(aT != null &&
				(aT.equalsIgnoreCase("gala") ||
						aT.equalsIgnoreCase("red delicious") ||
						aT.equalsIgnoreCase("golden delicious") ||
						aT.equalsIgnoreCase("granny smith")))
		{
			this.type = aT;
		}
		else
		{
			this.type = "Gala";
		}
	}
	
	public void setWeight(double aW)
	{
		if(aW >= 0.0 && aW <= 2.0)
		{
			this.weight = aW;
		}
		else 
		{
			this.weight = 0.0;
		}
	}
	public void setPrice(double aP)
	{
		if(aP >= 0.0)
		{
			this.price = aP;
		}
		else
		{
			this.price = 0.0;
		}
	}
	public String toString()
	{
		return "Type: "+this.type+" Weight: "+this.weight+" Price: "+this.price;
	}
	public boolean equals(Apple anA)
	{
		return anA != null &&
				this.type.equals(anA.getType()) &&
				this.weight == anA.getWeight() &&
				this.price == anA.getPrice();
		
	}
}
