class Demo {
	public static void main(String... args){
		Boerderij b1 = new Boerderij();
		System.out.println(b1.boer.voornaam);
		b1.lopen(new Boer("ronald"));
		System.out.println(b1.boer.voornaam);
		System.out.println("einde");
	}	
}
class Boerderij{
	Boer boer = new Boer("joost");	
	void lopen(Boer boer) {
		System.out.println(boer.voornaam);
		this.boer = boer;
	}
}
class Boer{
	String voornaam = "backupvoornaam";
	Boer(String voornaam){ 
		System.out.println(voornaam + "is geboren");
		this.voornaam = voornaam;
	}
}
