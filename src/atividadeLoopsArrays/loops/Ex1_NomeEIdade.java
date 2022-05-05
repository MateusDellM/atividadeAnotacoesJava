package atividadeLoopsArrays.loops;
import java.util.Scanner;
/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome; //Guarda o nome
        int idade; //guarda a idade

        while(true) { //Enquando o loop for verdadeiro
            System.out.println("Nome: "); //inserir o nome
            nome = scan.next();//armazene esse nome na variável
            if (nome.equals("0")) break;//caso o nome igual a "0", intenrrompa o programa

            System.out.println("Idade: ");//inserir a idade
            idade = scan.nextInt(); //
        }
        // caso interrompa o prgrama, retorna aqui
        System.out.println("Continua aqui...");

    }
}
