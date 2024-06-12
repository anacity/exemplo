package Basico;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Peso = 0;
		double Altura = 0;
		
		System.out.println("Qual o seu peso?");
		Peso = sc.nextInt();
		
		System.out.println("Qual a sua altura?");
		Altura = sc.nextDouble();
		
		double IMC;
		IMC = (Peso / (Altura*Altura));
		
		System.out.println(IMC);
		
		if(IMC < 18.5) {
			System.out.println("Abaixo do peso");
		}else if(IMC >= 18.5 && IMC <= 24.9) {
			System.out.println("Peso ideal");
		}else if(IMC >= 25 && IMC <= 29.9) {
			System.out.println("Levemente acima do peso");
		}else if(IMC >= 30 && IMC <= 34.9){
			System.out.println("Obesidade grau I");
		}else if(IMC >= 35 && IMC <= 39.9) {
			System.out.println("Obesidade grau II (severa)");
		}else if(IMC >= 40) {
			System.out.println("Obesidade grau III (mórbida)");
		}
		
		sc.close();
	}

}
