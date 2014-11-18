package arrays;

public class App {

	public static void main(String[] args) {

		Cat cat1 = new Cat();

		cat1.name = "Charles";
		cat1.age = 2;
		cat1.breed = "British Shorthair";
		cat1.color = "gray";

		Cat cat2 = new Cat();

		cat2.name = "Lilly";
		cat2.age = 5;
		cat2.breed = "unknown";
		cat2.color = "white";

		Cat[] cats = { cat1, cat2 };

		for (int i = 0; i < cats.length; i++) {

			System.out.println(cats[i].name);
		}
		
		
		StrUtils su = new StrUtils();
		

		Plant plant1 = new Plant();

		plant1.botanicalName = "Cannabis sativa";
		plant1.germanName = "Hanf";

		Plant plant2 = new Plant();

		plant2.botanicalName = "Atropa belladonna";
		plant2.germanName = "Tollkirsche";

		Plant plant3 = new Plant();

		plant3.botanicalName = "Vitis vinifera";
		plant3.germanName = "Wein";

		Plant plant4 = new Plant();

		plant4.botanicalName = "Citrus aurantium var. dulcis";
		plant4.germanName = "Orange";

		Plant plant5 = new Plant();

		plant5.botanicalName = "Thuja occidentalis";
		plant5.germanName = "Lebensbaum";

		Plant[] plants = { plant1, plant2, plant3, plant4, plant5 };

		for (int i = 0; i < plants.length; i++) {

			String s = plants[i].botanicalName;
			
			int count = su.countChars(s);
			
			System.out.println(count);
		}
	}
}
