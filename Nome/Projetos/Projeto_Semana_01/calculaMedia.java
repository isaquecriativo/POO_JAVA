package RAP_U2S1;
import java.util.Scanner;
public class calculaMedia {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4, media;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Digite a primera nota: ");
			nota1 = entrada.nextFloat();
			System.out.print("Digite a segunda nota: ");
			nota2 = entrada.nextFloat();
			System.out.print("Digite a terceira nota: ");
			nota3 = entrada.nextFloat();
			System.out.print("Digite a quarta nota: ");
			nota4 = entrada.nextFloat();
		}
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		
		if (media >= 6) {
			System.out.print("Parabéns você foi aprovado! a sua média foi :" + media);
		}
		else {
			System.out.print("Você Reprovou! a sua média foi :" + media);
		}
		
	}

}
