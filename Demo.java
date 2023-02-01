

class Demo {
	public static void main(String... args){
		int getallen[][] = new int[3][];
		getallen[2] = new int[4];
		getallen[2][2] = 7;
		System.out.println(getallen [2][2]);
		
		int[] nummer = {3,4,5,6};
		int[][][] cijfer[] = new int[5][][][];
		for( int[][][] g : cijfer){
			System.out.println(g);
		}
		
	}	
}
