package singleton;

import repository.Equipo;

public final class Singleton {

	private static Singleton instance;
	public Equipo equipo;
	
	private Singleton(Equipo equipo) {
		this.equipo = equipo;
	}
	
	public static Singleton getInstance (Equipo equipo) {
		if (instance == null) {
			instance = new Singleton(equipo);
		}
		return instance;
	}
}
