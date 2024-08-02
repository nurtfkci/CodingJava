package lessons.special;

public class PalindromNums {

	
	static int reverse(int num) {
		
		int rem, rev=0;
		
		while (num != 0) {
			rem= num%10;
			rev = rev*10 +rem;
			num/=10;
		}
		
		return rev;

	}

	static boolean isPal(int n) {
		
		if(reverse(n) == n) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {

		System.out.println(isPal(555));
	}

}
