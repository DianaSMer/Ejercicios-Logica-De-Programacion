package ejercicio;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Pon el número en la posición que se indica a continuación " + i + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("Array Original:");
        ArrayConI(numeros);
        
        ordenar(numeros);
        
        System.out.println("\nArray con los primos:");
        ArrayConI(numeros);

	}

	private static void ArrayConI(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice " + i + ": " + array[i]);
        }
    }
	
	
	private static void ordenar(int[] array) {
        int[] resultado = new int[array.length];
        int indice = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (esPrimo(array[i])) {
                resultado[indice++] = array[i];
            }
        }
	
        for (int i = 0; i < array.length; i++) {
            if (!esPrimo(array[i])) {
                resultado[indice++] = array[i];
            }
        }
        System.arraycopy(resultado, 0, array, 0, array.length);
    }
	
	
	private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
	
}