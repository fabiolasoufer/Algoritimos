package IntroducaoJava;

import java.util.Scanner;

public class Ex1_Algoritimos {

	public static void main(String[] args) {
		
		int a, m, d, n1, n2, total;
		Scanner calc = new Scanner (System.in);

		System.out.println("Digite sua idade em anos: ");
		a = calc.nextInt();
		System.out.println("Acrescente os meses: ");
		m = calc.nextInt();
		System.out.println("Acrescente os dias: ");
		d = calc.nextInt();
		
		n1=a*365;
		n2=m*30;		
		total=n1+n2+d;
		
		System.out.println("Sua idade em dias é: "+total);
	}

}
