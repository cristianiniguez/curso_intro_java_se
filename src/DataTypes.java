public class DataTypes {
    public static void main(String[] args) {
        // datos numericos

        // enteros
        int n = 1234567890; // 4 bytes [-2^31, 2^31 - 1]
        // int n = 12345678901; (ERROR)
        long nL = 12345678901L; // 8 bytes [-2^63, 2^63 - 1]

        // decimales (de punto flotante)
        double nD = 123.4567890;
        double nF = 123.4567890f;
    }
}
