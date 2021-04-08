package javaPrint;

public class PrintElements
{
	private String name;
	private String nationality;
	private String dream;
	
	public void printElements(String name, String nationality, String dream)
	{
		String message  = "		Name: " + name + "\n";
		       message += "		Nationality: " + nationality + "\n";
		       message += "		Biggest Dream: " + dream + "\n";
		
		System.out.println(message);
	}
	
	public String getName()
	{ 
		return name;
	}
	
	public String getNationality()
	{ 
		return nationality;
	}
	
	public String getDream()
	{ 
		return dream;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setNationality(String nationality)
	{
		this.nationality = nationality;
	}
	
	public void setDream(String dream)
	{
		this.dream = dream;
	}
}
