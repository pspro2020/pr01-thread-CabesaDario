package iniciacionHilos;

public class Potencias {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			new Power(i).start();
		}

	}

}
