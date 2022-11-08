public class Coffee {
	private String name;
	private double caffeineContent;
	
	
	public Coffee(String aN, int aC)
	{
		this.name = aN;
		this.caffeineContent = aC;
	}
	public String getName()
	{
		return this.name;
	}
	public double getCaffeineContent()
	{
		return this.caffeineContent;
	}
	public void setName(String aN)
	{
		if(name == null)
			this.name = "none";
		else
			this.name = aN;
	}
	public void setCaffeineContent(int aC)
	{
		if(caffeineContent < 50 || caffeineContent > 300)
			this.caffeineContent = 0;
		else
			this.caffeineContent = aC;
	}
	public double riskyAmount()
	{
		double cupsAmt = 180/((caffeineContent / 100)*6);
		return cupsAmt;
		
		}
	public String toString()
	{
		return "It will take " + riskyAmount() + " " + getName() + " before it's dangerous to drink more";
	}
}
