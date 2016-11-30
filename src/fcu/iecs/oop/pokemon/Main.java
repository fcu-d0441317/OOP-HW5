package fcu.iecs.oop.pokemon;

public class Main 
{

	public static void main(String[] args) 
	{
		  Pokemon pokemon1 = new Pokemon("Psyduck", 100);
		  Pokemon pokemon2 = new Pokemon("Pikachu", 300);
		    
		  
		  GYM.fight(pokemon1, pokemon2); 
		  
	}

}
