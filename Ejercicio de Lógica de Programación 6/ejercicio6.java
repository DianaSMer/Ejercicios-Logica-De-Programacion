package principal;

import java.util.Scanner;

public class Inversion {
	
	 
	
	public static  String invertirTexto(String texto) {
		
		char[] charArr = texto.toCharArray();
		for (int i = 0, j = charArr.length - 1; i < j; i++, j--) {
            char temp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = temp;
		}
		return new String(charArr);
		
	}

	
}