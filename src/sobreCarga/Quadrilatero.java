package sobreCarga;

/*public class Quadrilatero {
    public static void area(double lado){
        System.out.println("Area do quadrado: "+ lado * lado);
    }
    public static void area(double lado1, double lado2){
        System.out.println("Area do retangulo: "+ lado1 * lado2);
    }
    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Area do trapézio: "+ ((baseMaior+baseMenor)*altura )/2);
    }
    public static void area(float diagonal1, float diagonal2) {

        System.out.println("Área do losango:" + (diagonal1 * diagonal2)/2);
    }
   */

//exercicio de retornos
public class Quadrilatero {
    public static double area(double lado) {
        return lado * lado;
    }

    public static double area(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior+baseMenor)*altura) / 2;
    }

    public static void xpto() {
        System.out.println("Antes");
        return;
    }

    public static double abc() { //definir o retor compativél ao que está definido EX: o double
        return 1.8;
    }
}

