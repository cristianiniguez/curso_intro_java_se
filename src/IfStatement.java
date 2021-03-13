public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            // send file
            fileSended++;
            System.out.println("Archivo enviado");
            int i = 0;
            i++;
        } else {
            fileSended--;
            System.out.println("Por favor enciende el bluetooth para inciar la transferencia");
        }

        System.out.println(isBluetoothEnabled); // false
        System.out.println(fileSended); // 2

        // System.out.println(i); // ERROR!
    }
}
