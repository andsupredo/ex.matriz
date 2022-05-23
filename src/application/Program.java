package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o número de linhas: ");
        int m = sc.nextInt();
        System.out.print("Digite o número de colunas: ");
        int n = sc.nextInt();

        int [][] mat = new int[m][n];

        for (int i=0; i<mat.length; i++){
            System.out.print("Digite a linha " + i + ": ");
            for (int j=0; j<mat.length; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Digite um número inteiro: ");
        int x = sc.nextInt();

        for (int i=0; i<mat.length; i++){
            for (int j=0; j<mat.length; j++){
                if (mat[i][j] == x){
                    x++;
                    System.out.println("Posição " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Esquerda: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Acima: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Direita: " + mat[i][j+1]);
                    }
                    if (i < mat[j].length-1) {
                        System.out.println("Abaixo: " + mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
