import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static PlayerClass player = new PlayerClass();

	public static void main(String[] args) {
		Main game = new Main();
		game.play();
	}
	
	public void play() {
		Scanner keyb = new Scanner(System.in);
		int numberOfRooms = 0;
		System.out
				.println("Welcome to Dungeon Hunter, please enter your name.");
		String playerName = keyb.nextLine();
		System.out
				.println("\nWelcome "
						+ playerName
						+ ", after a long and hard process of running your name through different algorithms \nI bestow onto you the legendary name Lightning Sword33! \nPlease select a difficulty: \n(E)asy \n(M)edium \n(H)ard");
		String difficulty = keyb.nextLine();
		if (difficulty.equalsIgnoreCase("e")) {
			numberOfRooms = 9;
		} else if (difficulty.equalsIgnoreCase("m")) {
			numberOfRooms = 12;
		} else if (difficulty.equalsIgnoreCase("h")) {
			numberOfRooms = 15;
		}
		System.out.println("There is " + numberOfRooms + " rooms.");
		String confirm;
		do {
			classChoice();
			System.out
					.println("\nDo you want to play this class? \n(Y)es \n(N)o");
			confirm = keyb.nextLine();
		} while (confirm.equalsIgnoreCase("n"));
		
		for (int i = 0; i < numberOfRooms; i++) {
			System.out.println("Please click next");
		}
		
	}
	
	public void battle(){
		
		
		
	}

	public void classChoice() {
		Scanner keyb = new Scanner(System.in);
		String classChoice = "\nPlease select a class: \n(W)arrior \n(A)rcher \n(M)age";
		System.out.println(classChoice);
		String classSelection = keyb.nextLine();
		if (classSelection.equalsIgnoreCase("w")) {
			player.health = 30;
			player.attack = 15;
			player.magic = 9;
			System.out.println(player);
		} else if (classSelection.equalsIgnoreCase("a")) {
			player.health = 20;
			player.attack = 18;
			player.magic = 17;
			System.out.println(player);
		} else if (classSelection.equalsIgnoreCase("m")) {
			player.health = 15;
			player.attack = 20;
			player.magic = 36;
			System.out.println(player);
		}

	}
	
	public static ArrayList<Item> itemList = new ArrayList<Item>();

	public void itemInit(){
		Item greatSword = new Item();
		greatSword.attack = 5;
		greatSword.name = "Great Sword";
		greatSword.description = "It's like a normal sword... But greater.";
		greatSword.durability = 15;
		
		itemList.add(greatSword);
		
		Item greatBow = new Item();
		greatBow.attack = 20;
		greatBow.name = "Great Bow";
		greatBow.description = "It's like a normal bow... But greater.";
		greatBow.durability = 15;
		
		itemList.add(greatBow);
		
		Item greatStaff = new Item();
		greatStaff.attack = 23;
		greatStaff.name = "Great Staff";
		greatStaff.description = "It's like a normal staff... But greater.";
		greatStaff.durability = 15;
		
		itemList.add(greatStaff);
		
		Item pelesus = new Item();
		pelesus.attack = 69;
		pelesus.name = "Pelesus Sword";
		pelesus.description = " a magic sword that makes its wielder victorious in the battle or the hunt.";
		pelesus.durability = 7;
		
		itemList.add(pelesus);
		
		Item apollo = new Item();
		apollo.attack = 69;
		apollo.name = "Apollo Bow";
		apollo.description = "a bow that was crafted of sun rays. To protect his mother, Apollo begged Hephaestus for a bow and arrows.";
		apollo.durability = 7;

		itemList.add(apollo);
		
		Item circe = new Item();
		circe.attack = 69;
		circe.name = "Circe's Staff";
		circe.description = "Circe was renowned for her vast knowledge of potions and herbs, through the use of these and a magic wand or a staff, she transformed her enemies, or those who offended her, into animals.";
		circe.durability = 7;
		
		itemList.add(circe);
		
		Item riptide = new Item();
		riptide.attack = 25;
		riptide.name = "Riptide";
		riptide.description = "a sword that always returns to your inventory after losing it";
		riptide.durability = 10;
		
		itemList.add(riptide);
		
		Item pan = new Item();
		pan.attack = 27;
		pan.name = "Pan's Flute";
		pan.description = "calls upon nature itself to help you in the fight";
		pan.durability = 10;
		
		itemList.add(pan);
		
		Item artemis = new Item();
		artemis.attack = 29;
		artemis.name = "Artemis's Bow";
		artemis.description = " a golden bow that was crafted of moonlight and silver wood or made of gold. She got her bow for the first time from the Cyclops, as the one she asked from her father.";
		artemis.durability = 10;
		
		itemList.add(artemis);
		
		
	}
	
	public static ArrayList<Abilities> abilityList = new ArrayList<Abilities>();
	
	public void abilityInit(){
		
		Abilities frostArrow = new Abilities();
		frostArrow.name = "Frost Arrow";
		frostArrow.damage = 7;
		frostArrow.cooldown = 4;
		frostArrow.manaCost = 6;
		
		abilityList.add(frostArrow);
		
		Abilities flameArrow = new Abilities();
		flameArrow.name = "Flame Arrow";
		flameArrow.damage = 11;
		flameArrow.cooldown = 5;
		flameArrow.manaCost = 8;
		
		abilityList.add(flameArrow);
		
		Abilities hydroArrow = new Abilities();
		hydroArrow.name = "Hydro Arrow";
		hydroArrow.damage = 5;
		hydroArrow.cooldown = 3;
		hydroArrow.manaCost = 2;
		
		abilityList.add(hydroArrow);
		
		Abilities orbOfLava = new Abilities();
		orbOfLava.name = "Orb Of Lava";
		orbOfLava.damage = Utilities.multiplyer(8);
		orbOfLava.cooldown = 5;
		orbOfLava.manaCost = 9;
		
		abilityList.add(orbOfLava);
		
		Abilities arcticBlizzard = new Abilities();
		arcticBlizzard.name = "Arctic Blizzard";
		arcticBlizzard.damage = Utilities.multiplyer(4);
		arcticBlizzard.cooldown = 5;
		arcticBlizzard.manaCost = 7;
		
		abilityList.add(arcticBlizzard);
		
		Abilities lightningCircus = new Abilities();
		lightningCircus.name = "lightningCircus";
		lightningCircus.damage = Utilities.multiplyer(6);
		lightningCircus.cooldown = 6;
		lightningCircus.manaCost = 12;
		
		abilityList.add(lightningCircus);
		
		Abilities lightningSword = new Abilities();
		lightningSword.name = "Lightning Sword";
		lightningSword.damage = 33;
		lightningSword.cooldown = 3;
		lightningSword.manaCost = 9;
		
		abilityList.add(lightningSword);
		
		Abilities flameSaber = new Abilities();
		flameSaber.name = "Flame Saber";
		flameSaber.damage = 22;
		flameSaber.cooldown = 4;
		flameSaber.manaCost = 8;
		
		abilityList.add(flameSaber);
		
		Abilities thirtyTwoPoundCannon = new Abilities();
		thirtyTwoPoundCannon.name = "Thirty Two Pound Cannon";
		thirtyTwoPoundCannon.damage = 32;
		thirtyTwoPoundCannon.cooldown = 5;
		thirtyTwoPoundCannon.manaCost = 11;
		
		abilityList.add(thirtyTwoPoundCannon);
		
	}
	
	public static ArrayList<Enemy> enemies = new ArrayList<Enemy>();
	
	public void enemyInit(){
		
		Enemy todd = new Enemy();
		todd.name = "Todd the God";
		todd.attack = 69;
		todd.health = 69;
	
		enemies.add(todd);
		
		Enemy daniel = new Enemy();
		daniel.name = "Daniel Dumpling";
		daniel.attack = 1010;
		daniel.health = 1691;
		
		enemies.add(daniel);
		
		Enemy josh = new Enemy();
		josh.name = "Josh NoGo";
		josh.attack = 10;
		josh.health = 80;
		
		enemies.add(josh);
		
		Enemy kyle = new Enemy();
		kyle.name = "Kyle Small Dong";
		kyle.attack = 2;
		kyle.health = 8;
		
		enemies.add(kyle);
		
		Enemy jackE = new Enemy();
		jackE.name = "Troll King Jack-E";
		jackE.attack = 2000000;
		jackE.health = 1;
		
		enemies.add(jackE);
		
		Enemy jeffery = new Enemy();
		jeffery.name = "Jeffery Yang Yong";
		jeffery.attack = 1;
		jeffery.health = 5000;
		
		enemies.add(jeffery);
		
		Enemy prowse = new Enemy();
		prowse.name = "Prowse The Pudgy";
		prowse.attack = 123;
		prowse.health = 321;
		
		enemies.add(prowse);
		
		Enemy brendan = new Enemy();
		brendan.name = "Brenda The Muggle";
		brendan.attack = 1;
		brendan.health = 10;
		
		enemies.add(brendan);
		
		Enemy antho = new Enemy();
		antho.name = "Antho the Dangster";
		antho.attack = 5;
		antho.health = 23;

		enemies.add(antho);
		
		Enemy alan = new Enemy();
		alan.name = "Alan Yong Yang";
		alan.attack = 5000;
		alan.health = 1;
		
		enemies.add(alan);
		
		Enemy bryan = new Enemy();
		bryan.name = "Bryan Never Win";
		bryan.attack = 1;
		bryan.health = 1;
		
		enemies.add(bryan);
		
		Enemy carmen = new Enemy();
		carmen.name = "Beats You With Your Own Shoe Carmen";
		carmen.attack = player.attack + 16;
		carmen.health = 29;
		
		enemies.add(carmen);
		
		Enemy chao = new Enemy();
		chao.name = "Dic Shows";
		chao.attack = 12;
		chao.health = 24;
		
		enemies.add(chao);
		
		Enemy jacko = new Enemy();
		jacko.name = "JackOLantern";
		jacko.attack = 64;
		jacko.health = 128;
	
		enemies.add(jacko);
		
		Enemy eren = new Enemy();
		eren.name = "ErenYaeger1";
		eren.attack = 11;
		eren.health = 22;
		
		enemies.add(eren);
		
	}

	
	
}
