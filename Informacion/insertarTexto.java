import java.util.Scanner;                                       //  Esta libreria nos ayuda a escribir texto desde el teclado, se debe llamar

public class insertarTexto{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String nombre = "";
        int numeroUno = 0, numeroDos = 0;
        int result;

        System.out.println("¿ Cual es tu nombre ?");
        nombre = in.nextLine();                                //  Permite ingresar ingresar texto.

        System.out.println("¿ Ingrese el primer numero? ");
        numeroUno = in.nextInt();                             //   Permite ingresar numeros.
        
        System.out.println("¿ Ingrese el segundo numero? ");
        numeroDos = in.nextInt();                               

        result = numeroUno + numeroDos;
        System.out.println("La sume de" +" " + nombre + " " + "es: "+ result);

    }
}