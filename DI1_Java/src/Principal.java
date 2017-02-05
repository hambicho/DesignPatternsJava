
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IEquipo equipo = new Barcelona();
		Jugador messi = new Jugador(equipo);
		messi.mostrarEquipo();
	}

}
