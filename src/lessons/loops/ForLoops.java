package lessons.loops;

public class ForLoops {
	
	public static void main(String[] args) {
		
		// for(initialization; condition; increment,decrement;);
		
		for(int i=0; i<10; i++) {
			for(int k=0; k<i;k++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}

}
