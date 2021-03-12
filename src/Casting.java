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
    }
}
