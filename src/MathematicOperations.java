public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        // constantes de Math
        System.out.println(Math.PI); // 3.14...
        System.out.println(Math.E); // 2.72...

        // metodos de Math

        // retorna un entero hacia arriba
        System.out.println(Math.ceil(x)); // 3.0

        // retorna un entero hacia abajo
        System.out.println(Math.floor(x)); // 2.0

        // retorna un numero elevado a otro
        System.out.println(Math.pow(x, y)); // 9.261...

        // retorna el numero mayor
        System.out.println(Math.max(x, y)); // 3.0

        // retorna la raiz cuadrada
        System.out.println(Math.sqrt(3)); // 1.73...

        // area de un circulo
        // pi * r^2
        System.out.println(Math.PI * Math.pow(y, 2)); // 28.27...

        // area de una esfera
        // 4 * pi * r^2
        System.out.println(4 * Math.PI * Math.pow(y, 2)); // 113.09...

        // volumen de una esfera
        // (4/3) * pi * r^3
        System.out.println((4/3) * Math.PI * Math.pow(y, 3)); // 84.82...
    }
}
