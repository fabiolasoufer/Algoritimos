package IntroducaoJava;

import java.util.Scanner;

public class Ex5_Algoritimos {

	public static void main(String[] args) {
		
		double n1,n2,n3,m;
		Scanner calc = new Scanner (System.in);
		
		System.out.println("Entre com a primeira nota: ");
		n1 = calc.nextDouble();
		System.out.println("Entre com a segunda nota: ");
		n2 = calc.nextDouble();
		System.out.println("Entre com a terceira nota: ");
		n3 = calc.nextDouble();
		
		n1 = n1*2;
		n2 = n2*3;
		n3 = n3*5;
		
		m=(n1+n2+n3)/10;
		
		System.out.println("A média ponderada é: "+m);
	}

}
