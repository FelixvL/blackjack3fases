import java.util.Random;
import java.util.Scanner;

public class Demo {
	public static void main(String args[]) {
		BlackJack bj = new BlackJack();
		bj.starten();
	}
}
class BlackJack{
	Scanner kaart = new Scanner(System.in); //2
	void starten() {//3
		System.out.println("Welkom Bij BlackJack");
		boolean doorgaan = true;
		while(doorgaan) {
			doorgaan = kaartvragen();//4
		}
	}
	boolean kaartvragen() { //1
		System.out.println("verder gaan (d)");
		System.out.println("om te stoppen (q)");
		String jouwkaart = kaart.nextLine();
		System.out.println("jouw kaart : " + jouwkaart);
		char dekeuze = jouwkaart.charAt(0);
		System.out.println(dekeuze);
		if (dekeuze == 'q') {
			System.out.println("bedankt voor het spelen");
			return false;
		} else {
			System.out.println("we gaan ervoor");
			String[] kleuren = {"Harten","Klaver","Ruiten","Schoppen"};
			Random r = new Random();
			int getal = r.nextInt(4);
			String[] waarden = {"2","3","4","5","6","7","8","9","10","B","V","H", "A"};
			int[] kaartwaarden = {2, 3,  4,  5,  6,  7,  8,  9,  10, 10, 10, 10,10,11};
			int getal2 = r.nextInt(13);
			System.out.print(kleuren[getal]);
			System.out.println(waarden[getal2]);
			Kaart kaart = new Kaart(kleuren[getal], waarden[getal2], kaartwaarden[getal2]);
		}
		toonHand();
		return true;
	}
	void toonHand() {
		System.out.println("DIT ZIJN JE KAARTEN");
	}
}

class Kaart{
	String kleur;
	String waarde;
	int kaartwaarde;
	
	Kaart(String kleurP, String waarde, int kaartwaarde){
		kleur = kleurP;
		this.waarde = waarde;
		this.kaartwaarde = kaartwaarde;
	}
}


//  1      Functionele doelstelling
// concreet NIET TECHNISCH
// opknippen MOET!!

//  2      Technische strategie
// WEL technisch
// probleem

//  3      Coderen / Typen
