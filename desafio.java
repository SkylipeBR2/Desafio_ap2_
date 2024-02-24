import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] candidato = {"1 - Guilherme Boulos (PSQL)", "2- Kim Kataguiri (UB)", "3 - Marco Vinholi (PSDB)", "4 - Maria Helena (NOVO)", "5 - Ricardo Nunes (MDB)", "6- Ricardo Salles (PL)", "7 - Tabata Amaral (PSB)"} ;
        int[][] resultados = new int[candidato.length][2];

        for (int i = 0; i < candidato.length; i++){
            System.out.println(candidato[i]);
        }

        for (int l = 0; l < candidato.length; l++){
            for (int c = 1; c < 2;){
                resultados[l][1] = l;
                System.out.println(resultados[l][1]);
                c++;
            }
        }

        for (int i = 0; i <= candidato.length; i++) {
            System.out.println("\nDigite o número que deseja votar: ");
            int votar = input.nextInt();

            for (int l = 0; l < candidato.length; l++) {
                for (int c = 0; c < 2; c++) {
                    if (votar == resultados[l][1]) {
                        resultados[l][2] = resultados[l][2] + 1;
                        System.out.println(resultados[l][2]);
                    }
                }
            }
        }

        for (int l = 0; l < candidato.length; l++){
            System.out.println("\n");
            for (int c = 0; c < 2; c++){
                System.out.printf("\t %d \t", resultados[l][0]);
            }
        }


    }
}
