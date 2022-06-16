import java.util.ArrayList;
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
//	Kaart[] hand = new Kaart[10];
	ArrayList<Kaart> kaartenInDeHand = new ArrayList();
	
	void starten() {//3
		System.out.println("Welkom Bij BlackJack");
		boolean doorgaan = true;
		while(doorgaan) {
			doorgaan = kaartvragen();//4
		}
	}
	boolean kaartvragen() { //1
		System.out.print("verder gaan (d) - ");
		System.out.println("om te stoppen (q)");
		String jouwkaart = kaart.nextLine();
		char dekeuze = jouwkaart.charAt(0);
		if (dekeuze == 'q') {
			System.out.println("bedankt voor het spelen");
			return false;
		} else {
			String[] kleuren = {"Harten","Klaver","Ruiten","Schoppen"};
			Random r = new Random();
			int getal = r.nextInt(4);
			String[] waarden = {"2","3","4","5","6","7","8","9","10","Boer","Vrouw","Heer", "Aas"};
			int[] kaartwaarden = {2, 3,  4,  5,  6,  7,  8,  9,  10,   10,    10,     10,    11};
			int getal2 = r.nextInt(13);
			Kaart kaart = new Kaart(kleuren[getal], waarden[getal2], kaartwaarden[getal2]);
			kaartenInDeHand.add(kaart);
		}
		toonHand();
		return true;
	}
	void toonHand() {
		System.out.println("Kaarten In De Hand:");
		for(int x =0 ; x < kaartenInDeHand.size(); x++) {
			kaartenInDeHand.get(x).toonKaart();
			
//			Kaart temp = kaartenInDeHand.get(x);
//			temp.toonKaart();
		}
		
//		for(Kaart deKaart : kaartenInDeHand) {
//			deKaart.toonKaart();
//		}
		
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
	void toonKaart() {
		System.out.print("De kaart: " + kleur);
		System.out.print(" - " + waarde);
		System.out.println("(" + kaartwaarde+")");
	}
}


//  1      Functionele doelstelling
// concreet NIET TECHNISCH
// opknippen MOET!!

//  2      Technische strategie
// WEL technisch
// probleem

//  3      Coderen / Typen
