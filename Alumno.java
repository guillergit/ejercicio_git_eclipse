package Ejercicio_git_eclipse_guillermo;

public class Alumno {
	private String nombre, apellido, dni;
	
	public Alumno (String n, String a, String d){
		nombre = n;
		apellido = a;
		dni = d;
	}

	@Override
	public String toString() {
		return "Alumno{ Nombre: " + nombre + ", Apellido: " + apellido + ", DNI: " + dni + "}";
	}
	
}
