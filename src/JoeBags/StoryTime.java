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
	
		Gun b = new Gun();
		b.setName("Sniper");
		b.setDmg(10);
		b.setRange(600);
		b.setMagCap(5);  
		System.out.println(b);
		

		
		
		 
		do {
			int r = b.getMagCap();
			if (r >= 0) {
				r -= 1;
				b.setMagCap(r);
				System.out.println("Would you like to take another shot? y/n");
				shoot = scan.nextLine();
				System.out.println(b.getMagCap());
			} 
		} while (shoot.equalsIgnoreCase("y"));
		
		System.out.println("You have " + b.getMagCap() + " rounds left.");
		
		
		
		
	}

}
