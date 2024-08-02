package projects.loops;

public class ArmstrongNums {

	public static void main(String[] args) {

		int num;
		double total = 0;
		int k1, k2, k3;

		for (int i = 100; i <= 999; i++) {
			num = i;

			k1 = num % 10;
			num /= 10;
			k2 = num % 10;
			k3 = num / 10;

			total = Math.pow(k1, 3) + Math.pow(k2, 3) + Math.pow(k3, 3);

			if (total == i) {
				System.out.println(i + " ");
			}

		}

	}

}
