
public class CalculadoraSimple {

	public static int sumar(int a, int b) {
		return a + b;
	}

	public static int restar(int a, int b) {
		return a - b;
	}

	public static int multiplicar(int a, int b) {
		return a * b;
	}

	public static double dividir(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {

		int a = 10;
		int b = 3;

		System.out.println("a + b = " + sumar(a, b));
		System.out.println("a - b = " + restar(a, b));
		System.out.println("a * b = " + multiplicar(a, b));
		System.out.println("a / b = " + dividir(a, b));

	}

}

