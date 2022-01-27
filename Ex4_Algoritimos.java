package IntroducaoJava;

import java.util.Scanner;

public class Ex4_Algoritimos {

	public static void main(String[] args) {
		
		double r,s,d,a,b,c;
		Scanner calc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		a = calc.nextDouble();
		System.out.println("Digite o segundo número: ");
		b = calc.nextDouble();
		System.out.println("Digite o terceiro número: ");
		c = calc.nextDouble();
		
		r=Math.pow(a+b, 2.0);
		s=Math.pow(b+c, 2.0);
		d=(r+s)/2;
		
		System.out.println("O resultado da expressão D é: "+d);
		
		

	}

}
