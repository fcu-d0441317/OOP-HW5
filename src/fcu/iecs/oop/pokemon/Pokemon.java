package fcu.iecs.oop.pokemon;

public class Pokemon 
{

	private String name ;
	private int cp ;
	
	public Pokemon()
	{
	}
	
	public Pokemon(String name,int cp)
	{
		this.name = name ;
		this.cp = cp ;
	}
	
	public String get_name()
	{
		return name ;
	}
	
	public void set_CP(int CP)
	{
		this.cp = CP ;
	}
	
	public int get_CP()
	{
		return cp ;
	}

}
