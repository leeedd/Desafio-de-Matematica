import java.util.Scanner;

public class DesafioMatematica {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num;
		boolean primo = true;
		System.out.println("Informe um numero");
		num = entrada.nextInt();

		
		String texto ="";
		if (num % 2 == 0) { // informar se o n�mero � par ou impar
			texto +="� par, n�o � impar, ";
		} else {
			texto +="� impar, n�o � par, ";
		}

		if (num > 10) { // informar se o n�mero � maior do que 10
			texto +="� maior que 10, ";
		} else if(num == 10) {
			texto +="� igual a 10, ";
		}else {
			texto +="n�o � maior que 10, ";
		}

		for (int i = 2; i <= num / 2; i++) {
			if ((num % i) == 0) {
				primo = false;
				break;

			}

		}
		int result = num * 2; // dobro do n�mero
		texto +="o dobro de "+num+ " � "+result+",";
		if (primo) {
			texto += " � primo.";
		} else {
			texto += " n�o � primo.";
		}
		System.out.println(texto);
		entrada.close();
	}
	
}
