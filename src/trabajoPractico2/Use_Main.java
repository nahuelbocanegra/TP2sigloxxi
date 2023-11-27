package trabajoPractico2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Use_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Usuario> RegistroUsuario = new ArrayList<Usuario>(); 
		
		ArrayList<Libros>biblioteca=new ArrayList<Libros>();
		
		Libros libro1=new Libros("Mark Twain","Las aventuras de Tom Sawyer"," Aventuras");
		Libros libro2=new Libros("Isaac Asimov","Robbie","Ciencia Ficción");
		Libros libro3=new Libros("A. Conan Doyle","El ritual de los Musgrave","Policíaca");
		Libros libro4=new Libros("Lovecraft","Relatos Espectrales de H.P","Terror y misterio");
		Libros libro5=new Libros("Gustave Flaubert","Madame Bovary","Romántica");
		Libros libro6=new Libros("Antonio Machado","Poesía","Poesía");
		Libros libro7=new Libros("Ovidio","Metamorfosis","Mitología");
		Libros libro8=new Libros("Miguel Mihura","Tres sombreros de copa","Teatro");
		Libros libro9=new Libros("Oscar Wilde","El fantasma de Canterville ","Cuento");


		biblioteca.add(libro1);
		biblioteca.add(libro2);
		biblioteca.add(libro3);
		biblioteca.add(libro4);
		biblioteca.add(libro5);
		biblioteca.add(libro6);
		biblioteca.add(libro7);
		biblioteca.add(libro8);
		biblioteca.add(libro9);
		
		System.out.println(libro1.genero);
		
		String nombre;
		String apellido;
		Integer edad;
		boolean op=true;
		boolean registro=true;
		
		
		
		while(registro) {
			
			nombre=JOptionPane.showInputDialog("Introduce tu nombre para el registro");
			
			apellido=JOptionPane.showInputDialog("Introduce tu apellido para el registro");
			
			edad=  Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad para el registro(mayor a 15 años)")); 
			
			
			if(nombre.equals("") == false && apellido.equals("") == false && edad>=15) {
				
				Usuario user= new Usuario(nombre,apellido,edad);
				
				RegistroUsuario.add(user);
				
				registro = false;
			}
			
		};
		
		
		while(op) {
			
			String value=JOptionPane.showInputDialog(""); 
			
			if(value.equalsIgnoreCase("agregar")) {
				
				String titulo=JOptionPane.showInputDialog("Agregar el del titulo del libro: ");
				
				String autor=JOptionPane.showInputDialog("Agregar el del autor del libro: ");
				
				String genero=JOptionPane.showInputDialog("Agregar el del genero del libro: ");
				
				Libros nuevoLibro = new Libros(autor,genero,titulo);
				
				biblioteca.add(nuevoLibro);
			}
			if(value.equalsIgnoreCase("borrar")){
				
			}
			if(value.equalsIgnoreCase("buscar")) {
				
			}
			
			
		
			op=false;
		}
		
		System.out.println(biblioteca.toString());
		
		
	}	 
	
		 
}
