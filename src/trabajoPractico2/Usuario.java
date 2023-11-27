package trabajoPractico2;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class Usuario {
	
	
	private String nombre;
	
	private String apellido;
	
	private int edad;
	
    private Date altaUsuario;
 
	Usuario(String nombre, String apellido,int edad){
		
		this.nombre=nombre;
		
		this.apellido=apellido;
		
		this.edad=edad;
		
		GregorianCalendar calendario=new GregorianCalendar();
	    
		altaUsuario=calendario.getTime();
		
	};

	public String getNombre() {
		return nombre;
	};
	public String getApellido() {
		return apellido;
	};
	public int getEdad() {
		return edad;
	};
	public Date getAltaUsuario() {
		return altaUsuario;
	}
	


	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", altaUsuario="
				+ altaUsuario + "]";
	}

	


	
	


	
}


