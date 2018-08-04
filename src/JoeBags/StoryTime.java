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
		
//		Weapon a = new Gun("Sig 226", 1, 45);
//		System.out.println(a);
	
		Gun sniper = new Gun();
		sniper.setName("Barret .50 cal");
		sniper.setDmg(10);
		sniper.setRange(600);
		sniper.setMagCap(5);  
		System.out.println(sniper);
		
		Gun c = new Gun();
		c.setMagCap(18);

		
		
		 
		do {
			int r = sniper.getMagCap();
			if (r > 0) {
				System.out.println("Would you like to take a shot? y/n");
				shoot = scan.nextLine();
				r -= 1;
				sniper.setMagCap(r);
				System.out.println("There are " + sniper.getMagCap() + " rounds left in your magazine");
			} 
			else if (sniper.getMagCap() == 0) { 
				System.out.println("Your " + sniper.getName() + " needs to be relaoded!");
				break;
			}
		} while (shoot.equalsIgnoreCase("y"));
		
		
				
				
		
		
		
		
	}

}
