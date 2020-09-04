public class BigBar {
	public static void main(String args[]) {
		Drink sour = new TallGlass();
		sour = new SourMix(sour);
		sour = new Ice(sour);
		sour = new Gin(sour);
		System.out.println(sour.getDescription() + " $" + sour.cost());
		Drink shotzilla = new ShotGlass();
		shotzilla = new Vodka(shotzilla);
		shotzilla = new Vodka(shotzilla);
		shotzilla = new Cherry(shotzilla);
		System.out.println(shotzilla.getDescription() + " $" + shotzilla.cost());
		Drink superDrink = new TallGlass();
		superDrink = new Rum(superDrink);
		superDrink = new Gin(superDrink);
		superDrink = new Ice(superDrink);
		superDrink = new SourMix(superDrink);
		superDrink = new Cherry(superDrink);
		System.out.println(superDrink.getDescription() + " $" + superDrink.cost());
		
	}
}