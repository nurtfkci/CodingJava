package lessons.loops;

public class BreakContinue {
	
	public static void main(String[] args) {
		
		//Break : stops the loop
		while(true) {
			System.out.println("*");
			break;
		}
		
		
		//Continue : skips the loop
		
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
	}

}
