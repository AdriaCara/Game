
public abstract class Character {
	
	private String name; //String
	
	private double weight; //double (50 - 150)
	
	private double height; //double (1,50 - 2)
	
	private double painTolerance; //double (0 - 10)
	
	private double internalDamage; //double (0 - 100)
	
	private double regeneration; //double (0 - 100)
	
	private int level; //int (0 - 100)
	
	private int strong; //int (0 - 10)
	
	private int hability; //int (0 - 10)
	
	private int magic; //int (0 - 10)
	
	//private runSound;
	
	//private hurtSound;
	
	public Character(String name, double weight, double height, double painTolerance, double internalDamage, double regeneration, int level, int strong, int hability, int magic) {
		
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.painTolerance = painTolerance;
		this.internalDamage = internalDamage;
		this.regeneration = regeneration;
		this.level = level;
		this.strong = strong;
		this.hability = hability;
		this.magic = magic;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getPainTolerance() {
		return painTolerance;
	}

	public void setPainTolerance(double painTolerance) {
		this.painTolerance = painTolerance;
	}

	public double getInternalDamage() {
		return internalDamage;
	}

	public void setInternalDamage(double internalDamage) {
		this.internalDamage = internalDamage;
	}

	public double getRegeneration() {
		return regeneration;
	}

	public void setRegeneration(double regeneration) {
		this.regeneration = regeneration;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getStrong() {
		return strong;
	}

	public void setStrong(int strong) {
		this.strong = strong;
	}

	public int getHability() {
		return hability;
	}

	public void setHability(int hability) {
		this.hability = hability;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	abstract protected void move(); //move
	
}
