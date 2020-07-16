import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) { /// define o "entry point"

		System.out.println("Olá mundo !");
		System.out.println("Bom Dia");

		int y = 32;
		System.out.println(y);

		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x); // printf = formatado
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);

		// concatenar
		System.out.println("Resultado = " + x + " metros");
		// usando printf
		System.out.printf("Resultado = %.2f metros%n", x);
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d e ganha R$ %.2f reais%n", nome, idade, renda);

		// Scanner Entrada de dados
		Scanner sc = new Scanner(System.in);

		String x0;
		x0 = sc.next();
		System.out.println(" Voce digitou: " + x0);

		int y0;
		y0 = sc.nextInt();
		System.out.println(" Voce digitou: " + y0);

		double z;
		z = sc.nextDouble(); // pega a pontuação do sistema
		System.out.println("Voce digitou: " + z); // localidade independente

		char a;
		a = sc.next().charAt(0);
		System.out.println("Voce digitou o char: " + a);

		String x1;
		int y1;
		double z1;

		x1 = sc.next();
		y1 = sc.nextInt();
		z1 = sc.nextDouble();

		System.out.printf("Voce digitou os seguintes valores: %s, %d, %.2f", x1, y1, z1);

		// ler texto até a quebra de linha
		String s1, s2, s3;

		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados digitados");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

		// ESTRUTURA DE REPETICAO WHILE
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int x = sc.nextInt(); int soma = 0; while (x != 0) { soma += x; x =
		 * sc.nextInt(); }
		 * 
		 * sc.close();
		 * 
		 * System.out.println(soma);
		 */

		/*
		 * //ESTRUTURA FOR
		 * 
		 * Scanner sc = new Scanner(System.in); int soma = 0; int n = sc.nextInt();
		 * 
		 * for(int i=0; i<n; i++) { int x = sc.nextInt(); soma += x; } sc.close();
		 * 
		 * System.out.println(soma);
		 */
		/*
		 * // Operador Bit a bit Scanner sc = new Scanner(System.in); int n =
		 * sc.nextInt(); int mask = 32; // 00100000 em binario if ((n & mask) != 0) {
		 * System.out.println("6th bit is true!"); } else {
		 * System.out.println("6th bit is false!"); } sc.close();
		 */
	}

}
