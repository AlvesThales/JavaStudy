
public class Fatorial {
	public static void main(String[] args) {
		int fatorial = 1;
		for (int i = 1; i <= 10; i++) {
			for (int j = i; j > 0; j--) {
				fatorial *= j;
			}
			System.out.println("O fatorial de " + i + " � " + fatorial);
			fatorial = 1;
		}
	}

}
