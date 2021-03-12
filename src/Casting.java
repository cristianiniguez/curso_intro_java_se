public class Casting {
    public static void main(String[] args) {
        // En un año ubique 30 perritos
        // ¿Cuantos perritos ubique al mes?
        double monthlyDogs = 30.0 / 12.0;
        System.out.println(monthlyDogs); // 2.5

        // Estimacion
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs); // 2

        // El casteo a int quita los decimales, no redondea
        System.out.println(Math.sqrt(3)); // 1.72
        System.out.println((int) Math.sqrt(3)); // 1

        // Exactitud
        int a = 30;
        int b = 12;

        System.out.println(a / b); // 2 (no 2.5, porque son datos int)
        System.out.println((double) a / b); // 2.5 (ahora si)

        // Casting implicito vs explicito
        double c = a / b;
        System.out.println(c); // 2.0 (no 2.5, por lo mismo de antes, el .0 es porque c se convierte a double solito)
        double c2 = (double) a / b;
        System.out.println(c2); // 2.5 (ahora si)

        // Otros tipos de casting
        char n = '1';
        int nI = n;
        System.out.println(nI); // 49 ('1' en la tabla ASCII)

        // short nS = n; // no se puede
        short nS = (short) n; // si se puede
        System.out.println(nS); // 49
    }
}
