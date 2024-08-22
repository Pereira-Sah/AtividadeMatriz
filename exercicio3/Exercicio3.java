package br.edu.fatecpg.exercicio3;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][]  m = new int[2][3];
		for(int i = 0; i <2; i++){
			for(int b =0; b <3; b++){
				System.out.println("Digite um numero: ");
				 m[i][b] = scan.nextInt();
		}}
		for(int c = 0; c<3; c++){
				for(int d = 0; d<2; d++){
					System.out.print(m[d][c]+" ");
			}
			System.out.println();
			}

	}

}
