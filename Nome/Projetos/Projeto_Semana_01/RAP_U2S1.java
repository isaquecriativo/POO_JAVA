package RAP_U2S1;

import java.util.Scanner;

public class RAP_U2S1 {
	public static void main(String[] args) {
		float numero1, numero2;
		char operacao;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro número: ");
		numero1 = entrada.nextFloat();		
		System.out.print("Entre com o segundo número: ");
		numero2 = entrada.nextFloat();
		System.out.print("Escolha sua operação [+ - * / ]: ");
		operacao = entrada.nextLine().charAt(0);
		
		switch(operacao){		
		case '+':
		System.out.printf("%.2f + %.2f = %.2f", numero1, numero2,
		numero1 + numero2);
		break;
		case '-':
		System.out.printf("%.2f - %.2f = %.2f", numero1, numero2,
		numero1 - numero2);
		break;
		case '*':
		System.out.printf("%.2f * %.2f = %.2f", numero1, numero2,
		numero1 * numero2);
		break;
		case '/':
		System.out.printf("%.2f / %.2f = %.2f", numero1, numero2,
		numero1 / numero2);
		break;
		default:
		System.out.printf("Você digitou uma operação inválida.");
		}
		entrada.close();

	}

}
