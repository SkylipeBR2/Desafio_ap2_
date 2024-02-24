import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        for (int l = 0; l < 3; l++){
            for (int c = 0; c < 4; c++){
                System.out.printf("Digite o valor da matriz [%d][%d]: ", l+1, c+1);
                matriz[l][c]=input.nextInt();
            }
        }

        for (int l = 0; l < 3; l++){
            System.out.println("\n");
            for (int c = 0; c < 4; c++){
                if (matriz[l][c] %2 == 1){
                    System.out.printf("\t %d \t", matriz[l][c]);
                }
            }
        }
    }
}
