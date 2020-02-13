package cl.desafiolatam.SistemaDeCalificaciones;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import modelos.Alumno;
import servicios.AlumnoServicio;
import visitas.Menu;

/**
 * Unit test for simple App.
 */
public class AppTest {
	AlumnoServicio alumnoServicio;

	/**
	 * Rigorous Test :-)
	 */
	@Before
	public void setUp() {
		alumnoServicio = new AlumnoServicio();
	}

	@Test
	public void alumnoServicioTest() {
		Alumno alumno = new Alumno("20", "jose", "gonzales", "casa", null);
		// When
		alumnoServicio.crearAlumno(alumno);
		// Given

		// Then
		assertEquals(alumnoServicio.listarAlumnos().size(), 1); //Aquí verifiqué si es que se agregó correctamente el alumno, poniendo a prueba el método.
	}
	Menu menu;
	
	@Test
	public void listarAlumnosTest() {
		Alumno alumno = new Alumno("144", "pedro","perez","depto12", null);
		//When
		alumnoServicio.crearAlumno(alumno);
		//then
		assertTrue(alumnoServicio.listarAlumnos().containsValue(alumno)); // Aquí realicé el test verificando si es que al añadir el alumno a la lista este lo contiene, ya que en el metodo listarALumno sólo se imprime la lista.
	}
}
