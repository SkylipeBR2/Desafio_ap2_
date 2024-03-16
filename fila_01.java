import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;


public class fila_01 {

    static Scanner input = new Scanner(System.in);
    static int tam_max=10, tam=0;
    public Object[] Cliente;
    public String nome;
    public String CPF;
    public String RG;
    public String numConta;


    public fila_01(String nomeClient, long clientCPF, long clientRG, float clientConta) {
        this.nome = nome;
        this.CPF = nome;
        this.RG = nome;
        this.numConta = nome;

}




    public static void main(String[] args) {
        System.out.println("Quantos clientes esperando fora? ");
        tam = input.nextInt();

        for (int i = 0; i < tam; i++)
        {
            System.out.println("Digite o nome do cliente: ");
            String nomeClient = input.next();
            System.out.println("Digite o número do CPF: ");
            long clientCPF = input.nextInt();
            System.out.println("Digite o número do RG: ");
            long clientRG = input.nextInt();
            System.out.println("Digite o número da Conta: ");
            float clientConta = input.nextInt();

            fila_01 cliente[i] = new fila_01(nomeClient, clientCPF, clientRG, clientConta);
        }




        }
    static void enfileirar(int vet[], int elem){
        if (tam == tam_max)
        {
            System.out.println("\n fila cheia");
        }
        else {
            vet[tam]=elem;
            tam++;
        }
    }

    }

