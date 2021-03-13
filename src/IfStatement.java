public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            // send file
            fileSended++;
            System.out.println("Archivo enviado");
        }
    }
}
