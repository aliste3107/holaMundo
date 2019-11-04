package beans;

public class Trabajador extends Persona{

	public String nuss;
	
	public Trabajador() {
		
		
	}

	public Trabajador(String nuss,String nombre, String apellido, String dni, int edad) {
		super(nombre,apellido,dni,edad);
		this.nuss = nuss;
	}

	@Override
	public String toString() {
		return "Trabajador [nuss=" + nuss + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
