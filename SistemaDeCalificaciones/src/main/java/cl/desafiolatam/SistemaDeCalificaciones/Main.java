package cl.desafiolatam.SistemaDeCalificaciones;

import java.util.Scanner;

import servicios.AlumnoServicio;
import servicios.ArchivosServicio;
import servicios.PromedioServicioIMP;
import visitas.Menu;
import visitas.MenuTemplate;

/**
 * Hello world!
 *
 */
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		AlumnoServicio alumnoServicio = new AlumnoServicio();
		PromedioServicioIMP promedio = new PromedioServicioIMP();
		ArchivosServicio archivosServicio = new ArchivosServicio(promedio);
		Menu menu1 = new Menu(alumnoServicio, archivosServicio);
		boolean salir = false;
		do {
			MenuTemplate.iniciarMenu();
			int opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				menu1.crearAlumno();
				System.out.println("---Alumno Creado---");
				break;
			case 2:
				menu1.listarAlumnos();
				break;
			case 3:
				menu1.agregarMateria();
				break;
			case 4:
				menu1.agregarNotaPasoUno();
				break;
			case 5:
				menu1.cargarDatos();
				break;
			case 6:
				menu1.exportarDatos();
				break;
			case 7:
				menu1.terminarPrograma();
				return;
			}
		} while (salir=true);

	}
}
