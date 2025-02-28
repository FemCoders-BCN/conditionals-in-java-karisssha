import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, si son iguales a los datos dados imprimirá en terminal: Acceso concedido, si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.
        
        System.out.print("Ingresa nombre de usuario: ");
        String login = scanner.nextLine();

        System.out.print("Ingresa contraseña: ");
        String password = scanner.nextLine();

        if (login.equals("karisha") && password.equals("FreePalestine666")) {
            System.out.print("Acceso concedido");
        }else {
            System.out.print("Nombre de usuario o contraseña incorrecta :/ ");
        };
    scanner.close();
};
}