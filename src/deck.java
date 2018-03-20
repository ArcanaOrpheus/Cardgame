import java.util.ArrayDeque;
import java.util.ArrayList;

public class deck {


	
	public static ArrayList<ArrayDeque<Carta>> createdeck() {
		ArrayDeque <Carta> deck= new ArrayDeque <Carta>();
		ArrayDeque <Carta> deck2= new ArrayDeque <Carta>();
		ArrayDeque <Carta> referencedeck= new ArrayDeque <Carta>();
		
		Cartas c = new Cartas();
		deck=(c.newcard());
		System.out.println(deck);
		deck2=(c.newcard());
		System.out.println(deck2);
		referencedeck=(c.newcard());
		
		ArrayList<ArrayDeque <Carta>> clist = new ArrayList<>();
		
		clist.add(deck);
		clist.add(deck2);
		clist.add(referencedeck);
		
		return clist;
		
		
	}
	
	
}
