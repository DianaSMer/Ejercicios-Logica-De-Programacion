package principal;

import java.util.Scanner;

public class Findesemana {

	static void weekend () {
		 Scanner scanner = new Scanner(System.in);
		System.out.print("Pon un día de la semana ");	
		String dia = scanner.nextLine();
	 
		int diaNum = 0;
	
		
		switch (dia) {
		case "lunes":
			diaNum= 0;
			break;
		case "martes":
			diaNum = 1;	
			break;
		case "miercoles":
			diaNum = 2;
			break;
		case "jueves":
			diaNum = 3;
			break;
		case "viernes":
			diaNum = 4;
			break;
			default:
				System.out.print("Porfavor ponga un dia valido");
			
		
		}//se acaba el switch
		
		System.out.println("Pon la hora (hora y minutos)");
		
		System.out.print("Hora");
		int horas = Integer.parseInt (scanner.nextLine());
		
		System.out.print("Pon los minutos");
		int minutos = Integer.parseInt (scanner.nextLine());
		
		int minutosTotales = (4 * 24 * 60) + (15 * 60);
		int minutosActuales = (diaNum * 24 * 60) + (horas * 60) + minutos;
		
		System.out.print ("Faltan"+ (minutosTotales - minutosActuales) + "minutos para el fin de semana");
		
	}
	
	
	
}
