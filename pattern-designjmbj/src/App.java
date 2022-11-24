import builder.EquipoBuilder;
import repository.Equipo;
import singleton.Singleton;

public class App {

	public static void main(String[] args) {
		
		System.out.println("***********B U I L D E R***********");
		EquipoBuilder builder1 = new EquipoBuilder();
		builder1.setNombre("Sevilla Futbol Club");
		builder1.setCiudad("Sevilla");
		builder1.setPuntos(23);
		Equipo equipo1  = builder1.build();

		
	
		System.out.println("***********Imprimiendo equipo***********");

		System.out.println(equipo1);
		
		
		System.out.println("***********S I N G L E T O N***********");

		builder1 = new EquipoBuilder();
		
		builder1.setNombre("Real Betis Balompié");
		builder1.setCiudad("Sevilla");
		builder1.setPuntos(15);
		
		Equipo equipo2 = builder1.build();
		
		Singleton singleton = Singleton.getInstance(equipo2);
		Singleton anotherSingleton = Singleton.getInstance(equipo1);
		System.out.println(singleton.equipo.toString());
		System.out.println(anotherSingleton.equipo.toString());

	}

}
