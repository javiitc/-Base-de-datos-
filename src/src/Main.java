import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su usuario y contraseña");

        String [] usuarios = {"username1", "rrh1", "admin1", "locker3"};
        String [] passwords = {"user1234", "nvme2.0", "ddrtx4080", "qr650"};

        String usuario;
        String password;
        boolean inicioSesion = true;

        while (inicioSesion) {
            usuario = sc.next();
            password = sc.next();
            inicioSesion = Metodos.comprobacion(usuarios, passwords, usuario, password);
        }

    }
}
