// Clase Libro
public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String isbn;
    private Pagina[] paginas; // Arreglo de páginas

    // Constructor
    public Libro(String titulo, String autor, int añoPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
        this.paginas = new Pagina[500]; // Inicializamos el arreglo con 500 páginas
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void agregarPagina(int numero, String contenido) {
        if (numero >= 0 && numero < paginas.length) {
            paginas[numero] = new Pagina(numero + 1, contenido);
        } else {
            System.out.println("Número de página no válido");
        }
    }

    // Método para obtener el contenido de una página específica
    public String getContenidoPagina(int numero) {
        if (numero >= 0 && numero < paginas.length && paginas[numero] != null) {
            return paginas[numero].getContenido();
        } else {
            return "Página no disponible";
        }
    }

    // Método para mostrar información del libro
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + añoPublicacion);
        System.out.println("ISBN: " + isbn);
    }

    // Método para mostrar el contenido de todas las páginas
    public void mostrarPaginas() {
        for (int i = 0; i < paginas.length; i++) {
            if (paginas[i] != null) {
                System.out.println("Página " + paginas[i].getNumeroPagina() + ": " + paginas[i].getContenido());
            }
        }
    }

    public void mostrarPaginaEspesifica(int numeroPagina) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarPaginaEspesifica'");
    }
}