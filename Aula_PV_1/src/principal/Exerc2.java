package principal;
import java.util.Scanner;

//Verificar Voto

public class Exerc2 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		if (idade >= 16) {
			if(idade >= 18 && idade <= 70) {
				System.out.println("Voto obrigatório.");
	}	else {
				System.out.println("Voto facultativo");					
	}
}		else {
			System.out.println("Não tem idade para votar.");
		}
		
		scanner.close();
	}	

}
