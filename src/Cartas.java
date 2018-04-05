import java.util.ArrayDeque;

public class Cartas extends Carta{
	
	public static  ArrayDeque <Carta> biblioteca = new ArrayDeque <Carta>();
	

	public Cartas() {
		Carta n = new Carta();
		nombre="Growlithe";
		vida=60;
    	ataque1=10;
    	atak1="Mordisco";
    	numero=68;
    	biblioteca.add(n);
    	Carta n2 = new Carta();
    	nombre="Squirtle";
    	vida=60;
    	ataque1=10;
    	atak1="Mordisco";
    	ataque2=30;
    	atak2="Cabezazo";
    	numero=68;
    	biblioteca.add(n2);
    	
	}

}
