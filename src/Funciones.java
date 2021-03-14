public class Funciones {
    public static void main(String[] args) {
        double y = 3;

        // area de un circulo
        // pi * r^2
        System.out.println(circleArea(y)); // 28.27...

        // area de una esfera
        // 4 * pi * r^2
        System.out.println(sphereArea(y)); // 113.09...

        // volumen de una esfera
        // (4/3) * pi * r^3
        System.out.println(sphereVolume(y)); // 84.82...

        System.out.println("200 PESOS A DOLARES: " + convertToDolar(200, "MXN"));
        System.out.println("1000 PESOS A DOLARES: " + convertToDolar(200, "COP"));
    }

    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double sphereVolume(double r) {
        return (4/3) * Math.PI * Math.pow(r, 3);
    }

    /**
     * Descripción: Función que especificando su moneda, covierte una cantidad de dinero a dólares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de Moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en Dólares
     * */
    public static double convertToDolar(double quantity, String currency) {
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }

        return quantity;
    }
}
