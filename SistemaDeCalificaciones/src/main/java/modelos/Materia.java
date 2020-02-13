package modelos;

import java.util.List;

public class Materia {
	private MateriaEnum materia;
	private List<Float> notas;
	public MateriaEnum getMateria() {
		return materia;
	
	}
	public Materia(MateriaEnum materia, List<Float> notas) {
		super();
		this.materia = materia;
		this.notas = notas;
	}
	public void setMateria(MateriaEnum materia) {
		this.materia = materia;
	}
	@Override
	public String toString() {
		return "Materia [materia=" + materia + ", notas=" + notas + "]";
	}
	public List<Float> getNotas() {
		return notas;
	}
	public void setNotas(List<Float> notas) {
		this.notas = notas;
	}
	
}
