import java.util.Scanner;

public class DesafioMatematica {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num;
		boolean primo = true;
		System.out.println("Informe um numero");
		num = entrada.nextInt();

		
		String texto ="";
		if (num % 2 == 0) { // informar se o número é par ou impar
			texto +="É par, não é impar, ";
		} else {
			texto +="É impar, não é par, ";
		}

		if (num > 10) { // informar se o número é maior do que 10
			texto +="é maior que 10, ";
		} else if(num == 10) {
			texto +="é igual a 10, ";
		}else {
			texto +="não é maior que 10, ";
		}

		for (int i = 2; i <= num / 2; i++) {
			if ((num % i) == 0) {
				primo = false;
				break;

			}

		}
		int result = num * 2; // dobro do número
		texto +="o dobro de "+num+ " é "+result+",";
		if (primo) {
			texto += " é primo.";
		} else {
			texto += " não é primo.";
		}
		System.out.println(texto);
		entrada.close();
	}
	
}
