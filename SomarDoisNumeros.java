import java.util.*;
class SomarDoisNumeros {
	public static Scanner scan = new Scanner(System.in);
	public static void main (String args[]) {
		//declaração de variaveis
		int num1,num2,soma;
		//leitura
		System.out.println("Digite um número: ");
		num1 = scan.nextInt();
		System.out.println("Digite outro número: ");
		num2 = scan.nextInt();
		
		//soma
		soma = num1 + num2;
		
		//Printf
		System.out.println("Soma: " + soma);

	}
}
