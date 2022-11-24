package repository;

/**
 * Clase Equipo
 * 
 * @author jmbj
 *
 */
public class Equipo {

	private String nombre;

	private String ciudad;

	public int puntos;

	public Equipo(String nombre, String ciudad, int puntos) {

		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.puntos = puntos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", ciudad=" + ciudad + ", puntos=" + puntos + "]";
	}

}
