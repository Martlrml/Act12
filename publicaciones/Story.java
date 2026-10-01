package publicaciones;

import interfaces.Reportable;

// implements Reportable
// OJO: las stories NO son Comentable. Se responden por mensaje directo,
// no por comentario debajo. No le agregues Comentable.
public class Story extends Publicacion implements Reportable {

	private int horasRestantes;

	public Story(int id, String autor, String contenido, String fechaCreacion, int horasRestantes) {
		super(id, autor, contenido, fechaCreacion);
		this.horasRestantes = horasRestantes;
	}

	@Override
	public void mostrar() {
		System.out.println("[STORY #" + getId() + "] @" + getAutor() + " - expira en " + horasRestantes + " hs");
		System.out.println("  " + getContenido());
	}

	public int getHorasRestantes() {
		return horasRestantes;
	}

	public void setHorasRestantes(int horasRestantes) {
		this.horasRestantes = horasRestantes;
	}

	// aca van los metodos de Reportable

	@Override
	public void reportar(String motivo) {
		System.out.println(getAutor() + " Reporto la story por: \n" + motivo);
	}
}
