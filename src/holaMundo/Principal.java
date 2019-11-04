package holaMundo;

import beans.Persona;
//import beans.Trabajador;

public class Principal {

	public static void main(String[] args) {
		//System.out.println("HOLA MUNDO1");
		Persona p1=new Persona();
		p1.setNombre("Alberto");		
		p1.setApellido("Rodríguez");
		p1.setDni("45682178S");
		p1.setEdad(34);
	
		System.out.println(p1);
		

//		Persona p2=new Persona("Rebeca", "Garcia", "45683399X", 37);		
//		System.out.println(p2);
//		p1=p2;
//		p2.setNombre("antonio");
//		System.out.println(p1);
//		
//
//		Persona p3=new Persona("antonio", "perez","12345678S", 99);
		
		//La persona p3 tiene nombre X e Y años.
		
//		System.out.println("La persona p3 se llama " + p3.getNombre() + " y tiene " + p3.getEdad() + " años.");
		
		if (comprobarDni(p1)) {
			System.out.println("Dni "+p1.getDni() + " valiado correctamente.");
		} else {
			System.out.println("Dni "+p1.getDni() + " erróneo.");
		}
		
	}

	private static boolean comprobarDni(String dni) {
		String letras="TRWAGMYFPDXBNJZSQVHLCKE";
	
		if (null== dni || dni.length() != 9) {
			return false;			
		}
		
		String sub;
		sub=dni.substring(0,8);
		int numero=Integer.parseInt(sub);
		int resto=numero %23;
				
		if (letras.charAt(resto)==dni.charAt(8)) {
			return true;
		}
		return false;
	}
	
	public static boolean comprobarDni(Persona persona) {
		if(null!=persona) {
			return comprobarDni(persona.getDni());
		}
		return false;
	}
}
