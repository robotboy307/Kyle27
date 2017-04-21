import java.util.ArrayList;

public class PlayerClass {

	String name;
	int health;
	int attack;
	int magic;
	Item equippedItem;
	ArrayList<Item> items = new ArrayList<Item>();
	
	public int getAttack() {
		return equippedItem.attack + attack;
	}

	public String toString() {
		return "Health: " + health + "\nAttack: "
				+ attack + "\nMagic: " + magic;
	}
	

}
