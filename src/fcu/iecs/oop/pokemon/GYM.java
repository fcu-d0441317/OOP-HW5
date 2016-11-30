package fcu.iecs.oop.pokemon;

import java.util.Random;

public class GYM 
{
	
	public static void fight(Pokemon p1, Pokemon p2)
	{ 
		Random rand = new Random() ;
		
		if(rand.nextInt(2) == 0)
		{
			p1.set_CP(p1.get_CP()+500) ;
			System.out.println("Winner is " + p1.get_name()) ;
			System.out.println("cp = " + p1.get_CP()) ;
		}
		else
		{
			p2.set_CP(p2.get_CP()+500) ;
			System.out.println("Winner is " + p2.get_name()) ;
			System.out.println("cp = " + p2.get_CP()) ;
		}
	}
	
}
