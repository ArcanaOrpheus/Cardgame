import java.io.Serializable;

public class Ataque implements Serializable{
	int atk;
	String name;
	
	Ataque(int ataque, String nombre){
		atk=ataque;
		name=nombre;
	}
}
