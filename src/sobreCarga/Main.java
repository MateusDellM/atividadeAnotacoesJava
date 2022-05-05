package sobreCarga;

public class Main {
    public static void main(String[] args){
  /*      System.out.println("Exercicio quadrilatero");
        Quadrilatero.area(4);
        Quadrilatero.area(8d,3d);
        Quadrilatero.area(1,2,3);
        Quadrilatero.area(5f,5f);
*/
        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = Quadrilatero.area(4);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(8d,8d);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(1,2,3);
        System.out.println("Área do trapézio:" + areaTrapezio);

    }
}
