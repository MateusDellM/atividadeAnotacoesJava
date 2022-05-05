package atividadeLoopsArrays.loops;
import java.util.Scanner;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros; // a quantidade de numeros que determinar vai receber
        int numero;             // numeros inseridos
        int quantPares = 0, quantImpares = 0;                    //variáveis para guardar a quantidade dos números pares e ímpares

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0; //"contador" do loop
        //loop
        do {                                                                        //primeiro, independente do que tem no while, faça:
            System.out.println("Número: ");
            numero = scan.nextInt();
            //se o resto da divisão do número por 2 (numero/2) for 0
            if (numero % 2 == 0 ) quantPares++;         //acrescente o valor 1 a variável quantPar.
            else quantImpares++;                                 // Faça o loop caso o valor do contador seja menor que a quantidade de números

            count++;                                                       // Faça o loop caso o valor do contador seja menor que a quantidade de números
        } while(count < quantNumeros);
        // Faça o loop caso o valor do contador seja menor que a quantidade de números
        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Ímpar: " + quantImpares);
    }
}
