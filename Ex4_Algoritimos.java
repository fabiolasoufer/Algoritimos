package IntroducaoJava;

import java.util.Scanner;

public class Ex4_Algoritimos {

	public static void main(String[] args) {
		
		double r,s,d,a,b,c;
		Scanner calc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		a = calc.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		b = calc.nextDouble();
		System.out.println("Digite o terceiro n�mero: ");
		c = calc.nextDouble();
		
		r=Math.pow(a+b, 2.0);
		s=Math.pow(b+c, 2.0);
		d=(r+s)/2;
		
		System.out.println("O resultado da express�o D �: "+d);
		
		

	}

}
