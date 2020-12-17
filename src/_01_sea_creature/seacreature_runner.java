package _01_sea_creature;

public class seacreature_runner {
public static void main(String[] args) {
	SeaCreature spongebob = new SeaCreature("Spongebob");
	spongebob.eat();
	spongebob.laugh();
	SeaCreature patrick = new SeaCreature("Patrick");
	String food = patrick.getName();
	System.out.println(food);
	patrick.eat();
	patrick.laugh();
	SeaCreature squidward = new SeaCreature("Squidward");
	String food2 = patrick.getName();
	System.out.println(food2);
	squidward.eat();
	squidward.laugh();
}
}
