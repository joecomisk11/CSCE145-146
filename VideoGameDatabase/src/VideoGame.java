//Written by Joe Comiskey

public class VideoGame {
	//instance variables
	private String name;
	private String console;
	
	//constructor
	public VideoGame() {
		this.name = this.console = "none";
	}
	//parameterized constructor
	public VideoGame(String aName, String aConsole) {
		this.setName(aName);
		this.setConsole(aConsole);
	}
	//accessors
	public String getName()
	{
		return this.name;
	}
	public String getConsole()
	{
		return this.console;
	}
	//mutators
	public void setName(String aName)
	{
		if(aName != null)
			this.name = aName;
		else
			this.name = "none";
	}
	public void setConsole(String aConsole)
	{
		if(aConsole != null)
			this.console = aConsole;
		else
			this.console = "none";
}
	public String toString()
	{
		return "Name: " + this.name + " Console: " + this.console;
	}
}
