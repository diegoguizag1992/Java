
public class operaciones{
    public static void main(String args[]){
        float notaUno = 5;
        float notaDos = 3;
        float notaTres = 4;
        float promedio = notaUno + notaDos + notaTres;
        promedio /=   3;
        if (promedio >= 5){
            System.out.println("El estudiante aprobo, su promedio es: " + promedio);      // Imprime en consola
        } else {
            System.out.println("El estudiante reprobo la nota es:" + promedio);
        }
    }
}