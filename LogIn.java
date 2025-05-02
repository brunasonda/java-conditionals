import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, si son iguales a los datos dados imprimirá en terminal: Acceso concedido, si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita tu nombre de usuario. ");
        String user = scanner.nextLine();
        System.out.print(user + ", digita tu contraseña ");
        String password = scanner.nextLine();
        String myUser = "admin";
        String myPassword = "1234";
if (user.equals(myUser) && password.equals(myPassword)) {
    System.out.print("Acceso concedido");
}
else {
    System.out.println("Nombre de usuario o contraseña incorrecta.");
}
    }
}
