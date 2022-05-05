package atividadeLoopsArrays.loops;
import java.util.Scanner;
/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;// guarda nota

        System.out.println("Nota: "); //inserir nota
        nota = scan.nextInt();

        while(nota < 0 | nota > 10) {// roda se a nota estiver no intervalo entre >0 e <10
            System.out.println("Nota Inválida! Digite novamente: "); // se a nota for abaixo de 0 ou for maior que 10, digitar novamente
            nota = scan.nextInt();// verifica nota e retorna
        }
    }
}
