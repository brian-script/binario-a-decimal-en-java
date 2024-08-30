import java.util.Scanner;

public class decimal_binario {

	Scanner scanner = new Scanner(System.in);
	
	System.out.println("***PROGRAMA: DECIMAL A BINARIO***\n");
	System.out.print("Ingresa un numero: ");
	int num = scanner.nextInt();

	for (;num > -2;) {
		int residuo = num % 2;
		String resultado = residuo + resultado;
		int cociente = num / 2;
		System.out.println(resultado);
	}
}
