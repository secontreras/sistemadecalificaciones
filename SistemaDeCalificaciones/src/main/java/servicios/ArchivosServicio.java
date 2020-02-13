package servicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import modelos.Alumno;
import modelos.Materia;

public class ArchivosServicio {
	protected List<Alumno> alumnosaCargar;
	protected PromedioServicioIMP promedioServicioImp;
	
	

	public ArchivosServicio(PromedioServicioIMP promedioServicioImp) {
		super();
		this.alumnosaCargar = new ArrayList<Alumno>();
		this.promedioServicioImp = promedioServicioImp;
	}

	public void cargarDatos(String archivo) {
		System.out.println("Cargando datos de "+archivo+"...");
		try {
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			String data = br.readLine();
			while (data != null) {
				String[] arregloAlumnos = data.split(",");
				String rut = arregloAlumnos[0];
				String nombre = arregloAlumnos[1];
				String apellido = arregloAlumnos[2];
				String direccion = arregloAlumnos[3];
				String materia = arregloAlumnos [4];
				String notas = arregloAlumnos[5];
				Alumno nuevoAlumno =new Alumno(rut,nombre, apellido, direccion, new ArrayList<Materia>());  
				alumnosaCargar.add(nuevoAlumno);
				data = br.readLine();
			}
			br.close();
			fr.close();
			System.out.println("Información cargada con éxito");
		} catch (Exception e) {
			
			System.out.println("Excepcion leyendo fichero " + archivo + ": " + e);
		}
	}
	public void exportarDatos(String nombreArchivo, ArrayList<Alumno> arrayList) {
		 FileWriter flwriter = null;
		 try {
		 flwriter =new FileWriter("C:\\Users\\user\\eclipse-workspace\\SistemaDeCalificaciones\\archivoExportado.txt");
		 flwriter = new FileWriter(nombreArchivo);
		 BufferedWriter bfwriter = new BufferedWriter(flwriter);
		 for (Alumno alumno : arrayList) {
			 bfwriter.write(alumno.getRut()+alumno.getNombre()+alumno.getApellido()+alumno.getDireccion()+alumno.getMateria());
		 }
		 bfwriter.close();
		 flwriter.close();
		 System.out.println("Información exportada correctamente.");
		 }
		 catch(Exception e){
		 System.out.println("Fichero " + nombreArchivo + "no se pudo crear" + e);
		 }
		}
}
