package TP4Y5;
import java.util.ArrayList;
public class MainGreedy{
		public static void main(String[] args){					
			Empresa empresa=new Empresa();
	
			Empleado e1=new Empleado("e1","Juan","Pérez",32,48);
			Empleado e2=new Empleado("e2","Roberto","Hernández",45,57);
			Empleado e3=new Empleado("e3","Camila","Gutiérrez",33,51);
			Empleado e4=new Empleado("e4","Francisco","Martínez",22,73);
			Empleado e5=new Empleado("e5","Benjamín","Núñez",55,15);
			Empleado e6=new Empleado("e6","Mateo","Morales",24,33);
			Empleado e7=new Empleado("e7","Delfina","López",36,92);
			Empleado e8=new Empleado("e8","Catalina","Cruz",51,71);
			Empleado e9=new Empleado("e9","Benicio","Montero",48,19);
			Empleado e10=new Empleado("e10","Valentino","González",58,22);
			Empleado e11=new Empleado("e11","Olivia","Gómez",33,41);
			Empleado e12=new Empleado("e12","Martina","Díaz",21,49);
			Empleado e13=new Empleado("e13","Joaquín","Cabrera",22,14);
			Empleado e14=new Empleado("e14","Bautista","Domínguez",36,33);
			Empleado e15=new Empleado("e15","Emilia","Paz",40,16);
			Empleado e16=new Empleado("e16","Francesca","Figueroa",43,21);
			Empleado e17=new Empleado("e17","Santino","Blanco",25,79);
			Empleado e18=new Empleado("e18","Ignacio","Ibarra",61,32);
			Empleado e19=new Empleado("e19","Andrea","Chávez",27,78);
			Empleado e20=new Empleado("e20","Elena","Mengochea",52,67);

			ArrayList<Empleado>participantes=new ArrayList<>();
			participantes.add(e1);
			participantes.add(e2);
			participantes.add(e3);
			participantes.add(e4);
			participantes.add(e5);
			participantes.add(e6);

			System.out.println("----------=Inicio=----------");

			ArrayList<Grupo> RTA=empresa.Greedy(participantes);
			System.out.println(RTA);

			System.out.println("-------------------------------------------");	
			
			participantes.clear();
			participantes.add(e7);
			participantes.add(e4);
			participantes.add(e8);
			participantes.add(e15);
			RTA=empresa.Greedy(participantes);
			System.out.println(RTA);
			
			System.out.println("-------------------------------------------");	
		
			participantes.clear();
			participantes.add(e19);
			participantes.add(e12);
			participantes.add(e11);
			participantes.add(e13);
			RTA=empresa.Greedy(participantes);
			System.out.println(RTA);
			
			System.out.println("-------------------------------------------");	

			participantes.clear();
			participantes.add(e7);
			participantes.add(e8);
			participantes.add(e20);
			participantes.add(e3);
			participantes.add(e16);
			RTA=empresa.Greedy(participantes);
			System.out.println(RTA);

			System.out.println("-------------------------------------------");	

			participantes.clear();
			participantes.add(e6);
			participantes.add(e15);
			participantes.add(e17);
			participantes.add(e13);
			participantes.add(e16);
			participantes.add(e10);
			RTA=empresa.Greedy(participantes);
			System.out.println(RTA);

			System.out.println("-------------------------------------------");	

			participantes.clear();
			participantes.add(e17);
			participantes.add(e2);
			participantes.add(e19);
			participantes.add(e20);
			participantes.add(e4);
			participantes.add(e12);
			participantes.add(e15);
			RTA=empresa.Greedy(participantes);
			System.out.println(RTA);

			System.out.println("-------------------------------------------");	
		
			participantes.clear();
			participantes.add(e12);
			participantes.add(e14);
			participantes.add(e18);
			participantes.add(e6);
			participantes.add(e2);
			participantes.add(e9);
			participantes.add(e10);
			participantes.add(e16);
			RTA=empresa.Greedy(participantes);
			System.out.println(RTA);

			System.out.println("-------------------------------------------");	
		
			participantes.clear();
			participantes.add(e1);
			participantes.add(e2);
			participantes.add(e3);
			participantes.add(e4);
			participantes.add(e5);
			participantes.add(e6);
			participantes.add(e7);
			participantes.add(e8);
			participantes.add(e9);
			participantes.add(e10);
			participantes.add(e11);
			participantes.add(e12);
			participantes.add(e13);
			participantes.add(e14);
			participantes.add(e15);
			participantes.add(e16);
			participantes.add(e17);
			participantes.add(e18);
			participantes.add(e19);
			participantes.add(e20);

			RTA=empresa.Greedy(participantes);
			System.out.println(RTA);

			System.out.println("-----FIN-----");	
		}
}