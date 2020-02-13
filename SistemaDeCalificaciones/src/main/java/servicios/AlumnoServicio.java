package servicios;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.Alumno;
import modelos.Materia;

public class AlumnoServicio {
	protected Map<String, Alumno> listaAlumno;
	public AlumnoServicio() {
		super();
		this.listaAlumno= new HashMap<>();
	}

	public void crearAlumno(Alumno alumno) {
		listaAlumno.put(alumno.getRut(),alumno);
	}
	public void agregarMateria(String rutAlumno, Materia currentMate) {
		Alumno alumno = listaAlumno.get(rutAlumno);
		alumno.agregarMateria(currentMate);
		listaAlumno.put(rutAlumno, alumno);
		
	}
	public List<Materia> materiasPorAlumno (String rutAlumno) {
		return null;
	}
	public Map<String,Alumno> listarAlumnos(){
		return listaAlumno;
	}
}
