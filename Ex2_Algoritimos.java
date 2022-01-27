package IntroducaoJava;

import java.util.Scanner;

public class Ex2_Algoritimos {

	public static void main(String[] args) {
		
		int a,m,d;
		Scanner calc = new Scanner (System.in);
		
		System.out.println("Digite sua idade em dias: ");
		d = calc.nextInt();
		
		a = d/365;
		m = (d%365)/30;
		d = (d%365)%30;
		
		System.out.println("Sua idade é: "+a+" anos,"+m+" meses e "+d+" dias.");
		
	}

}
