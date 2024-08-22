package br.edu.fatecpg.exercicio1;

import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);

       int[][] matrizA = new int[3][3];
       int[][] matrizB = new int[3][3];
       int[][] matrizC = new int[3][3];
      
    System.out.println("Digite a primeira matriz!");
       for(int i = 0; i < 3; i++){
            for(int j = 0; j<3; j++){
              System.out.println("Digite um numero: ");
              matrizA[i][j] = scan.nextInt();
            }
       }
System.out.println("Digite a segunda matriz!");
       for(int i = 0; i < 3; i++){
            for(int j = 0; j<3; j++){
              System.out.println("Digite um numero: ");
              matrizB[i][j] = scan.nextInt();
            }
       }
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j<3; j++){
              matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
              System.out.print( matrizC[i][j] + " ");
            }
            System.out.println("\n");
       }
      scan.close();
    }

}