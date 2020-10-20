package Models;

public class Estudiante {

	private int id;
	private int edad;
	private String nombre;
	private String apellido;
	private String direccion;
	
	public Estudiante(int id, int edad, String nombre, String apellido, String direccion){
		this.id = id;
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}
	
	public Estudiante(){}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
