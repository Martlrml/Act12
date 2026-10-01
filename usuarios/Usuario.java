package usuarios;

public abstract class Usuario {

	private String username;
	private String email;
	private String fechaAlta;
	private boolean verificado;

	public Usuario(String username, String email, String fechaAlta, boolean verificado) {
		this.username = username;
		this.email = email;
		this.fechaAlta = fechaAlta;
		this.verificado = verificado;
	}

	// Lo hace cualquier usuario: se escribe una sola vez
	public void iniciarSesion() {
		System.out.println("@" + username + " inicio sesion");
	}

	// Cada usuario muestra su perfil a su manera
	public abstract void mostrarPerfil();

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public boolean isVerificado() {
		return verificado;
	}

	public void setVerificado(boolean verificado) {
		this.verificado = verificado;
	}
}
