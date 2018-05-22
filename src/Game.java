import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
		

			/**
			 * @author: Daniel Suñe (aka "Tilo")
		     * @Version: 0.01
			 * Joc de cartes amb 30 cartes per deck, 2 jugadors amb 30 vides, el primer en arribar a 0 vides perd.
			 */

public class Game {
	static Taulell t = new Taulell();
    static Finestra f = new Finestra(t);
    static tablero l = new tablero();
    static ArrayDeque <Carta> deck1= new ArrayDeque <Carta>();
	static ArrayDeque <Carta> deck2= new ArrayDeque <Carta>();
	static ArrayList <Carta> hand= new ArrayList <Carta>();
	static ArrayList <Carta> hand2= new ArrayList <Carta>();
	static ArrayList<Carta> biblioteca = new ArrayList<Carta>();
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
	static boolean mundo= true; //True estoy en el mundo, false estoy en batalla
	static Random rand = new Random();
	public static void main(String[] args) {
		tablero.inicialitzarGUI();
		construcction();
		 
		//play();
		//tablero.draworld();
		//movement();
	}
	
	/*private static void movement() {
		
		System.out.println("Saludos");
		//Moviment amb wasd, z per seleccionar, x per enrere, ? per menu(?)
		//TODO
		int x=3,y=3; //Posicion inicial del pj
		boolean battle=false;
		char opt = f.getActualChar();
		while(!battle) {
			System.out.println(opt);
			tablero.draworld();
			switch(opt) {
				case 'w':
					tablero.world[x][y]=0;
						x+=1;
					break;
				case 's':
						tablero.world[x][y]=0;
						x-=1;
					break;
				case 'a': 
						tablero.world[x][y]=0;
						y+=1;
					break;
				case 'd':
						tablero.world[x][y]=0;
						y-=1;
					break;
				case 'z':
						if(tablero.world[x][y]==8) {
							battle=true;
							play();
						}
					break;
				case 'x':
					break;
				case '?':
					break;
			}
			tablero.world[x][y]=7;
		}
	}*/
	
	
	public static void construcction() {
		//Deck1
		
		Carta Caterpie = new Carta(50, 20, "Placaje", 0,"","Caterpie", 3,true, "Metapod", 0, ""); 
		biblioteca.add(Caterpie);
		deckfuego.add(Caterpie);
		deckfuego.add(Caterpie);
		Carta Metapod = new Carta(80, 30, "Picadura", 0,"","Metapod", 3,false, "", 1, "Caterpie"); 
		biblioteca.add(Metapod);
		deckfuego.add(Metapod);
		Carta NidoranF = new Carta(50, 40, "Doble patada", 0,"","NidoranF", 3,false, "", 0, ""); 
		biblioteca.add(NidoranF); 
		deckfuego.add(NidoranF);
		deckfuego.add(NidoranF);
		Carta NidoranM = new Carta(50, 40, "Cornada", 0,"","NidoranM", 3,false, "", 0, ""); 
		biblioteca.add(NidoranM);
		deckfuego.add(NidoranM);
		Carta Pinsir = new Carta(80, 50, "Guillotinazo",0,"","Pinsir",3,false,"",0,"");
		biblioteca.add(Pinsir);
		deckfuego.add(Pinsir);
		Carta Charmander = new Carta(60, 10, "Arañazo", 30, "Ascuas", "Charmander", 7, true, "Charmaleon",0,"");
    	biblioteca.add(Charmander);
    	deckfuego.add(Charmander);
    	deckfuego.add(Charmander);
    	Carta Charmeleon = new Carta(90, 30, "Cuchillada", 70, "Lanzallamas", "Charmeleon", 7, true, "Charizard",1,"Charmander");
    	biblioteca.add(Charmeleon);
    	deckfuego.add(Charmeleon);
    	Carta Charizard= new Carta(120, 60, "Ataque ala",120, "Llamarada", "Charizard", 7, false, "",1,"Charmeleon");
    	biblioteca.add(Charizard);
    	deckfuego.add(Charizard);
		Carta Growlithe = new Carta(60, 10, "Mordisco", 0, "", "Growlithe", 68, true, "Arcanine",0, "");//2
		biblioteca.add(Growlithe);
		deckfuego.add(Growlithe);
		deckfuego.add(Growlithe);
		Carta Arcanine = new Carta(90, 20, "Ascuas", 70, "Envite igneo", "Arcanine", 7,false, "",1,"Growlithe");
    	biblioteca.add(Arcanine);
    	deckfuego.add(Arcanine);
    	Carta Ponyta = new Carta(60, 20, "Placaje", 40, "Pisoton", "Ponyta", 7,false, "",0,"");
    	biblioteca.add(Ponyta);
    	deckfuego.add(Ponyta);
    	deckfuego.add(Ponyta);
    	Carta Magmar=new Carta(80, 30, "Puño fuego", 70,"Lanzallamas", "Magmar",7, false, "",0,"");
    	biblioteca.add(Magmar);
    	deckfuego.add(Magmar);
    	Carta Rattata = new Carta(30, 40, "Mordisco", 20, "Placaje", "Rattata",  7, true, "Raticate",0,"");
    	biblioteca.add(Rattata);
    	deckfuego.add(Rattata);
    	deckfuego.add(Rattata);
    	Carta Raticate = new Carta(70, 20, "Ataque rapido", 60, "Hipercolmillo","Raticate", 7, false, "", 1, "Rattata");
    	biblioteca.add(Raticate);
    	deckfuego.add(Raticate);
    	Carta Meowth = new Carta(60, 30, "Ataques furia", 0, "", "Meowth", 7, false, "", 0,"");
    	biblioteca.add(Meowth);
    	deckfuego.add(Meowth);
    	Carta Seel=new Carta(50, 10, "Destructor", 30,"Rayo aurora", "Seel",7, true, "Dewgong",0,"");
    	biblioteca.add(Seel);
    	deckfuego.add(Seel);
    	deckfuego.add(Seel);
    	Carta Dewgong= new Carta(120, 40, "Carambanazo", 70, "Rayo hielo","Dewgong",7,false,"",1,"Seel");
    	biblioteca.add(Dewgong);
    	deckfuego.add(Dewgong);
    	Carta Goldeen= new Carta(50, 20, "Pistola Agua", 0, "","Goldeen",7,true,"Seaking",0,"");
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
    	Carta Squirtle = new Carta(60, 10, "Mordisco", 30, "Cabezazo", "Squirtle", 7, true, "Wartortle", 0, "");//(2)
    	biblioteca.add(Squirtle);
    	deckagua.add(Squirtle);
    	Carta Wartortle = new Carta(80, 40, "Doblebofeton", 30, "Lanzarocas", "Wartortle", 7,true, "Blastoise",1,"Squirtle");
    	biblioteca.add(Wartortle);
    	deckagua.add(Wartortle);
    	Carta Blastoise = new Carta(120, 30, "Giro rapido", 100, "Hidrobomba", "Blastiose", 7, false, "",1,"Wartortle");
    	biblioteca.add(Blastoise);
    	deckagua.add(Blastoise);
    	deckagua.add(Seel);
    	deckagua.add(Seel);
    	deckagua.add(Dewgong);
    	deckagua.add(Goldeen);
    	deckagua.add(Seaking);
    	Carta Staryu = new Carta(50, 30, "Giro rapido", 20, "Placaje", "Staryu", 7, true, "Starmie",0,"");
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
    	Carta Magnemite = new Carta (60, 20, "Placaje", 0,"", "Magnemite", 7, true, "Magneton", 0,"");
    	biblioteca.add(Magnemite);
    	deckagua.add(Magnemite);
    	Carta Magneton = new Carta (80, 30, "Onda sonica", 70, "Electrobola", "Magneton", 7, false, "", 1, "Magnemite");
    	biblioteca.add(Magneton);
    	deckagua.add(Magneton);
    	Carta Electabuzz = new Carta (80, 20, "Ataque rapido", 70, "Rayo", "Electabuzz", 7, false, "", 0, "");
    	biblioteca.add(Electabuzz);
    	deckagua.add(Electabuzz);
    	deckagua.add(Rattata);
    	deckagua.add(Rattata);
    	deckagua.add(Raticate);
    	deckagua.add(Meowth);
    	
    	
    	//Deck3
    	Carta Bulbasaur = new Carta (60, 20, "Placaje", 30, "Hoja afilada", "Bulbasaur", 7, true, "Ivysaur", 0,"");
    	biblioteca.add(Bulbasaur);
    	deckplanta.add(Bulbasaur);
    	deckplanta.add(Bulbasaur);
    	Carta Ivysaur = new Carta (100, 30, "Hoja afilada", 50, "Latigo Cepa", "Ivysaur",7,true, "Venusaur",1,"Bulbasaur");
    	biblioteca.add(Ivysaur);
    	deckplanta.add(Ivysaur);
    	Carta Venusaur = new Carta (120, 80, "Planta Feroz", 70, "Rayo Solar", "Venusaur",7, false,"",1,"Ivysaur");
    	biblioteca.add(Venusaur);
    	deckplanta.add(Venusaur);
    	deckplanta.add(NidoranF);
    	deckplanta.add(NidoranF);
    	deckplanta.add(NidoranM);
    	deckplanta.add(NidoranM);
    	Carta Nidorino = new Carta (80, 40, "Cornada", 80, "Bomba Lodo","Nidorino",7,true, "Nidoking", 1, "NidoranM");
    	biblioteca.add(Nidorino);
    	deckplanta.add(Nidorino);
    	Carta Tangela = new Carta (80, 50, "Latigo Cepa", 0,"","Tangela",7, false,"",0,"");
    	biblioteca.add(Tangela);
    	deckplanta.add(Tangela);
    	Carta Abra = new Carta (50, 20, "Placaje", 0, "", "Abra",7, true, "Kadabra", 0, "");
    	biblioteca.add(Abra);
    	deckplanta.add(Abra);
    	deckplanta.add(Abra);
    	Carta Kadabra = new Carta(80, 50, "Psiquico", 0, "", "Kadabra", 7 , false, "", 1, "Abra");
    	biblioteca.add(Kadabra);
    	deckplanta.add(Kadabra);
    	Carta Gastly = new Carta(50, 20, "Placaje", 0, "", "Gastly", 7, true, "Haunter", 0, "");
    	biblioteca.add(Gastly);
    	deckplanta.add(Gastly);
    	Carta Haunter = new Carta (90, 70, "Psicorayo", 0, "","Haunter",7, true, "Gengar", 1, "Gastly");
    	biblioteca.add(Haunter);
    	deckplanta.add(Haunter);
    	Carta Jynx = new Carta (80, 30, "Puño hielo", 70, "Rayo hielo", "Jynx", 7, false, "",0,"");
    	biblioteca.add(Jynx);
    	deckplanta.add(Jynx);
    	Carta Jigglypuff= new Carta (60, 40, "Doble bofeton", 0, "", "Jigglypuff", 7, true, "",0,"");
    	biblioteca.add(Jigglypuff);
    	deckplanta.add(Jigglypuff);
    	Carta Kangaskhan = new Carta(80, 50, "Cabezazo", 100, "Megapuño", "Kangaskhan",7,false,"",0,"");
    	biblioteca.add(Kangaskhan);
    	deckplanta.add(Kangaskhan);
    	deckplanta.add(Pikachu);
    	deckplanta.add(Pikachu);
    	deckplanta.add(Magnemite);
    	deckplanta.add(Electabuzz);
    	Carta Raichu = new Carta (100, 70, "Rayo", 20, "Ataque rapido", "Raichu", 7, false, "", 1, "Pikachu");
    	deckplanta.add(Raichu);
    	biblioteca.add(Raichu);
    	deckplanta.add(Meowth);
    }

	private static void play() {
		pregame();
		System.out.println("Robando cartas...");
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
		tablero.drawhand();
		draw();
		getprices();
		deck1=barajar(deck1);
		deck2=barajar(deck2);
		System.out.println("Elige una carta para poner en juego");
		int op= sc.nextInt();
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
			System.out.println(deck1);
		}
		System.out.println(hand);
		for(int i=0;i<7;i++) {
			hand2.add(deck2.getFirst());
			deck2.pop();
		}
		System.out.println(hand2);
	}
	
	private static void getprices() {
		System.out.println("Colocando premios...");
		for(int i=0; i<1;i++) {
			premios1.add(deck1.getFirst());
			premios2.add(deck2.getFirst());
			deck1.pop();
			deck2.pop();
			System.out.println(deck1);
		}
	}
	
	private static void player2pre() {
		System.out.println("Elige una carta para poner en juego");
		int op= sc.nextInt();
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
			System.out.println("entradp");
			if(deck1.isEmpty()==true) {
				System.out.println("empty");
				draw=true;
				comprovarvictoria();
			}
			else{
				hand.add(deck1.getFirst());
				deck1.pop();
				System.out.println("efectivamente entro aqui una vez"+deck1);
				draw=true;
			}
		}
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
			System.out.println("entra");
			if(deck2.isEmpty()==true) {
				comprovarvictoria();
			}
			else{
				hand.add(deck2.getFirst());
				deck2.pop();	
				draw=true;
			}
		}
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
		System.out.println(cartadef.vida);
		
		if(cartaatack.vida<=0) {
			defeatedcard();
		}
		
		}
	
	private static void defeatedcard() {
		System.out.println(cartaatack.nombre+" derrotado, elige un premio(del 1 al 6): ");
		int op = sc.nextInt();
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
}
