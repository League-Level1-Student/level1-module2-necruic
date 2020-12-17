package _02_smurf;

public class smurf_runner {
public static void main(String[] args) {
	Smurf handysmurf = new Smurf("Handy");
handysmurf.eat();
String name = handysmurf.getName();
System.out.println(name);
	Smurf papasmurf = new Smurf("Papa");
papasmurf.eat();
String name4 = papasmurf.getName();
String name5 = papasmurf.getHatColor();
String name6 = papasmurf.isGirlOrBoy();
System.out.println(name4);
System.out.println(name5);
System.out.println(name6);
	Smurf smurfette = new Smurf("Smurfette");
smurfette.eat();
String name7 = smurfette.getName();
String name8 = smurfette.getHatColor();
String name9 = smurfette.isGirlOrBoy();
System.out.println(name7);
System.out.println(name8);
System.out.println(name9);
}
}
