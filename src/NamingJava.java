public class NamingJava {
    public static void main(String[] args) {

        // uppercase and lowercase difference
        int cellphone = 79797979;
        int cellPhone = 78787878;
        System.out.println(cellphone); // 79890908
        System.out.println(cellPhone); // 78787878

        // start of a variable name
        String $countryName = "Bolivia"; // GOOD
        String _backgroundColor = "green"; // GODD
        // String background-color = "green"; (BAD)
        String currency = "BO"; // GODD
        String background_color = "BLUE"; // GODD

        // constants
        int POSITION = -5;
        int MAX_WIDTH = 9999;
        int MIN_WIDTH = 1;
    }
}
