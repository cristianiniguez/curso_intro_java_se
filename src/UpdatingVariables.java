public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        // bono $200 (+)
        salary = salary + 200;
        System.out.println(salary); // 1200

        // pension $50 (-)
        salary = salary - 50;
        System.out.println(salary); // 1150

        // 2 horas extra $30 c/u (+)
        // comida $45 (-)
        salary = salary + (30 * 2) - 45;
        System.out.println(salary); // 1165

        // Actualizando cadenas de texto
        String employeeName = "Felix Iñiguez";
        employeeName = employeeName + " Porcel";
        System.out.println(employeeName); // Felix Iñiguez Porcel

        employeeName = "Cristian " + employeeName;
        System.out.println(employeeName); // Cristian Felix Iñiguez Porcel
        System.out.println("Tu nombre es: " + employeeName); // Tu nombre es: Cristian Felix Iñiguez Porcel
    }
}
