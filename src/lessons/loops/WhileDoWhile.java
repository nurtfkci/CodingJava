package lessons.loops;

public class WhileDoWhile {

	public static void main(String[] args) {

		/*
		 * while(condition){
		 *      -code-
		 *      -cond. breaker-
		 * }
		 * 
		 * ******* works until condition breaks *****
		 * 
		 * 
		 * do{
		 *      -code-
		 * }while(condition);
		 * 
		 * ***** works once and then until condition breaks *****
		 */
		
		int num=1;
		
		while(num<=10) {
			System.out.print( num + "*\n");
			num++;
		}
		
		do {
			System.out.print( num + "*\n");
			--num;
		}while(num>0);
		
	}

}
