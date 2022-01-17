package TP4Y5;
public class Empleado extends Persona implements Comparable<Empleado>{
	private int fuerzaDeTrabajo;
	private String id;
	public Empleado(String id,String nombre,String apellido,int edad,int fuerzaDeTrabajo){
		super(nombre,edad,apellido);
		this.fuerzaDeTrabajo=fuerzaDeTrabajo;
		this.id=id;
	}
	public int getFuerzaDeTrabajo(){
		return this.fuerzaDeTrabajo;
	}
	public String getId() {
		return this.id;
	}	
	public void setFuerzaDeTrabajo(int fuerzaDeTrabajo){
		this.fuerzaDeTrabajo=fuerzaDeTrabajo;
	}
	public String toString() {
		String imprimir="";
		imprimir=getNombre();
		return imprimir;
	}
	@Override
	public int compareTo(Empleado o) {
		if (this.getFuerzaDeTrabajo()<o.getFuerzaDeTrabajo()){
			return 1;
		}
		if (this.getFuerzaDeTrabajo()==o.getFuerzaDeTrabajo()){
		    return 0;
		} else {
		    return -1;
		}
	}	
}