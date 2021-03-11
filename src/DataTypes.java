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

        // usando var
        var salary = 1000; // int
        var pension = salary * 0.03; // double
        var totalSalary = salary - pension; // double

        System.out.println(salary); // 1000
        System.out.println(pension); // 30.0
        System.out.println(totalSalary); // double

        var employee = "Cristian Iñiguez"; // String
        System.out.println("EMPLOYEE: " + employee + " SALARY: " + totalSalary);
    }
}
