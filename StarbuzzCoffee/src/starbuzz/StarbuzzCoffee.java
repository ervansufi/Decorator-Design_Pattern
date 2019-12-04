public class StarbuzzCoffee {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " Seharga $" + beverage.cost());

        Beverage beverage3 = new MilkShake();
        beverage3 = new Oreo(beverage3);
        System.out.println(beverage3.getDescription() + " Seharga $" + beverage3.cost());

        // menampilkan harga Houseblend dengan soy mocha dan whip
        Beverage beverage4 = new HouseBlend();
		beverage4 = new Soy(beverage4);
		beverage4 = new Mocha(beverage4);
		beverage4 = new Whip(beverage4);
		System.out.println(beverage4.getDescription() 
				+ " Seharga $" + beverage4.cost());
        
        //harga double espresso
        Beverage beverage5 = new Espresso();
        System.out.println("harga double "+beverage5.getDescription()
                + " $" + beverage5.cost()*2);
        // harga darkroast dengan double mocha dan whip
        Beverage beverage6 = new DarkRoast();
		beverage6 = new Mocha(beverage6);
		beverage6 = new Mocha(beverage6);
		beverage6 = new Whip(beverage6);
		System.out.println(beverage6.getDescription() 
				+ " seharga $" + beverage6.cost());
        
        //harga milkshake dengan soy dan mocha
        Beverage beverage7 = new MilkShake();
		beverage7 = new Soy(beverage7);
		beverage7 = new Mocha(beverage7);
		System.out.println(beverage7.getDescription() 
				+ " seharga $" + beverage7.cost());

        // harga milkshake ditambah dengan milk dan mocha
        beverage2 = new Milk(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " Seharga $" + beverage2.cost());
    }
}
