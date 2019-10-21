package aplicação;

import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch {
// tratamento de erro com try catch
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		try {
		int n = ler.nextInt();
		System.out.println(100/n);
		}catch(InputMismatchException erro){
			System.out.println("Só pode informar números inteiros: " + erro);
		}catch(ArithmeticException erro) {
			System.out.println("nenhum número pode ser dividido por zero" + erro);
		}finally {
			System.out.println("Fim do bloco de comando");
		}

		ler.close();
	}

}
