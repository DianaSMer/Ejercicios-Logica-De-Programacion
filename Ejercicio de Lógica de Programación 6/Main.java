import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		  System.out.print("Ingrese una palabra o frase: ");
	        String entradaUsuario = scanner.nextLine();
		
	        String resultadoInvertido = Inversion.invertirTexto(entradaUsuario);

	        System.out.println("Texto invertido: " + resultadoInvertido);

		
	
	}

}
