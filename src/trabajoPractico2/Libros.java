package trabajoPractico2;



public class Libros {
	
	
	
	String autor;
	String titulo;
    String genero;
    
    
    Libros(String autor,String titulo,String genero){
    	this.autor=autor;
    	this.genero=genero;
    	this.titulo= titulo;
    
    }


	@Override
	public String toString() {
		return "Libros [autor=" + autor + ", titulo=" + titulo + ", genero=" + genero + "]";
	};
    
 
}

