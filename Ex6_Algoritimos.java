package IntroducaoJava;

import java.util.Scanner;

public class Ex6_Algoritimos {

	public static void main(String[] args) {
		
		double x1,x2,y1,y2,d;
		Scanner calc = new Scanner (System.in);
		
		System.out.println("Entre com as coordenadas de partida: ");
		x1 = calc.nextDouble();
		y1 = calc.nextDouble();
		
		System.out.println("Entre com as coordenadas de chegada: ");
		x2 = calc.nextDouble();
		y2 = calc.nextDouble();
		
		d = Math.sqrt(Math.pow(x2-x1,2.0)+Math.pow(y1-y2,2.0)+2.0);
		System.out.println("A distância entre os dois pontos é: "+d);

	}

}
