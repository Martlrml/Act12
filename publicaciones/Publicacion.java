package publicaciones;

public abstract class Publicacion {

	private int id;
	private String autor;
	private String contenido;
	private String fechaCreacion;
	private int likes;

	public Publicacion(int id, String autor, String contenido, String fechaCreacion) {
		this.id = id;
		this.autor = autor;
		this.contenido = contenido;
		this.fechaCreacion = fechaCreacion;
		this.likes = 0;
	}

	// Lo hace cualquier publicacion: se escribe una sola vez
	public void darLike() {
		likes++;
		System.out.println("@" + autor + " recibio un like (total: " + likes + ")");
	}

	// Cada publicacion se muestra a su manera
	public abstract void mostrar();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}
}
