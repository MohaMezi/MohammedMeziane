import java.util.Scanner;

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

	public static double dividir(double a, double b) {
		return a / b;
	}

	public static void main(String[] args) {

		Scanner consola=new Scanner(System.in);
		
		System.out.println("Introduce variable a: ");
		int a = consola.nextInt();consola.nextLine();

		System.out.println("Introduce variable b: ");
		int b = consola.nextInt();

		System.out.println("a + b = " + sumar(a, b));
		System.out.println("a - b = " + restar(a, b));
		System.out.println("a * b = " + multiplicar(a, b));
		System.out.println("a / b = " + dividir(a, b));

	}

}

