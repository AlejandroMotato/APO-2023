package Solucion;

public class Punto3 {
	
	public class Libro {
	    private String ISBN;
	    private String titulo;
	    private String autor;
	    private int numPaginas;
	    
	    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
	        this.ISBN = ISBN;
	        this.titulo = titulo;
	        this.autor = autor;
	        this.numPaginas = numPaginas;
	    }
	    
	    public String getISBN() {
	        return ISBN;
	    }
	    
	    public void setISBN(String ISBN) {
	        this.ISBN = ISBN;
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
	    
	    public int getNumPaginas() {
	        return numPaginas;
	    }
	    
	    public void setNumPaginas(int numPaginas) {
	        this.numPaginas = numPaginas;
	    }
	    
	    
	    public String toString() {
	        return "El libro con ISBN " + ISBN + " creado por " + autor + " tiene " + numPaginas + " páginas";

	        
	    }
	    
	}



public Punto3(String string, String string2, String string3, int i) {

	}



public static void main(String[] args) {
    Punto3 libro1 = new libro1 ("1234567890", "El nombre del viento", "Patrick Rothfuss", 662);
    Punto3 libro2 = new libro2 ("0987654321", "Juego de tronos", "George R. R. Martin", 864);
    
    System.out.println(libro1);
    System.out.println(libro2);
    
    if (Punto3.getNumPaginas(0) > Punto3.getNumPaginas(0)) {
        System.out.println("El libro 1 tiene más páginas que el libro 2");
    } else if (Punto3.getNumPaginas(0) < Punto3.getNumPaginas(0)) {
        System.out.println("El libro 2 tiene más páginas que el libro 1");
    } else {
        System.out.println("Ambos libros tienen el mismo número de páginas");
    }
}



private static int getNumPaginas(int i) {
	// TODO Auto-generated method stub
	return 0;
}


}






