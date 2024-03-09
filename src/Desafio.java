import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Desafio {
    public Object[] estacionamento;
    public int posicaoCarro;

    public void blocos() {
        this.posicaoCarro = -1;
        this.estacionamento = new Object[4];
    }

    public static void main(String[] args) {
        Desafio A = new Desafio();
        Desafio B = new Desafio();
        Desafio C = new Desafio();
        Desafio D = new Desafio();
        Desafio E = new Desafio();
        A.blocos();
        B.blocos();
        C.blocos();
        D.blocos();
        E.blocos();

        System.out.println("Digite digite o modelo do seu carro: ");
        Scanner input = new Scanner(System.in);
        String modelo = input.next();

        System.out.println("Digite digite os três primeiros digitos da sua placa ");
        int placa = input.nextInt();


    }
}
