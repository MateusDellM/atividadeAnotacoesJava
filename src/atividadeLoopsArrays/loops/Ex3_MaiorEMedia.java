package atividadeLoopsArrays.loops;
import java.util.Scanner;
/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero; // que guarda os numeros inseridos
        int maior = 0;
        int soma = 0;

        int contador = 0; // variavel contadora
        do {
            System.out.println("Número: ");//insirir o numeor
            numero = scan.nextInt();

            soma = soma + numero;// soma os numero e guarda o anterior conforme for fornecido

            if (numero > maior) maior = numero;// guada o numero maior que for fornecido

            contador += 1;// contador em loop até chegar no 5
        } while(contador < 5);//

        System.out.println("Maior: " + maior);// mostra o maior numero inserido
        System.out.println("Média: " + (soma/5));//mostra a media entre os 5 numeros fornecidos

    }
}
