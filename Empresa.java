package TP4Y5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Empresa {
	private long ITERACCIONES=0;	
	public Empresa(){
	}
	public ArrayList<Grupo>Greedy(ArrayList<Empleado>candidatos){
		Collections.sort(candidatos);//ordena de mayor a menor por su fuerza de trabajo      
		ArrayList<Grupo> respuesta=new ArrayList<>();
		Grupo grupo1=new Grupo();
		Grupo grupo2=new Grupo();
		Iterator<Empleado> iterador=candidatos.iterator();
		int contador=0;
		while(iterador.hasNext()){
			Empleado empleado=iterador.next();
			seleccionar(empleado,grupo1,grupo2);	
			contador++;
			
		}
		System.out.println("Cantidad de iteraciones hasta encontrar la solucion:"+contador);
		respuesta.add(grupo1);
		respuesta.add(grupo2);
		return respuesta;
	}

	private void seleccionar(Empleado empleado,Grupo grupo1,Grupo grupo2){	
		if(grupo1.getFuerzaTotal()>=grupo2.getFuerzaTotal()) {
			grupo2.addIntegrante(empleado);
		}
		else {
			grupo1.addIntegrante(empleado);
		}
	}
	public Solucion algoritmoBacktracking(ArrayList<Empleado>candidatos) {
		int contadorFuerzaMaximaTotalCandidatos=0;
		for(int i=0;i<candidatos.size();i++) {
			contadorFuerzaMaximaTotalCandidatos+=candidatos.get(i).getFuerzaDeTrabajo();
		}
		Grupo g1=new Grupo();
		Grupo g2=new Grupo();
		int contador=-1;
		Solucion solu=new Solucion();
		back(candidatos,contador,g1,g2,solu,contadorFuerzaMaximaTotalCandidatos);
		System.out.println("ITERACIONES:"+ITERACCIONES);
		return solu;
	}
	public void back(ArrayList<Empleado>candidatos,int contador,Grupo g1,Grupo g2,Solucion solu1,int contadorFuerzaMaximaTotalCandidatos){
		Solucion solu2=new Solucion();
		if(solucionBack(g1,g2,candidatos)){
			setearSolucion(solu2,g1,g2);
			if(solu2.getDifFuerzaTrabajo()<solu1.getDifFuerzaTrabajo()){
				setearSolucion(solu1,g1,g2);
			}
		}else {
			if(contador<candidatos.size()-1){	
				contador++;			
				if(poda(candidatos.get(contador).getFuerzaDeTrabajo(),g1,g2,contadorFuerzaMaximaTotalCandidatos)){
					agregarAutoBackDeletear(g1,g1,g2,candidatos,solu1,contadorFuerzaMaximaTotalCandidatos,contador);
					ITERACCIONES++;	
					agregarAutoBackDeletear(g2,g1,g2,candidatos,solu1,contadorFuerzaMaximaTotalCandidatos,contador);
				}
			}
		}
	}	
	private void agregarAutoBackDeletear(Grupo g,Grupo g1,Grupo g2,ArrayList<Empleado>candidatos,Solucion solu,int contadorFuerzaMaximaTotalCandidatos,int contador) {
		g.addIntegrante(candidatos.get(contador));
		back(candidatos,contador,g1,g2,solu,contadorFuerzaMaximaTotalCandidatos);
		g.deleteIntegrante(candidatos.get(contador));
	}
	private boolean poda(int fuerzaDeTrabajoEmpleadoActual,Grupo g1,Grupo g2,int contadorFuerzaMaxima) {
		if(!(Math.abs(g1.getFuerzaTotal()-g2.getFuerzaTotal())-fuerzaDeTrabajoEmpleadoActual>contadorFuerzaMaxima/2)){
			return true;
		}
		return false;
	}
	//En este caso si la diferencia de trabajo menos lo que te falta probar es superior a la mitad del valor total podrías podar
	//porque no llegarías a menos diferencia que eso y no dependés de una suposición sobre los datos.
	private boolean solucionBack(Grupo g1,Grupo g2,ArrayList<Empleado>candidatos){
		if((g1.getIntegrantes().size()+g2.getIntegrantes().size())==(candidatos.size())) {
			return true;
		}	
		return false;
	}
	private void setearSolucion(Solucion solu,Grupo g1,Grupo g2){
		solu.setGrupo1(g1);
		solu.setGrupo2(g2);
		if(g1.getFuerzaTotal()>g2.getFuerzaTotal()){
			solu.setDifFuerzaTrabajo(g1.getFuerzaTotal()-g2.getFuerzaTotal());
		}else {
			solu.setDifFuerzaTrabajo(g2.getFuerzaTotal()-g1.getFuerzaTotal());
		}
	}
}