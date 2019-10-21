package aplica��o;

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
			System.out.println("S� pode informar n�meros inteiros: " + erro);
		}catch(ArithmeticException erro) {
			System.out.println("nenhum n�mero pode ser dividido por zero" + erro);
		}finally {
			System.out.println("Fim do bloco de comando");
		}

		ler.close();
	}

}
