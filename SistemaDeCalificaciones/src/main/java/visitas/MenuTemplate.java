package visitas;

import java.util.Scanner;

public abstract class MenuTemplate {
	Scanner sc = new Scanner(System.in);

	public void cargarDatos() {

	}

	public void exportarDatos() {

	}

	public void crearAlumno() {

	}

	public void agregarMateria() {

	}

	public void agregarNotaPasoUno() {

	}

	public void listarAlumnos() {

	}

	public void terminarPrograma() {

	}

	public static void iniciarMenu() {
		System.out.println("Selecciona la opción ingresando el dígito correspondiente:");
		System.out.println("1-Crear Alumno");
		System.out.println("2-Listar Alumnos");
		System.out.println("3-Agregar Materias");
		System.out.println("4-Agregar Notas");
		System.out.println("5-Cargar Datos");
		System.out.println("6-Exportar Datos");
		System.out.println("7- Salir");
		System.out.print("Selección: ");
	}

}
