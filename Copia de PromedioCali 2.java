import java.util.Scanner;

public class PromedioCali {

  /**
   * Este programa fue creado para realizar el promedio de sus cuatro examenes.
   *@author Juan Carlos Tubac Coj
   *@since 2024-08-02
   *
   *
   *
   *ESTE ES LA SEGUNDA MODIFICACION QUE ME PORMITIO POR ERRORES EN LA AUTENTICACION DE GITHUB
   */

    public static void main(String[] args) {

        // Crear un objeto Scanner para la entrada de datos

        Scanner scanner = new Scanner(System.in);
        
        // Declarar variables para las calificaciones

        double nota1, nota2, nota3, nota4;
	
        
        // Solicitar y leer las calificaciones del usuario

        System.out.print("Ingrese la calificación del primer examen: ");
        nota1 = scanner.nextDouble();
        
        System.out.print("Ingrese la calificación del segundo examen: ");
        nota2 = scanner.nextDouble();
        
        System.out.print("Ingrese la calificación del tercer examen: ");
        nota3 = scanner.nextDouble();
        
        System.out.print("Ingrese la calificación del cuarto examen: ");
        nota4 = scanner.nextDouble();
        
        // Calcular el promedio
        double suma = nota1 + nota2 + nota3 + nota4;
        double promedio = suma / 4;
        
        // Mostrar el resultado
        System.out.printf("El promedio de las calificaciones es: %.2f\n", promedio);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
