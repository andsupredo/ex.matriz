package application;

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

        int [][] mat = new int[m][n]; /*Instanciação da matriz com o nome "mat"*/

        for (int i=0; i<mat.length; i++){ /*utilizando o mat.length para o laço utilizar o numero de linhas em i e colunas em j*/
            System.out.print("Digite a linha " + i + ": ");
            for (int j=0; j<mat.length; j++){
                mat[i][j] = sc.nextInt(); /*Utilizar o mat[][] = sc... para adicionar os numeros digitados à matriz*/
            }
        }
        System.out.print("Digite um número inteiro: ");
        int x = sc.nextInt(); /*Variável será utilizada para verificar igualiadde na matriz, cada vez que for encontrado o valor = x será impresso em tela os valores abaixo, a direita, acima e a esquerda.*/

        for (int i=0; i<mat.length; i++){
            for (int j=0; j<mat.length; j++){ /*Laços for para passar por toda a extensão da matriz*/
                if (mat[i][j] == x){ /*igualidade da matriz*/
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
                    } /*Maneira de definir os números nas proximidades do valor = x*/
                }
            }
        }

        sc.close();
    }
}
