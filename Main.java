import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int l = 0; l < 3; l++){
            for (int c = 0; c < 3; c++){
                System.out.printf("Digite o valor da matriz [%d][%d]: ", l+1, c+1);
                matriz[l][c]=input.nextInt();
            }
        }

        for (int l = 0; l < 3; l++){
            System.out.println("\n");
            for (int c = 0; c < 3; c++){
                System.out.printf("\t %d \t", matriz[l][c]);
            }
        }

        int soma = 0;
        for (int i = 0; i < matriz.length; i++){
            soma += matriz[i][i];
        }

        System.out.println("\n A soma é: " + soma);

    }
}