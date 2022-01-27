package IntroducaoJava;

import java.util.Scanner;

public class Ex7_Algoritimos {

	public static void main(String[] args) {
		
		double a,b,c,d,i,f,x,y;
		Scanner calc = new Scanner (System.in);
		
		System.out.println("Entre com os valores de A, B, C, D, E e F: ");
		a = calc.nextDouble();
		b = calc.nextDouble();
		c = calc.nextDouble();
		d = calc.nextDouble();
		i = calc.nextDouble();
		f = calc.nextDouble();
		
		x = (c*i-b*f)/(a*i-b*d);
		y = (a*f-c*d)/(a*i-b*d);
		
		System.out.println("Os valores de X e Y são respectivamente: "+x+" e "+y);

	}

}
