package iniciacionHilos;

public class Power extends Thread {
	
	private final int number;
	
	Power(int number) {
		this.number=number;
	}
	
	
	@Override
	public void run() {
		for (int i=1; i<=10; i++) {
			System.out.printf("%d ^ %d = %.0f%n",number,i,(Math.pow(number, i)));
			
		}
		
	}
	
	
}
