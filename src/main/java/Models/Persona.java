package Models;

public class Persona {

	private String Nombre;
	private String Apellido;
	private String Correo;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
	public String getCorreo() {
		return Correo;
	}
	
	public Persona(String Nombre, String Apellido, String Correo){
	
	this.Nombre = Nombre;
	this.Apellido = Apellido;
	this.Correo = Correo;

	}
	
	public Persona() {}
	
}
