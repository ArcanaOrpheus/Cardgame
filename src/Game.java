import java.util.ArrayDeque;
import java.util.ArrayList;
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
    static players p = new players();
    static ArrayDeque <Carta> deck1= new ArrayDeque <Carta>();
	static ArrayDeque <Carta> deck2= new ArrayDeque <Carta>();
	static ArrayDeque <Carta> biblioteca = new ArrayDeque<Carta>();
	static Scanner sc = new Scanner (System.in);
	static player[] playerl;
	public static void main(String[] args) {
		/*
		 * Tipico main con una unica funcion
		 */
		construcction();
		menu();
	}
	
	private static void construcction() {
		Carta Growlithe = new Carta(60, 10, "Mordisco", 0, "", "Growlithe", 68);
		biblioteca.add(Growlithe);
    	Carta Squirtle = new Carta(60, 10, "Mordisco", 30, "Cabezazo", "Squirtle", 7);
    	biblioteca.add(Squirtle);
	}
	
	private static void menu() {
		/*
		 * Menu que mes endevant tindra varies opcions
		 */
			int op=30;
			while (op!=0) {
				System.out.println("MEMELORD");
				tablero.ready();
				System.out.println("Menu");
				System.out.println("0- Salir");
				System.out.println("1 - Jugar");
				
				op = sc.nextInt();
				switch(op) {
					default:
						System.out.println("No es una opcion, para");
					break;
					case 0:
						exit();
						/*
						 * 	torna a la funció battle i despres torna a la funcio endturn
						 */
					break;
					case 1: 
						play();
					break;
					
				}
			}
	}
	
	private static void exit() {
		System.out.println("Gracies per jugar");
		System.exit(0);
	}
	
	private static void play() {
		/*
		 * Funcio que desenvolupa la partida
		 * Haura de fer recursivitat amb playp1 i playp2
		 */
		players.newplayer();
		ArrayList<ArrayDeque <Carta>>clist = deck.createdeck();
		deck1 = clist.get(0);
		deck2 = clist.get(1);
		referencedeck = clist.get(2);
		System.out.println("Robando cartas...");
		drawini(deck1,deck2);
		int victoria = 0;
		while (victoria==0) {
		playp1();
		if(comprovarvictoria()==0) {
		playp2();}
		victoria = comprovarvictoria();
		}
	}
	
	private static void drawini (ArrayDeque<Carta> deck,ArrayDeque<Carta> deck2 ) {
		/*
		 * Funcio que al inici de la partida posa la ma incial a la ma de cada jugador (5 cartes)
		 */
		for(int i=0;i<5;i++) {
			tablero.table[3][i+2]=deck.getFirst().numero;
			deck.pop();
			
		}
		for(int i=0;i<5;i++) {
			tablero.table[0][i+2]=deck2.getFirst().numero;
			deck2.pop();
		}
		tablero.viewtable();
	}
	
	private static void playp1() {
		/*
		 * Funcio que fa de torn del jugador 1
		 */
		drawp1(deck1);
		usecardp1(tablero.table);
		battlep1();
		//endturn();
	}
	
	private static void drawp1 (ArrayDeque<Carta> deck) {
		/*
		 * Jugador 1 roba carta
		 */		
		System.out.println("Robando cartas...");

		boolean draw = false;
		int i=0;
		while(!draw) {
			System.out.println("entra");
			if(deck.isEmpty()==true) {
				players.p1.hp-=100;
				draw=true;
				System.out.println("entra2");
			}
			else if(tablero.table[3][i]==0) {
				tablero.table[3][i]=deck.getFirst().numero;
				deck.pop();	
				draw=true;
				
				System.out.println("entra1");
			}
			i++;
		}
	}
	 
	private static void usecardp1(int table[][]) {
		/*
		 * Jugador 1 juga una carta que es posa al tauler. Limit 1 carta per torn
		 */
		int i=0;
		boolean ok= false;
		System.out.print("Elige carta para poner en el tablero: ");
		int card= sc.nextInt();
		int carta= tablero.table[3][card];
		while(!ok) {
			if(tablero.table[2][i]==0) {
				tablero.table[2][i]=carta;
				ok=true;
			}
			i++;
		}
		tablero.viewtable(); //TODO
	}
	
	private static void playp2() {
		/*
		 * Funcio que fa de torn del jugador 2
		 */
		drawp2(deck2);
		usecardp2(tablero.table);
		battlep2();
	}
	
	private static void drawp2 (ArrayDeque<Carta> deck2) {
		/*
		 * Jugador 2 roba carta
		 */
		System.out.println("Robando cartas...");

		boolean draw = false;
		int i=0;
		while(!draw) {
			System.out.println("entra");
			if(deck2.isEmpty()==true) {
				players.p1.hp-=100;
				draw=true;
				System.out.println("entra2");
			}
			else if(tablero.table[0][i]==0) {
				tablero.table[0][i]=deck2.getFirst().numero;
				deck2.pop();	
				draw=true;
				
				System.out.println("entra1");
			}
			i++;
		}
	}
	
	private static void usecardp2(int table[][]) {
		/*
		 * Jugador 2 juga una carta que es posa al tauler. Limit 1 carta per torn
		 */
		int i=0;
		boolean ok= false;
		System.out.print("Elige carta para poner en el tablero: ");
		int card= sc.nextInt();
		int carta= tablero.table[3][card];
		while(!ok) {
			if(tablero.table[1][i]==0) {
				tablero.table[1][i]=carta;
				ok=true;
			}
			i++;
		}
		tablero.viewtable(); //TODO
	}
	
	private static void battlep1() {
		/*
		 * Funcio que fa que el jugador trii una carta per atacar a una altra. Si no hi han cartes ataca a la vida del rival
		 * Hauria de dividirla en battlep1 i battlep2
		 * Cartes han de superar els punts de defensa amb els punts de atac, si no no destrueix la carta,
		 *  actualment no pasa res, mes endevant podria restar la diferencia als punts de vida del jugador corresponent
		 * 
		 */
		int selectatk=0,selectdef=0;
		System.out.print ("Elige la carta atacante: ");
		int cartaataca=sc.nextInt()+1;
		System.out.print("Elige a que carta atacar");
		int cartaobjectiu= sc.nextInt()+1 ;
		
		/*
		 * cartaataca(atac)vs cartaobjectiu(defensa)
		 */
		int select = tablero.table[2][cartaataca];
		int select2 = tablero.table[1][cartaobjectiu];
		
		/*Conseguir ataque de una carta */
		for (Carta i : referencedeck) {
			if (i.numero==select) {
				selectatk = i.ataque;
			}
		}
		
		for (Carta i : referencedeck) {
			if (i.numero==select2) {
				selectdef = i.ataque;
			}
		}
		
		if(selectatk>selectdef) {
			tablero.table[1][cartaobjectiu]=0;
			players.p2.hp-=(selectatk-selectdef);
		}
		if(selectatk<selectdef) {
			tablero.table[1][cartaataca]=0;
			players.p1.hp-=(selectdef-selectatk);
		}
		if(selectatk==selectdef) {
			tablero.table[1][cartaobjectiu]=0;
			tablero.table[1][cartaataca]=0;
		}

		tablero.viewtable();
		System.out.println("Vida jugador 1: "+players.p1.hp);
		System.out.println("Vida jugador 2: "+players.p2.hp);
	}
	
	private static void battlep2() {
		/*
		 * Funcio que fa que el jugador trii una carta per atacar a una altra. Si no hi han cartes ataca a la vida del rival
		 * Hauria de dividirla en battlep1 i battlep2
		 * Cartes han de superar els punts de defensa amb els punts de atac, si no no destrueix la carta,
		 *  actualment no pasa res, mes endevant podria restar la diferencia als punts de vida del jugador corresponent
		 * 
		 */
		int selectatk=0,selectdef=0;
		System.out.print ("Elige la carta atacante: ");
		int cartaataca=sc.nextInt()+1;
		System.out.print("Elige a que carta atacar");
		int cartaobjectiu= sc.nextInt()+1 ;
		
		/*
		 * cartaataca(atac)vs cartaobjectiu(defensa)
		 */
		int select = tablero.table[1][cartaataca];
		int select2 = tablero.table[2][cartaobjectiu];
		
		/*Conseguir ataque de una carta TODO*/
		for (Carta i : referencedeck) {
			if (i.numero==select) {
				selectatk = i.ataque;
			}
		}
		
		for (Carta i : referencedeck) {
			if (i.numero==select2) {
				selectdef = i.ataque;
			}
		}
		
		if(selectatk>selectdef) {
			tablero.table[1][cartaobjectiu]=0;
			players.p2.hp-=(selectatk-selectdef);
		}
		if(selectatk<selectdef) {
			tablero.table[1][cartaataca]=0;
			players.p1.hp-=(selectdef-selectatk);
		}
		if(selectatk==selectdef) {
			tablero.table[1][cartaobjectiu]=0;
			tablero.table[1][cartaataca]=0;
		}
		tablero.viewtable();
		System.out.println("Vida jugador 1: "+players.p1.hp);
		System.out.println("Vida jugador 2: "+players.p2.hp);
	}
	
	private static int comprovarvictoria() {
		return 1;
		/*System.out.println("Vida actual jugador 1:"+players.p1.hp);
		System.out.println("Vida actual jugador 2: "+players.p2.hp);
		if(players.p1.hp==0) {
			return 2;
		}
		else if(players.p2.hp==0) {
			return 1;
		}
		else return 0;*/
	}
	
		
}
