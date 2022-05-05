package atividadeLoopsArrays.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-7, -3, 14, 37, 7, 4};

        System.out.print("Vetor: ");
        int count =0;
        //loop do vetor até o ultimo elemento da array.
        while(count < (vetor.length)) { // length é o tamanho do vetor
            System.out.print(vetor[count] + " "); //imprima o valor do elemento do vetor na posição indicada pelo contador.
            count++;
        }
        System.out.print("\nVetor: "); //separar os vetores
        for(int i = (vetor.length - 1); i >= 0; i --) { //para cada elemento dentro do vetor
            System.out.print(vetor[i] + " ");
        }
    }
}
