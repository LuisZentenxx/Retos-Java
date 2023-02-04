/**
 * 
 */
package com.unab;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Luis Zenteno
 * @version 1.0
 * 
 *          Escribe un programa que sea capaz de generar contraseñas de forma
 *          aleatoria. Podrás configurar generar contraseñas con los siguientes
 *          parámetros: - Longitud: Entre 8 y 16. - Con o sin letras mayúsculas.
 *          - Con o sin números. - Con o sin símbolos. (Pudiendo combinar todos
 *          estos parámetros entre ellos)
 */
public class PasswordGenerator {

	public static void inputPassword() {

		int maxLargo = 16;
		int minLargo = 8;

		Random random = new Random();
		int largo = minLargo + random.nextInt(maxLargo - minLargo + 1);
		/*
		 * La clase StringBuilder en Java es una clase que proporciona una forma
		 * eficiente de construir y manipular cadenas de caracteres. Esta clase es
		 * mutable, lo que significa que sus valores pueden ser modificados después de
		 * su creación.
		 */
		StringBuilder password = new StringBuilder();

		String caracteres = "abcdefghijklmnopqrstuvwxyzñ*/&%$#?¡¿+-_<>!ABCDEFGHIJKLMNOPQRSTUVWXYZÑ";

		/**
		 * En cada iteración, se realiza lo siguiente:
		 * random.nextInt(caracteres.length()) genera un número aleatorio entre 0 y el
		 * número de caracteres en la cadena caracteres. caracteres.charAt(...)
		 * selecciona el carácter en la posición especificada en la cadena caracteres.
		 * password.append(...) agrega el carácter seleccionado a la cadena password
		 * construida por StringBuilder.
		 */
		for (int x = 1; x <= largo; x++) {

			password.append(caracteres.charAt(random.nextInt(caracteres.length())));

		}

		System.out.println("\nNueva contraseña --> " + password);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nGENERADOR DE CONTRASEÑAS ALEATORIAS ");
		System.out.println("----------------------------------------");

		System.out.print("\n¿Cuantas contraseñas quieres generar? --> ");
		int cantidad = sc.nextInt();

		for (int y = 1; y <= cantidad; y++) {
			inputPassword();
			
		}
		System.out.println("\n.::. by Luis Zenteno");
	}

}
