package atividadeCalculadoraEmprestimoMensagem;

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(30,12 );
        Calculadora.subtracao(10,9);
        Calculadora.multiplicacao(32, 4);
        Calculadora.divisao(8, 4);

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(7);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(20);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1500, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(2300, Emprestimo.getTresParcelas());
        Emprestimo.calcular(4500, 4);

    }
}