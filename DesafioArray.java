package arrys;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a quantidade de notas: ");
		int quantNotas = scan.nextInt();
		double[] notas = new double[quantNotas];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota: " + (i + 1) + ": ");
			notas[i] = scan.nextDouble();

		}
		double total = 0;
		for (double nota : notas) {
			total += nota;

		}
		double media = total / notas.length;
		System.out.println("A média das notas é: " + media);
		scan.close();
	}

}
