package ejercicio;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio9 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
    HashMap<String, String> diccionario = new HashMap<> ();
		
		diccionario.put("en", "in");
		diccionario.put("las", "the");
		diccionario.put("noches", "nights");
		diccionario.put("claras", "clear");
		diccionario.put("resuelvo", "solve (I solve)");
		diccionario.put("el", "the");
		diccionario.put("problema", "the");
		diccionario.put("de", "of");
		diccionario.put("la", "the");
		diccionario.put("soledad", "loneliness synonim: solitude");
		diccionario.put("del", "of");
		diccionario.put("ser", "being");
		diccionario.put("invito", "invite (I invite)");
		diccionario.put("a", "to (in the translation of the poem is omited");
		diccionario.put("luna", "moon");
		diccionario.put("y", "and");
		diccionario.put("con", "with");
		diccionario.put("mi", "my");
		diccionario.put("sombra", "shadow");
		diccionario.put("nosotros", "we");
		diccionario.put("somos", "are");
		diccionario.put("tres", "three");
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pon una palabra del poema En las noches claras de Gloria Fuentes");
		String palEsp = scanner.nextLine().toLowerCase();
		
		
		String traductor = diccionario.get(palEsp);
		
		if (traductor != null) {
		
		System.out.println ("la traduccion con contexto es " + traductor);
		} else {
			System.out.println("esa palabra no esta en el poema :(");
		}
		
	}
    }

