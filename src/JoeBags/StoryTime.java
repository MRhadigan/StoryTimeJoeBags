/**
 * 
 */
package JoeBags;

import java.util.Scanner;

/**
 * @author matthewrhadigan
 *
 */
public class StoryTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean userShot = true;
		String shoot = "y";
		

	
//		Gun sniper = new Gun();
//		int startingRounds = 5;
//		sniper.setName("Barret .50 cal");
//		sniper.setDmg(10);
//		sniper.setRange(600);
//		sniper.setMagCap(5);
//		sniper.setMagCap(updateRoundsInMag (sniper, startingRounds));  
//		System.out.println(sniper);

		Gun pistol = new Gun();
		pistol.setRoundsInMag(15);
		pistol.setName("Sig 226");
		pistol.setDmg(1);
		pistol.setRange(45);
		pistol.setMagCap(15);
		
		
	
		
		if(pistol.getRoundsInMag() == pistol.getMagCap()) {
			System.out.println("This weapon has a full magazine of " + pistol.getRoundsInMag() + " rounds.");
		}
		 else {System.out.println("This weapon has " + pistol.getRoundsInMag() + " rounds.");
		 }
		
		
		do {
			System.out.println("would you like to take a shot? y/n");
			shoot = scan.nextLine();
			pistol.setRoundsInMag(updateRoundsInMag(pistol, pistol.getRoundsInMag()));
		} while (shoot.equalsIgnoreCase("y") && pistol.getRoundsInMag() > 0);
		pistol.setRoundsInMag(updateRoundsInMag(pistol, pistol.getRoundsInMag()));
		
			
		
		
	}
				
	
	//custom methods start here.
	
	
		public static int updateRoundsInMag (Gun used, int r)  {
		//This method subtracts a round from the Gun RoundsInMag method.	
				r = used.getRoundsInMag();
				if (r > 0) {
					r = r - 1;
					used.setRoundsInMag(r);
					System.out.println("There are " + used.getRoundsInMag() + " rounds left in your magazine");
					
				} 
				else  { 
					System.out.println("Your " + used.getName() + " needs to be reloaded!");
					
				}return r;
			
		}
}
		
		
		
	

	
	
	



