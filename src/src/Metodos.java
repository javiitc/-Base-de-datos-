public class Metodos {
    /**
     * función que comprueba el usuario y contraseña para verificar que el login sea correcto, en caso que no, te pedira volver a intentarlo
     * @param usuarios el array donde están los usuarios
     * @param passwords array dónde se guardan las contraseñas
     * @param usuario el 'input' del usuario
     * @param password el 'input' para la contraseña
     * @return devuelve true o false para parar, o continuar, el bucle inicioSesion del Main
     */
    public static boolean comprobacion (String usuarios[], String passwords [], String usuario, String password) {
        boolean loginCorrecto = false;

        for (int i = 0; i < usuarios.length; i++) {
            if (usuario.equals(usuarios[i]) && password.equals(passwords[i])){
                loginCorrecto = true;
                break;
            }
        }

        if (loginCorrecto) {
            System.out.println("Has iniciado sesión correctamente");
            return false;
        } else {
            System.out.println("Usuario o contraseña incorrecto, inténtelo de nuevo");
            return true;
        }
    }
}
