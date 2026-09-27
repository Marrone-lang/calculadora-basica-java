package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// PROGRAMA BÁSICO DE CALCULADORA
		// CRIADO POR: marrone_nunes_

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x, y;
		String sinal;

		IO.println("Insira os valores e a operação matématica! ");

		x = sc.nextDouble();
		sinal = sc.next();
		y = sc.nextDouble();

		if (sinal.equals("-")) {

			IO.println(x - y);

		} else if (sinal.equals("+")) {

			IO.println(x + y);
		} else if (sinal.equals("*")) {

				IO.println(x * y);

		} else if (sinal.equals("/") && y != 0) {

				IO.println(x / y);
			} else {

				IO.println("Não é possivel dividir um numero por zero!");
			}

			sc.close();
		}
	}

