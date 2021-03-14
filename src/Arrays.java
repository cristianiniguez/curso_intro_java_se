public class Arrays {
    public static void main(String[] args) {
        // Declarando un array
        String[] androidVersions = new String[17];
        String days[] = new String[7];

        // Array bidimensional
        String[][] cities = new String[4][2]; // 4 * 2 = 8 espacios

        // Array multidimensional
        int[][][] numbers = new int[2][2][2];
        int[][][][] numbers4 = new int[2][2][2][2];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        System.out.println(androidVersions[0]); // Apple Pie
        System.out.println(androidVersions[1]); // Banana Bread
        System.out.println(androidVersions[2]); // Cupcake
        System.out.println(androidVersions[3]); // Donut

        System.out.println("---------------------------");

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México";
        cities[3][1] = "CDMX";

        System.out.println(cities[0][0]); // Colombia
        System.out.println(cities[0][1]); // Medellin
        System.out.println(cities[1][0]); // Colombia
        System.out.println(cities[1][1]); // Bogotá
        System.out.println(cities[2][0]); // México
        System.out.println(cities[2][1]); // Guadalajara
        System.out.println(cities[3][0]); // México
        System.out.println(cities[3][1]); // CDMX

        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";

        System.out.println("--------------------");
        System.out.println(animals[1][0][0][1]); // Monkey
    }
}
