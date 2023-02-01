class Demo {
	public static void main(String... args){
		Boerderij b1 = new Boerderij();
		System.out.println(   b1.farmer.voornaam    );
		Boer boer2 = new Boer("Karel");
		b1.farmer = boer2;
		System.out.println(   b1.farmer.voornaam    );
		Boer farmereur3 = new Boer("Maria");
		b1.andereBoerAannemen( new Boer("willem") );
		System.out.println(   b1.farmer.voornaam    );
		b1.andereBoerAannemen(farmereur3);
	}	
}
class Boerderij{
	Boer farmer = new Boer("joost");
	void andereBoerAannemen(Boer bbb) {
		this.farmer = bbb;
	}
}
class Boer{
	String voornaam = "frits";
	Boer(String name){
		voornaam = name;
	}
}
