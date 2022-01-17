package TP4Y5;
public class Solucion{
	private Grupo grupo1;
	private Grupo grupo2;
	private int difFuerzaTrabajo;
	public Solucion(){
		this.difFuerzaTrabajo=Integer.MAX_VALUE;
		this.grupo1=new Grupo();
		this.grupo2=new Grupo();
	}
	public int getDifFuerzaTrabajo(){
		return this.difFuerzaTrabajo;
	}
	public void setGrupo1(Grupo g1) {
		this.grupo1=new Grupo(g1.getIntegrantes());
	}
	public void setGrupo2(Grupo g2) {
		this.grupo2=new Grupo(g2.getIntegrantes());
	}
	
	public void setGrupos(Grupo g1,Grupo g2) {
		this.grupo1=new Grupo(g1.getIntegrantes());
		this.grupo2=new Grupo(g2.getIntegrantes());

	}
	public void setDifFuerzaTrabajo(int dif){
		this.difFuerzaTrabajo=dif;
	}
	public Grupo getGrupo1(){
		Grupo g1 = new Grupo(grupo1.getIntegrantes());
		return g1;
	}
	public Grupo getGrupo2(){
		Grupo g2 = new Grupo(grupo2.getIntegrantes());
		return g2;
	}
	public void limpiar(){
		this.grupo1=new Grupo();
		this.grupo2=new Grupo();
		this.difFuerzaTrabajo=0;
	}
	public String toString(){
		String imprimir="";
		imprimir ="Grupo1:"+grupo1.getIntegrantes()+" Grupo2:"+ grupo2.getIntegrantes()+"\n"+"Diferencia de fuerza de trabajo:"+getDifFuerzaTrabajo();
		return imprimir;
	}
}