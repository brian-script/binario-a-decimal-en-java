import java.util.Scanner;

public class bin_a_decimal {
	public static void main(String[] args) {
		System.out.println("***PROGRAMA: BINARIO A DECIMAL***\n");

		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese un numero binario: ");
		String numstr = teclado.nextLine();

		int resultado = 0;
		StringBuilder sb = new StringBuilder(numstr);
		sb.reverse();
		
		for(int i = 0; i < sb.length(); i++){
			int num = Character.getNumericValue(sb.charAt(i));

			double elevado = Math.pow(2, i);

			resultado += num * elevado;
		}

		System.out.println("la conversion es: " + resultado);
	}
}
