
public class Item {
	
	int attack;
	String name;
	String description;
	boolean isEquipped;
	int durability;
	
	public String toString(){
		return name + "\nAttack Power: " + attack + "\n" + description;
	}

}
