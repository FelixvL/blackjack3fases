import java.util.Random;
import java.util.Scanner;

public class Demo {
	public static void main(String args[]) {
		System.out.println("Welkom Bij BlackJack");
		Scanner kaart = new Scanner(System.in);
		while(true) {
			System.out.println("verder gaan (d)");
			System.out.println("om te stoppen (q)");
			String jouwkaart = kaart.nextLine();
			System.out.println("jouw kaart : " + jouwkaart);
			char dekeuze = jouwkaart.charAt(0);
			System.out.println(dekeuze);
			if (dekeuze == 'q') {
				System.out.println("bedankt voor het spelen");
			} else {
				System.out.println("we gaan ervoor");
				String[] kleuren = {"Harten","Klaver","Ruiten","Schoppen"};
				Random r = new Random();
				int getal = r.nextInt(4);
				String[] waarden = {"2","3","4","5","6","7","8","9","10","B","V","H","A"};
				int getal2 = r.nextInt(13);
				System.out.print(kleuren[getal]);
				System.out.println(waarden[getal2]);					
			}
		}
		
	}
}

//  1      Functionele doelstelling
// concreet NIET TECHNISCH
// opknippen MOET!!

//  2      Technische strategie
// WEL technisch
// probleem

//  3      Coderen / Typen
