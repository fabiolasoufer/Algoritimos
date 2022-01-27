package IntroducaoJava;

import java.util.Scanner;

public class Ex3_Algoritimos {

	public static void main(String[] args) {
		
		int h,m,s;
		Scanner calc = new Scanner (System.in);
		
		System.out.println("Digite a duração do evento em segundos: ");
		s = calc.nextInt();
		
		h=s/3600;
		m=(s%3600)/60;
		s=(s%3600)%60;
		
		System.out.println("O evento tem duração de: "+h+" horas,"+m+" minutos e "+s+" segundos.");

	}

}
