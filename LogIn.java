import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, si son iguales a los datos dados imprimirá en terminal: Acceso concedido, si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.

        Scanner scanner = new Scanner(System.in);

    
        String myUser = "Catmaluci";
        String myPassword = "1234";

        System.out.print("Nombre de usuario: "); 
        String userIn = scanner.nextLine();
  
        System.out.print("Contraseña: "); 
        String passwordIn = scanner.nextLine();
    
        if (userIn.equals(myUser) && passwordIn.equals(myPassword)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrecta");
        }

        scanner.close();

    }
}
