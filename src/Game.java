import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
		

			/**
			 * @author: Daniel Suñe (aka "Tilo")
		     * @Version: 0.01
			 * Joc de cartes amb 30 cartes per deck, 2 jugadors amb 30 vides, el primer en arribar a 0 vides perd.
			 */

public class Game implements Serializable{
    static ArrayDeque <Carta> deck1= new ArrayDeque <Carta>();
	static ArrayDeque <Carta> deck2= new ArrayDeque <Carta>();
	static ArrayList <Carta> hand= new ArrayList <Carta>();
	static ArrayList <Carta> hand2= new ArrayList <Carta>();
	static ArrayList<Carta> biblioteca = new ArrayList<Carta>();
	static ArrayList<Carta> bibliotecaplayer = new ArrayList<Carta>();
	static ArrayList <Carta> premios1= new ArrayList <Carta>();
	static ArrayList <Carta> premios2= new ArrayList <Carta>();
	static ArrayDeque <Carta> deckfuego = new ArrayDeque <Carta>();
	static ArrayDeque <Carta> deckagua = new ArrayDeque <Carta>();
	static ArrayDeque <Carta> deckplanta = new ArrayDeque <Carta>();
	static Scanner sc = new Scanner (System.in);
	static Carta cartaatack;
	static ArrayList <Carta> bancoplayer = new ArrayList <Carta>();
	static Carta cartadef;
	static ArrayList <Carta> bancoia = new ArrayList <Carta>();
	static int turno=0;
	static File file = new File ("estado");
	static Random rand = new Random();
	public static void main(String[] args) {
			construcction();
			selectpreset();
			selectpreset2();
			Loadbiblio();		 
			play();
	}
	
	private static void selectpreset() {
		System.out.println("entro");
		System.out.println("Porfavor elige un mazo para empezar: ");
		System.out.println("1-Deck de fuego");
		System.out.println("2-Deck de agua");
		System.out.println("3-Deck de planta");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			deck1=deckfuego;
			break;
		case 2:
			deck1=deckagua;
			break;
		case 3:
			deck1=deckplanta;
			break;
		}
		bibliotecaplayer.addAll(deck1);
		WriteBiblio();
	}
	private static void selectpreset2() {
		System.out.println("Porfavor elige un mazo para empezar: ");
		System.out.println("1-Deck de fuego");
		System.out.println("2-Deck de agua");
		System.out.println("3-Deck de planta");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			deck2=deckfuego;
			break;
		case 2:
			deck2=deckagua;
			break;
		case 3:
			deck2=deckplanta;
			break;
		}
	}

	public static void construcction() {
		//Ataques
		Ataque Null = new Ataque(0,"");
		Ataque Arañazo= new Ataque (10, "Arañazo");
		Ataque Ascuas= new Ataque (30, "Ascuas");
		Ataque AtaqueAla= new Ataque (60, "Ataque Ala");
		Ataque AtaqueRapido= new Ataque (20, "Ataque rapido");
		Ataque Cornada = new Ataque (40, "Cornada");
		Ataque Cuchillada= new Ataque (30, "Cuchillada");
		Ataque DoblePatada = new Ataque (40, "Doble patada");
		Ataque EnviteIgneo= new Ataque (70, "Envite Igneo");
		Ataque Guillotinazo= new Ataque (50, "Guillotinazo");
		Ataque HiperColmillo= new Ataque (60, "Hipercolmillo");
		Ataque Lanzallamas= new Ataque (70, "Lanzallamas");
		Ataque Llamarada= new Ataque (120, "Llamarada");
		Ataque Mordisco= new Ataque (10, "Mordisco");
		Ataque Placaje = new Ataque(20, "Placaje");
		Ataque Picadura = new Ataque(30, "Picadura");		
		Ataque Pisoton= new Ataque (40, "Pisoton");
		Ataque PuñoFuego= new Ataque (30, "Puño Fuego");
		Ataque Psiquico = new Ataque (50, "Psiquico");
		Ataque Psicorrayo = new Ataque(30, "Psicorrayo");
		Ataque Torbellino = new Ataque(80,"Torbellino");
		//Biblioteca normal
		Carta Mew= new Carta(50,Psiquico.atk,Psiquico.name,Null.atk,Null.name,"Mew", 151, false, "",0,"");
		Carta Butterfree=new Carta(70, Psicorrayo.atk, Psicorrayo.name, Torbellino.atk,Torbellino.name,"Butterfree",12 ,false,"",1, "Metapod");
		//Carta Weedle = new Carta(40,)
		//Deck1
		Carta Caterpie = new Carta(40, Placaje.atk, Placaje.name,Null.atk,Null.name, "Caterpie", 10,true, "Metapod", 0, ""); 
		biblioteca.add(Caterpie);
		deckfuego.add(Caterpie);
		deckfuego.add(Caterpie);
		Carta Metapod = new Carta(70, Picadura.atk, Picadura.name, Null.atk,Null.name,"Metapod", 11,false, "", 1, "Caterpie"); 
		biblioteca.add(Metapod);
		deckfuego.add(Metapod);
		Carta NidoranF = new Carta(50, DoblePatada.atk, DoblePatada.name, Null.atk,Null.name,"NidoranF", 3,false, "", 0, ""); 
		biblioteca.add(NidoranF); 
		deckfuego.add(NidoranF);
		deckfuego.add(NidoranF);
		Carta NidoranM = new Carta(50, Cornada.atk, Cornada.name, Null.atk,Null.name,"NidoranM", 3,false, "", 0, ""); 
		biblioteca.add(NidoranM);
		deckfuego.add(NidoranM);
		Carta Pinsir = new Carta(80, Guillotinazo.atk, Guillotinazo.name, Null.atk, Null.name,"Pinsir",3,false,"",0,"");
		biblioteca.add(Pinsir);
		deckfuego.add(Pinsir);
		Carta Charmander = new Carta(50, Arañazo.atk, Arañazo.name, Ascuas.atk, Ascuas.name, "Charmander", 4, true, "Charmaleon",0,"");
    	biblioteca.add(Charmander);
    	deckfuego.add(Charmander);
    	deckfuego.add(Charmander);
    	Carta Charmeleon = new Carta(80, Cuchillada.atk, Cuchillada.name, Lanzallamas.atk, Lanzallamas.name, "Charmeleon", 5, true, "Charizard",1,"Charmander");
    	biblioteca.add(Charmeleon);
    	deckfuego.add(Charmeleon);
    	Carta Charizard= new Carta(120, AtaqueAla.atk, AtaqueAla.name, Llamarada.atk, Llamarada.name, "Charizard", 6, false, "",1,"Charmeleon");
    	biblioteca.add(Charizard);
    	deckfuego.add(Charizard);
		Carta Growlithe = new Carta(60, Mordisco.atk, Mordisco.name, Null.atk, Null.name, "Growlithe", 68, true, "Arcanine",0, "");//2
		biblioteca.add(Growlithe);
		deckfuego.add(Growlithe);
		deckfuego.add(Growlithe);
		Carta Arcanine = new Carta(90, Ascuas.atk, Ascuas.name, EnviteIgneo.atk, EnviteIgneo.name, "Arcanine", 7,false, "",1,"Growlithe");
    	biblioteca.add(Arcanine);
    	deckfuego.add(Arcanine);
    	Carta Ponyta = new Carta(60, Placaje.atk, Placaje.name, Pisoton.atk, Pisoton.name, "Ponyta", 7,false, "",0,"");
    	biblioteca.add(Ponyta);
    	deckfuego.add(Ponyta);
    	deckfuego.add(Ponyta);
    	Carta Magmar=new Carta(80, PuñoFuego.atk, PuñoFuego.name, Lanzallamas.atk,Lanzallamas.name, "Magmar",7, false, "",0,"");
    	biblioteca.add(Magmar);
    	deckfuego.add(Magmar);
    	Carta Rattata = new Carta(30, Mordisco.atk, Mordisco.name, Placaje.atk, Placaje.name, "Rattata",  7, true, "Raticate",0,"");
    	biblioteca.add(Rattata);
    	deckfuego.add(Rattata);
    	deckfuego.add(Rattata);
    	Carta Raticate = new Carta(70, AtaqueRapido.atk, AtaqueRapido.name, HiperColmillo.atk, HiperColmillo.name,"Raticate", 7, false, "", 1, "Rattata");
    	biblioteca.add(Raticate);
    	deckfuego.add(Raticate);
    	Carta Meowth = new Carta(60, 30, "Ataques furia", Null.atk, Null.name, "Meowth", 7, false, "", 0,"");
    	biblioteca.add(Meowth);
    	deckfuego.add(Meowth);
    	Carta Seel=new Carta(50, 10, "Destructor", 30,"Rayo aurora", "Seel",7, true, "Dewgong",0,"");
    	biblioteca.add(Seel);
    	deckfuego.add(Seel);
    	deckfuego.add(Seel);
    	Carta Dewgong= new Carta(120, 40, "Carambanazo", 70, "Rayo hielo","Dewgong",7,false,"",1,"Seel");
    	biblioteca.add(Dewgong);
    	deckfuego.add(Dewgong);
    	Carta Goldeen= new Carta(50, 20, "Pistola Agua", Null.atk, Null.name,"Goldeen",7,true,"Seaking",0,"");
    	biblioteca.add(Goldeen);
    	deckfuego.add(Goldeen);
    	deckfuego.add(Goldeen);
    	Carta Seaking= new Carta(90, 70, "Cascada", 50, "Pico taladro","Seaking",7,false,"",1,"Goldeen");
    	biblioteca.add(Seaking);
    	deckfuego.add(Seaking);
    	
    	//Deck2
    	deckagua.add(Charmander);
    	deckagua.add(Charmander);
    	deckagua.add(Charmeleon);
    	deckagua.add(Growlithe);
    	deckagua.add(Arcanine);
    	deckagua.add(Magmar);
    	Carta Squirtle = new Carta(40, Mordisco.atk, Mordisco.name, 30, "Cabezazo", "Squirtle", 7, true, "Wartortle", 0, "");//(2)
    	biblioteca.add(Squirtle);
    	deckagua.add(Squirtle);
    	Carta Wartortle = new Carta(70, 40, "Doblebofeton", 30, "Lanzarocas", "Wartortle", 8,true, "Blastoise",1,"Squirtle");
    	biblioteca.add(Wartortle);
    	deckagua.add(Wartortle);
    	Carta Blastoise = new Carta(100, 30, "Giro rapido", 100, "Hidrobomba", "Blastiose", 9, false, "",1,"Wartortle");
    	biblioteca.add(Blastoise);
    	deckagua.add(Blastoise);
    	deckagua.add(Seel);
    	deckagua.add(Seel);
    	deckagua.add(Dewgong);
    	deckagua.add(Goldeen);
    	deckagua.add(Seaking);
    	Carta Staryu = new Carta(50, 30, "Giro rapido", Placaje.atk, Placaje.name, "Staryu", 7, true, "Starmie",0,"");
    	biblioteca.add(Staryu);    	
    	deckagua.add(Staryu);
    	Carta Starmie = new Carta(70, 50, "Surf", 70, "Rapidez", "Starmie", 7, false, "",1,"Starmie");
    	biblioteca.add(Starmie);
    	deckagua.add(Starmie);
    	//Electabuzz
    	Carta Lapras = new Carta(90, 70, "Rayo hielo", 50, "Surf", "Lapras", 7, false, "",0,"" );
    	biblioteca.add(Lapras);
    	deckagua.add(Lapras);
    	deckagua.add(Lapras);
    	Carta Pikachu = new Carta(80, 10, "Portazo", 30, "Moflete estatico", "Pikachu", 7, true, "Raichu", 0, "");
    	biblioteca.add(Pikachu);
    	deckagua.add(Pikachu);
    	deckagua.add(Pikachu);
    	Carta Magnemite = new Carta (60, Placaje.atk, Placaje.name, Null.atk, Null.name, "Magnemite", 7, true, "Magneton", 0,"");
    	biblioteca.add(Magnemite);
    	deckagua.add(Magnemite);
    	Carta Magneton = new Carta (80, 30, "Onda sonica", 70, "Electrobola", "Magneton", 7, false, "", 1, "Magnemite");
    	biblioteca.add(Magneton);
    	deckagua.add(Magneton);
    	Carta Electabuzz = new Carta (80, AtaqueRapido.atk, AtaqueRapido.name, 70, "Rayo", "Electabuzz", 7, false, "", 0, "");
    	biblioteca.add(Electabuzz);
    	deckagua.add(Electabuzz);
    	deckagua.add(Rattata);
    	deckagua.add(Rattata);
    	deckagua.add(Raticate);
    	deckagua.add(Meowth);
    	
    	
    	//Deck3
    	Carta Bulbasaur = new Carta (40, Placaje.atk, Placaje.name, 30, "Hoja afilada", "Bulbasaur", 1, true, "Ivysaur", 0,"");
    	biblioteca.add(Bulbasaur);
    	deckplanta.add(Bulbasaur);
    	deckplanta.add(Bulbasaur);
    	Carta Ivysaur = new Carta (60, 30, "Hoja afilada", 50, "Latigo Cepa", "Ivysaur",2,true, "Venusaur",1,"Bulbasaur");
    	biblioteca.add(Ivysaur);
    	deckplanta.add(Ivysaur);
    	Carta Venusaur = new Carta (100, 80, "Planta Feroz", 70, "Rayo Solar", "Venusaur",3, false,"",1,"Ivysaur");
    	biblioteca.add(Venusaur);
    	deckplanta.add(Venusaur);
    	deckplanta.add(NidoranF);
    	deckplanta.add(NidoranF);
    	deckplanta.add(NidoranM);
    	deckplanta.add(NidoranM);
    	Carta Nidorino = new Carta (80, 40, "Cornada", 80, "Bomba Lodo","Nidorino",7,true, "Nidoking", 1, "NidoranM");
    	biblioteca.add(Nidorino);
    	deckplanta.add(Nidorino);
    	Carta Tangela = new Carta (80, 50, "Latigo Cepa", Null.atk, Null.name,"Tangela",7, false,"",0,"");
    	biblioteca.add(Tangela);
    	deckplanta.add(Tangela);
    	Carta Abra = new Carta (50, Placaje.atk, Placaje.name, Null.atk, Null.name, "Abra",7, true, "Kadabra", 0, "");
    	biblioteca.add(Abra);
    	deckplanta.add(Abra);
    	deckplanta.add(Abra);
    	Carta Kadabra = new Carta(80, 50, "Psiquico", Null.atk, Null.name, "Kadabra", 7 , false, "", 1, "Abra");
    	biblioteca.add(Kadabra);
    	deckplanta.add(Kadabra);
    	Carta Gastly = new Carta(50, Placaje.atk, Placaje.name, Null.atk, Null.name, "Gastly", 7, true, "Haunter", 0, "");
    	biblioteca.add(Gastly);
    	deckplanta.add(Gastly);
    	Carta Haunter = new Carta (90, 70, "Psicorayo", Null.atk, Null.name,"Haunter",7, true, "Gengar", 1, "Gastly");
    	biblioteca.add(Haunter);
    	deckplanta.add(Haunter);
    	Carta Jynx = new Carta (80, 30, "Puño hielo", 70, "Rayo hielo", "Jynx", 7, false, "",0,"");
    	biblioteca.add(Jynx);
    	deckplanta.add(Jynx);
    	Carta Jigglypuff= new Carta (60, 40, "Doble bofeton", Null.atk, Null.name, "Jigglypuff", 7, true, "",0,"");
    	biblioteca.add(Jigglypuff);
    	deckplanta.add(Jigglypuff);
    	Carta Kangaskhan = new Carta(80, 50, "Cabezazo", 100, "Megapuño", "Kangaskhan",7,false,"",0,"");
    	biblioteca.add(Kangaskhan);
    	deckplanta.add(Kangaskhan);
    	deckplanta.add(Pikachu);
    	deckplanta.add(Pikachu);
    	deckplanta.add(Magnemite);
    	deckplanta.add(Electabuzz);
    	Carta Raichu = new Carta (100, 70, "Rayo", AtaqueRapido.atk, AtaqueRapido.name, "Raichu", 7, false, "", 1, "Pikachu");
    	deckplanta.add(Raichu);
    	biblioteca.add(Raichu);
    	deckplanta.add(Meowth);
    }

	private static void play() {
		pregame();
		System.out.println("Robando cartas...");
		System.out.println("entro");
		int victoria = 0;
		while (victoria==0) {
		playp1();
		victoria=comprovarvictoria();
		if(victoria==0) {
		playp2();}
		}
		endgame(victoria);
	}
	
	private static void pregame() {
		draw();
		getprices();
		deck1=barajar(deck1);
		deck2=barajar(deck2);
		System.out.println("Elige una carta para poner en juego");
		int op= sc.nextInt();
		if(op==10) {
			Savestate();
			op= sc.nextInt();
		}
		else if (op==11) {
			Loadstate();
			op= sc.nextInt();
		}
		cartaatack=hand.get(op);
		System.out.println(cartaatack.nombre);
		System.out.println("Elige hasta 5 cartas para poner en el banco (0 para ninguna)");
		for(int i=0; i<5;i++) {
			op=sc.nextInt();
			if(op==0) {}
			else {
			Carta cartabanco = hand.get(op);
			bancoplayer.add(cartabanco);}
		}
		player2pre();
	}

	private static ArrayDeque<Carta> barajar(ArrayDeque<Carta> ad) {
		ArrayList<Carta> as = new ArrayList<>();
		ArrayList<Carta> as2 = new ArrayList<>();
		as.addAll(ad);
		as2.addAll(ad);
		for(int i=0;i<as2.size();i++) {
			as.remove(as2.get(i));
			as.add(rand.nextInt(ad.size()),as2.get(i));
			
		}
		
		ad.clear();
		ad.addAll(as);
		
		return ad;
		
	}
	
	private static void draw() {
		for(int i=0;i<4;i++) {
			hand.add(deck1.getFirst());
			deck1.pop();
		}
		System.out.println(hand);
		for(int i=0;i<7;i++) {
			hand2.add(deck2.getFirst());
			deck2.pop();
		}
	}
	
	private static void getprices() {
		System.out.println("Colocando premios...");
		for(int i=0; i<1;i++) {
			premios1.add(deck1.getFirst());
			premios2.add(deck2.getFirst());
			deck1.pop();
			deck2.pop();
		}
	}
	
	private static void player2pre() {
		System.out.println("Elige una carta para poner en juego");
		int op= sc.nextInt();
		if(op==10) {
			Savestate();
			op= sc.nextInt();
		}
		else if (op==11) {
			Loadstate();
			op= sc.nextInt();
		}
		cartadef=hand2.get(op);
		System.out.println(cartadef.nombre);
		System.out.println("Elige hasta 5 cartas para poner en el banco (0 para ninguna)");
		for(int i=0; i<5;i++) {
			op=sc.nextInt();
			if(op==0) {}
			else {
			Carta cartabanco = hand2.get(op);
			bancoia.add(cartabanco);}
		}
		
		
	}
	
	private static void playp1() {
		turno=0;
		drawp1();
		battle1();
	}
	
	private static void drawp1 () {	
		System.out.println("Robando cartas...");

		boolean draw = false;
		while(!draw) {
			if(deck1.isEmpty()==true) {
				draw=true;
				comprovarvictoria();
			}
			else{
				hand.add(deck1.getFirst());
				deck1.pop();
				draw=true;
			}
		}
		System.out.println(hand);
	}
	 
	private static void playp2() {
		turno=1;
		drawp2();
		battle2();
	}
	
	private static void drawp2 () {
		System.out.println("Robando cartas...");
		boolean draw = false;
		while(!draw) {
			if(deck2.isEmpty()==true) {
				comprovarvictoria();
			}
			else{
				hand.add(deck2.getFirst());
				deck2.pop();	
				draw=true;
			}
		}
		System.out.println(hand2);
	}
	
	private static void battle1 () {
		System.out.println(cartaatack.atak1+ " "+ cartaatack.ataque1);
		if(!cartaatack.atak2.isEmpty()) System.out.println(cartaatack.atak2+ " "+ cartaatack.ataque2);
		System.out.println("Selecciona un ataque: ");
		int selectattack=0;
		int op= sc.nextInt();
		switch(op) {
			case 1:
				selectattack=cartaatack.ataque1;
			break;
			case 2:
				selectattack=cartaatack.ataque2;
			break;
		}
		
		cartadef.vida-=selectattack;
		System.out.println(cartadef.vida);
		
		if(cartadef.vida<=0) {
			defeatediacard();
		}
		
		}
	
	private static void defeatediacard() {
		System.out.println(cartadef.nombre+" derrotado, elige un premio(del 1 al 6): ");
		int op = sc.nextInt();
		if(op==10) {
			Savestate();
		}
		else if (op==11) {
			Loadstate();
		}
		if(premios1.isEmpty()) {
			comprovarvictoria();
		}
		else hand.add(premios1.get(op));
	}
	
	private static void battle2() {
		System.out.println(cartadef.atak1+ " "+ cartadef.ataque1);
		System.out.println(cartadef.atak2+ " "+ cartadef.ataque2);
		System.out.println("Selecciona un ataque: ");
		int selectattack=0;
		int op= sc.nextInt();
		switch(op) {
			case 1:
				selectattack=cartadef.ataque1;
			break;
			case 2:
				selectattack=cartadef.ataque2;
			break;
		}
		
		cartaatack.vida-=selectattack;
		System.out.println(cartadef.nombre+" "+cartadef.vida);
		
		if(cartaatack.vida<=0) {
			defeatedcard();
		}
		
		}
	
	private static void defeatedcard() {
		System.out.println(cartaatack.nombre+" derrotado, elige un premio(del 1 al 6): ");
		int op = sc.nextInt();
		if(op==10) {
			Savestate();
		}
		else if (op==11) {
			Loadstate();
		}
		if(premios1.isEmpty()) {
			comprovarvictoria();
		}
		else {
			hand2.add(premios2.get(op));
			if(bancoplayer.isEmpty()) {
				comprovarvictoria();
			}
			else {
				System.out.println("Selecciona una carta del banco para poner en juego");
				int ope=sc.nextInt();
				cartadef=bancoplayer.get(ope);
				bancoplayer.remove(ope);
			}
		}		 
	}
	
	private static int comprovarvictoria() {
		if((turno==0 && premios2.isEmpty())||(turno==1 && deck2.isEmpty()) || (turno==1 && bancoia.isEmpty())){
			return 1;
		}
		else if ((turno==1 && premios1.isEmpty())||(turno==0 && deck1.isEmpty())||(turno==0 && bancoplayer.isEmpty())) {
			return 2;
		}
		else return 0;
	}
	
	private static void endgame(Integer victoria){
		if(victoria==1) {
			System.out.println("Gana el jugador 1");
		}
		else {
			System.out.println("Gana el jugador 2");
		}
	}

	public static ArrayList<Carta> sobres() {
		ArrayList<Carta> sobre = new ArrayList<>();
		for(int i=0;i<6;i++) {
			int x = (int) (Math.random()*biblioteca.size()+1);
			System.out.println(x);
			sobre.add(biblioteca.get(x));
		}
		return sobre;
	}
	
	private static void Savestate() {
		try {

			File f = new File("estado");
			FileOutputStream fol = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fol);
			
			oos.writeObject(deck1);
			oos.writeObject(hand);
			oos.writeObject(cartaatack);
			oos.writeObject(bancoplayer);
			oos.writeObject(premios1);
			oos.writeObject(deck2);
			oos.writeObject(hand2);
			oos.writeObject(cartadef);
			oos.writeObject(bancoia);
			oos.writeObject(premios2);
			oos.flush(); // opcional
			oos.close();
			System.out.println("Partida guardada");
			System.out.println("Elige una carta para poner en juego");
		} catch (Exception pasanCosas) {
			pasanCosas.printStackTrace();
		}
	}
	
	private static void Loadstate() {
		try {

			FileInputStream fis = new FileInputStream("estado");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Object o=ois.readObject();
			deck1=(ArrayDeque<Carta>) o;
			o=ois.readObject();
			hand= (ArrayList<Carta>) o;
			o=ois.readObject();
			cartaatack = (Carta) o;
			o=ois.readObject();
			bancoplayer= (ArrayList<Carta>) o;
			o=ois.readObject();
			premios1= (ArrayList<Carta>) o;
			o=ois.readObject();
			deck2= (ArrayDeque<Carta>) o;
			o=ois.readObject();
			hand2= (ArrayList<Carta>) o;
			o=ois.readObject();
			cartadef= (Carta) o;
			o=ois.readObject();
			bancoia= (ArrayList<Carta>) o;
			o=ois.readObject();
			premios2= (ArrayList<Carta>) o;
			System.out.println("Partida cargada");
			System.out.println("Elige una carta para poner en juego");
		} catch (Exception pasanCosas) {
			pasanCosas.printStackTrace();
		}

	}
	
	private static void WriteBiblio() {
		try {
			File f = new File("bibliotecaplayer");
			FileOutputStream fol = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fol);
			oos.writeObject(bibliotecaplayer);
			oos.flush(); // opcional
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void Loadbiblio() {
		try {
			FileInputStream fis = new FileInputStream("bibliotecaplayer");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object o=ois.readObject();
			bibliotecaplayer=(ArrayList<Carta>) o;
			for(int i=0;i<bibliotecaplayer.size();i++) {
				System.out.println(bibliotecaplayer.get(i).nombre);
			}
			
		} catch (Exception pasanCosas) {
			pasanCosas.printStackTrace();
		}
		
	}
}

