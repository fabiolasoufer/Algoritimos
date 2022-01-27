package IntroducaoJava;

import java.util.Scanner;

public class Ex8_Algoritimos {

	public static void main(String[] args) {
		
		double cf,dist,imp,cc;
		Scanner calc = new Scanner (System.in);
		
		System.out.println("Digite o valor de fábrica do veículo: ");
		cf = calc.nextDouble();
		
		dist=cf*0.28;
		imp=cf*0.45;
		cc=cf+dist+imp;
		
		System.out.println("O valor de venda do véiculo é: "+cc);

	}

}
