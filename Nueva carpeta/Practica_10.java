import java.util.Scanner;

// Clase principal para probar el funcionamiento
public class Practica_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia de Libro
        Libro libro = new Libro("Ejemplo de Libro", "Autor Ejemplo", 2024, "123-456-789");

        // Mostrar información del libro
        libro.mostrarInformacion();

        // Mostrar el contenido de todas las páginas
        libro.mostrarPaginas();
        System.out.println("Ingrese el numero de pagina que quiere ver");
        int numeroPagina = scanner.nextInt();

        // Obtener y mostrar el contenido de una página específica
        libro.mostrarPaginaEspesifica(numeroPagina);
        scanner.close();
    }
}