package TP4Y5;
public class Persona{
	private String nombre;
	private int edad;
	private String apellido;
	public Persona(String nombre,int edad,String apellido){
		this.nombre=nombre;
		this.edad=edad;
		this.apellido=apellido;
	}
	public String getNombre(){
		return this.nombre;
	}
	public int getEdad(){
		return this.edad;
	}
	public String getApellido(){
		return this.apellido;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setEdad(int edad){
		this.edad=edad;
	}
	public void setApellido(String apellido){
		this.apellido=apellido;
	}
}