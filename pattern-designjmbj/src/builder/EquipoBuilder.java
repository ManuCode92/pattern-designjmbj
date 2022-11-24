package builder;

import repository.Equipo;

/**
 * 
 * @author jmbj
 *
 */
public class EquipoBuilder implements Builder {

	private String nombre;
	private String ciudad;
	private int puntos;

	@Override
	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

	@Override
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public Equipo build() {
		return new Equipo(nombre, ciudad, puntos);
	}

}
