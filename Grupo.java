package TP4Y5;
import java.util.ArrayList;
import java.util.Iterator;
public class Grupo{
	private int fuerzaTotal;
	private ArrayList<Empleado>integrantes;
	public Grupo() {
		this.fuerzaTotal=0;
		this.integrantes=new ArrayList<>();
	}
	public Grupo(ArrayList<Empleado>emp){
		this.integrantes=new ArrayList<>(emp);
	}
	public String toString(){
		String rta="";
		Iterator<Empleado>ite=integrantes.iterator();
		while(ite.hasNext()){
			rta+="->["+(ite.next().getNombre()+"]");
		}
		return rta+"[FuerzaTotal:"+this.fuerzaTotal+"]";
	}
	public int getFuerzaTotal(){
		return this.fuerzaTotal;
	}
	public ArrayList<Empleado>getIntegrantes(){ 
		return 	new ArrayList<>(integrantes);
	}
	public void addIntegrante(Empleado e){
		this.integrantes.add(e);
		this.fuerzaTotal=this.fuerzaTotal+e.getFuerzaDeTrabajo();
	}
	public void deleteIntegrante(Empleado e){
		this.fuerzaTotal=fuerzaTotal-e.getFuerzaDeTrabajo();
		this.integrantes.remove(e);
	}	
}