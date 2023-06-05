package Exercici2;

public class CalculoDNI {
	
	public static char comprovarLletra(String dni) {
		
			char lletra = ' ';
			int dniInt = 0;
			int modul = 0;		
			String subcadenaLletra = ""; 
			String subcadenaNumeros = "";
			String lletres = "TRWAGMYFPDXBNJZSQVHLCKE";
			boolean correcte = false;
			
			subcadenaLletra = dni.substring(8,9);// agafa la última la part de la cadena la lletra
			subcadenaNumeros = dni.substring(0,8); // agafa els números
									
			subcadenaLletra = subcadenaLletra.toUpperCase();// la transformo en majúscula perquè faci bé la comparació
				
			dniInt = Integer.parseInt(subcadenaNumeros);// convertir el String números en int 
				
			modul = dniInt % 23;//calcular el mòdul
			
			lletra = lletres.charAt(modul);
									
		return lletra;
	}
	
}
