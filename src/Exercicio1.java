import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
	int numerotabuadainicial, numerotabuadafinal, auxiliar;
	
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Digite um numero inicial: "); 
	numerotabuadainicial = leitor.nextInt();
	
	System.out.println("Digite um numero final: "); 
	numerotabuadafinal = leitor.nextInt();
	
	if(numerotabuadafinal < numerotabuadainicial) {
		auxiliar = numerotabuadafinal;
		numerotabuadafinal = numerotabuadainicial;
		numerotabuadainicial = auxiliar;
	}
	
	for (int i = 0; i <= numerotabuadafinal; i++) {
		System.out.println(numerotabuadainicial * i);
			
			
	}
}
}
