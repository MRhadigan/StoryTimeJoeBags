package JoeBags;

public abstract class Weapon {
	
	private String name;
	private int dmg; //This is the max damage a weapon can deal.
	private int range;
	
	public Weapon() {
		this.name = name;
		this.dmg = dmg;
		this.range = range;
		
	}
	
	
	public Weapon(String name, int dmg, int range) {
		this.name = name;
		this.dmg = dmg;
		this.range = range;
		
	}

	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dmg
	 */
	public int getDmg() {
		return dmg;
	}

	/**
	 * @param dmg the dmg to set
	 */
	public void setDmg(int dmg) {
		this.dmg = dmg;
	}

	/**
	 * @return the range
	 */

	public int getRange() {
		return range;
	}
	
	
	/**
	 * @param range the range to set
	 */
	
	public void setRange(int range) {
		this.range = range;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Weapon [name=" + name + ", dmg=" + dmg + ", getName()=" + getName() + ", getDmg()=" + getDmg()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}




}
