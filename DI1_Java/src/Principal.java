
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		IEquipo equipo = new ManchesterUnited(); //new Barcelona();
//		ManchesterUnited equipo = new ManchesterUnited();
		Barcelona equipo = new Barcelona();
		Jugador messi = new Jugador(equipo);
		messi.mostrarEquipo();
	}

}
