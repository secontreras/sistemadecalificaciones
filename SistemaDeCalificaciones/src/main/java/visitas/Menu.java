package visitas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelos.Alumno;
import modelos.Materia;
import modelos.MateriaEnum;
import servicios.AlumnoServicio;
import servicios.ArchivosServicio;

public class Menu extends MenuTemplate {
	Scanner sc = new Scanner(System.in);
	protected AlumnoServicio alumnoServicio;
	protected ArchivosServicio archivosServicio;

	public Menu(AlumnoServicio alumnoServicio, ArchivosServicio archivosServicio) {
		this.alumnoServicio=alumnoServicio;
		this.archivosServicio=archivosServicio;
	}

	public AlumnoServicio getAlumnoServicio() {
		return alumnoServicio;
	}

	public void setAlumnoServicio(AlumnoServicio alumnoServicio) {
		this.alumnoServicio = alumnoServicio;
	}

	public ArchivosServicio getArchivosServicio() {
		return archivosServicio;
	}

	public void setArchivosServicio(ArchivosServicio archivosServicio) {
		this.archivosServicio = archivosServicio;
	}
	@Override 
	public void cargarDatos() {
		System.out.println("Opción 5 ------------------------------------------------------------- Cargar Datos");
		archivosServicio.cargarDatos("notas.csv");
	}
	@Override 
	public void exportarDatos() {
		AlumnoServicio alumnoServicio = new AlumnoServicio();
		archivosServicio.exportarDatos("archivoExportado.txt", new ArrayList<Alumno>());
		
	}
	@Override
	public void crearAlumno() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Opción 1 ------------------------------------------------------------- Crear Alumno");
		System.out.println("Ingresa el rut: ");
		String rut = sc.nextLine();
		System.out.println("Ingresa nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Ingrese Apellido: ");
		String apellido = sc.nextLine();
		System.out.println("Ingresa tu Dirección: ");
		String direccion = sc.nextLine();
		Alumno alumno = new Alumno(rut, nombre, apellido, direccion, new ArrayList<Materia>());
		alumnoServicio.crearAlumno(alumno);
	}
	@Override 
	public void agregarMateria() {
		System.out.println("Opción 4 ------------------------------------------------------------- Agregar Materia");
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el rut del alumno: ");
		String rutAlumno = sc.nextLine();
		System.out.println("Selecciona la materia que deseas agregar seleccionando el dígito correspondiente:");
		System.out.println("1) Matemáticas");
		System.out.println("2) Lenguaje");
		System.out.println("3) Ciencias");
		System.out.println("4) Historia");
		int seleccion = sc.nextInt();
		MateriaEnum mat = null;
		if (seleccion == 1) {
			mat = MateriaEnum.Matematicas;
		} else if (seleccion == 2) {
			mat = MateriaEnum.Lenguaje;
		} else if (seleccion == 3) {
			mat = MateriaEnum.Ciencias;
		} else if (seleccion == 4) {
			mat = MateriaEnum.Historia;
		}
		Materia mate = new Materia (mat, new ArrayList());
		alumnoServicio.agregarMateria(rutAlumno, mate);
		System.out.println("Materia añadida correctamente.");
	}
	@Override
	public void agregarNotaPasoUno() {
		
	}
	@Override 
	public void listarAlumnos() {
		System.out.println("Opción 2 ------------------------------------------------------------- Listar Alumnos");
		System.out.println(alumnoServicio.listarAlumnos());
	}
	@Override
	public void terminarPrograma() {
		System.out.println("Cerrando app...\nApp cerrada.");
		
		
	}
}
