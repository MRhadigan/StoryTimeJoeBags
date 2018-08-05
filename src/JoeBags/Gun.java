package JoeBags;

public class Gun extends Weapon {

	private int magCap; // amount of ammo a gun can hold
	private boolean attachment;
	private int roundsInMag;

	public Gun() {
		
		
	}

	public Gun(String name, int dmg, int range) {
		super(name, dmg, range);
		
	}
		
	public Gun(String name, int dmg, int range, int magCap) {
		super(name, dmg, range);
		this.magCap = magCap;
		
	}
	
	public Gun(String name, int dmg, int range, int magCap, boolean attachment) {
		super(name, dmg, range);
		this.magCap = magCap;
		this.attachment = attachment;
	}
	
	/**
	 * @return the magCap
	 */
	public int getMagCap() {
		return magCap;
	}

	/**
	 * @param magCap the magCap to set
	 */
	public void setMagCap(int magCap) {
		this.magCap = magCap;
	}

	/**
	 * @return the attachment
	 */
	public boolean isAttachment() {
		return attachment;
	}

	/**
	 * @param attachment the attachment to set
	 */
	public void setAttachment(boolean attachment) {
		this.attachment = attachment;
	}

	public int getRoundsInMag() {
		return roundsInMag;
	}
	
	public void setRoundsInMag(int startingAmmo) {
		this.roundsInMag = startingAmmo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getName() + " Damage output = " +  getDmg() + " " + magCap + " round magazine";

	}

	
	
}
