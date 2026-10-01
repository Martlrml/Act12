package app;

import java.util.ArrayList;

import interfaces.Comentable;
import interfaces.Reportable;
import publicaciones.Post;
import publicaciones.Publicacion;
import publicaciones.Story;
import usuarios.Cuenta;
import usuarios.Pagina;
import usuarios.Usuario;

public class Main {

	public static void main(String[] args) {

		// Dos publicaciones
		Post post = new Post(1, "juanp", "Terminamos la Copa Fatima con dos goles", "2026-08-14", "cancha.jpg");
		Story story = new Story(2, "juanp", "Yendo a entrenar", "2026-09-09", 20);

		// Dos usuarios
		Cuenta cuenta = new Cuenta("juanp", "juanp@mail.com", "2023-02-11", false, "Juan Perez", 245);
		Pagina pagina = new Pagina("fatimatec", "info@fatima.edu.ar", "2019-05-01", true, "Instituto Fatima", 3100,
				"Educacion");

		// Cada familia por separado, sin necesidad de interfaces
		ArrayList<Publicacion> publicaciones = new ArrayList<>();
		publicaciones.add(post);
		publicaciones.add(story);

		ArrayList<Usuario> usuarios = new ArrayList<>();
		usuarios.add(cuenta);
		usuarios.add(pagina);

		System.out.println("=== PUBLICACIONES ===");
		for (Publicacion p : publicaciones) {
			p.mostrar();
		}

		System.out.println("\n=== USUARIOS ===");
		for (Usuario u : usuarios) {
			u.mostrarPerfil();
		}

		// PROBLEMA: hoy la moderadora tiene que recorrer TODO lo que la gente
		// reporto: hay posts, stories, cuentas y hasta paginas denunciadas.
		// Necesita UNA sola lista con las cuatro cosas mezcladas para procesar
		// las denuncias, pero Publicacion y Usuario no tienen nada en comun.

		ArrayList<Reportable> Reportes = new ArrayList<>();
		Reportes.add(post);
		Reportes.add(story);
		Reportes.add(cuenta);
		Reportes.add(pagina);

		System.out.println("\n=== REPORTES ===");
		for (Reportable R : Reportes) {
			System.out.println("=======================");
			R.reportar("por gil");

		}

		ArrayList<Comentable> Comentarios = new ArrayList<>();
		Comentarios.add(post);
		// Comentarios.add(story); No funciona ya que no comparte la interfaz Comentable
		// por lo cual no es admitida por ArrayList<Comentable>.
		Comentarios.add(cuenta);
		Comentarios.add(pagina);

		System.out.println("\n=== Comentarios ===");
		for (Comentable C : Comentarios) {
			System.out.println("=======================");
			C.comentar("Nano", "Holis");

		}

		// ==== ERROR ====

		// ArrayList<Publicacion> reportes = new ArrayList<>();
		// reportes.add(cuenta);

		// Rta: El error que sucede este codigo es que intenta agregar la clase "cuenta"
		// pero esa clase de Publicaciones no admite
		// por eso mismo no nos permite agregar dicha clase a un arraylist ya que solo
		// admite objetos del tipo Publicacion

	}
}