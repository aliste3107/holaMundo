package beans;

public class Persona {

		private String nombre;
		private String apellido;
		private String dni;
		private int edad;
		
		public Persona() {
			
		}
		
		public Persona(String nombre, String apellido, String dni, int edad) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.dni = dni;
			this.edad = edad;
		}

		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad + "]";
		}	
		
	
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre=nombre;
		}

		
		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		
		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		
		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		
}
