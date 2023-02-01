class Demo {
    public static void main(String... args) {
        Dierenasiel da = new Dierenasiel();
        Kat k1 = new Kat();
        k1.soort = "rode kat";
        da.katten[2] = new Kat().soort;
        da.katten[0] = k1.soort;
        da.katten[1] = new Kat("lelijke kat").soort;
        da.katten[4] = new Kat().soort;
        da.katten[5] = new Kat("munchkin").soort;
//        
        for( String k : da.katten) {
                System.out.println(k);
        }
    }
}
class Kat {
    String soort;
    int aantalPoten;   
    Kat() {
        soort = "kitten";
    }
    Kat(String soort) {
        this.soort = soort;
    }
}
class Dierenasiel {
    String[] katten = new String[5];
}
