package modelos;

import java.util.List;

public class Alumno {
	protected String rut;
	protected String nombre;
	protected String apellido;
	protected String direccion;
	protected List<Materia> materia;

	public Alumno(String rut, String nombre, String apellido, String direccion, List<Materia> materia) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Alumno [rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", materia=" + materia + "]";
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Materia> getMateria() {
		return materia;
	}

	public void setMateria(List<Materia> materia) {
		this.materia = materia;
	}

	public void agregarMateria(Materia currentMate) {
		// TODO Apéndice de método generado automáticamente
		this.materia.add(currentMate);
	}
}
