import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[][] matriz = new float[5][4];

        for (int l = 0; l < 5; l++){
            for (int c = 0; c < 4; c++){
                System.out.printf("Digite o valor da matriz [%d][%d]: ", l+1, c+1);
                matriz[l][c]=input.nextFloat();
            }
        }
        for (int l = 0; l < 5; l++){
            System.out.println("\n");
            for (int c = 0; c < 4; c++){
                if (matriz[l][c] >= 7){
                    System.out.printf("\tAlunos Aprovados: %d");
                } else {
                    System.out.printf("\tAlunos Reprovados %d \t", matriz[l][c]);
                }
            }
        }
    }
}
