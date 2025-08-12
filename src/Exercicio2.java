import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int numeroDigitado;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um numero par: ");
		
		numeroDigitado = leitor.nextInt();
		
		do {
			System.out.println("Digite um numero par: ");
			numeroDigitado = leitor.nextInt();
			
			if (numeroDigitado % 2 != 0) {
			System.out.println("Numero Errado! Digite um numero correto par: ");
			numeroDigitado = leitor.nextInt();
			}
		} while(numeroDigitado % 2 != 0);
		
		System.out.println("O numero digitado é par! ");
	}
}
