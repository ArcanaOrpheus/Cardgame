import java.util.ArrayDeque;
		
public class Cartas {
	
	
	

	public ArrayDeque<Carta> newcard() {
		int i=30;
		/*
		 * Clase que genera objetos de la clase carta. las cartas tienen actualmente:
		 * Vida
		 * Ataque
		 * Descripcion (La acabare quitando)
		 * Nombre
		 */
		
		/*Base para nuevas cartas
		 * Carta = new Carta ();
			.ataque = ;
			.vida = ;
			.descripcion = "";
			.nombre= "";
			.imagen = ""
			  .pathimagen; */
		ArrayDeque <Carta> deck= new ArrayDeque <Carta>();
		deck.clear();
		
		
		Carta thequeen = new Carta();
			thequeen.ataque = 300;
			thequeen.vida = 1000;
			thequeen.descripcion = "She knuws da wae";
			thequeen.nombre = "The Queen";
			thequeen.numero = 11;
			/*thequeen.imagen = "";
			thequeen.pathimagen;*/
			i--;
			
			deck.add(thequeen);
		
		
		Carta marcofrias = new Carta();
			marcofrias.ataque = 600;
			marcofrias.vida = 1200;
			marcofrias.descripcion = "Dios y salvador de los memes. Las leyendas dicen que era de la clase 1DAMC. Siempre en nuestros corasones";
			marcofrias.nombre = "Marco Frias";
			marcofrias.numero = 12;
			/*marcofrias.imagen = "";
			marcofrias.pathimagen;*/
			i--;
			
			deck.add(marcofrias);
			
		Carta fantasmadelpacman = new Carta ();
			fantasmadelpacman.ataque = 980;
			fantasmadelpacman.vida = 3000;
			fantasmadelpacman.descripcion = "Fantasma que se reproduce magicamente por el mapa del pac-mam. No le gusta salir de casa";
			fantasmadelpacman.nombre= "Blinky";
			fantasmadelpacman.numero = 13;
			/*fantasmadelpacman.imagen = ""
			  fantasmadelacman.pathimagen;*/
			i--;
			
			deck.add(fantasmadelpacman);
			
		Carta bolaproyector = new Carta ();
			bolaproyector.ataque = 100;
			bolaproyector.vida = 100;
			bolaproyector.descripcion = "Bola satanica del proyector, nemesis de nuestro amigo Marc Albareda";
			bolaproyector.nombre= "Bola del proyector";
			bolaproyector.numero = 14;
			/*bolaproyector.imagen = ""
			bolaproyector.pathimagen; */
			i--;  
			
			deck.add(bolaproyector);
			
		 Carta doge = new Carta ();
			doge.ataque = 400;
			doge.vida = 1000;
			doge.descripcion = "Such wow. Luk ma skil";
			doge.nombre= "Doge";
			doge.numero = 15;
			/*.imagen = ""
			  .pathimagen; */
			i--;
			
			deck.add(doge);
						
		Carta sanic = new Carta ();
			sanic.ataque = 120;
			sanic.vida = 240;
			sanic.descripcion = "Tu fast ma boi";
			sanic.nombre = "Sanic";
			sanic.numero = 16;
			/*.imagen = ""
			  .pathimagen; */
			i--;
			
			deck.add(sanic);
			
		Carta mapache = new Carta();
			mapache.ataque = 0;
			mapache.vida = 3000;
			mapache.descripcion = "Joder tio es injusto, La culpa es del mid";
			mapache.nombre = "Mapache";
			mapache.numero = 17;
			/*.imagen = ""
			  .pathimagen; */
			i--;
			
			deck.add(mapache);
			
		Carta tilo = new Carta ();
			tilo.ataque = 720;
			tilo.vida = 1;
			tilo.descripcion = "Quiere ser el mejor que habra jamas como nunca hubo nadie mas pero no sabe que es levear";
			tilo.nombre = "Tilo";
			tilo.numero = 18;
			i--;
			
			deck.add(tilo);
			
		Carta topo = new Carta ();
			topo.ataque = 3000;
			topo.vida = 2500;
			topo.descripcion = "Topo de la clase que prohibio el uso de maquinas electronicas para la diversion. Su identidad sigue siendo un misterio";
			topo.nombre = "El topo";
			topo.numero=19;
			i--;
			
			deck.add(topo);
			
		Carta aatrox = new Carta ();
			aatrox.ataque = 80;
			aatrox.vida = 1;
			aatrox.descripcion = "Carta useless pero de nuestro dios salvador i creador Aatrox de Bliot";
			aatrox.nombre= "Aatrox de Bliot";
			aatrox.numero=20;
			i--;
			
			deck.add(aatrox);
		
		Carta nidalee = new Carta ();
			nidalee.ataque = 700;
			nidalee.vida = 1000;
			nidalee.descripcion = "El ruben jugando jungla con su magnifica e insuperable nidalee. Da mas del 50% de sus lanzas (si contamos los aliados)";
			nidalee.nombre = "Nidalee jungla chicos";
			nidalee.numero=21;
			i--;
			
			deck.add(nidalee);
		
		Carta main = new Carta ();
			main.ataque = 1000;
			main.vida = 1000;
			main.descripcion = "Funcion que el Marc no pone nunca en su codigo porque no sabe pulsar un boton.";
			main.nombre = "Main";
			main.numero=22;
			deck.add(main);
			i--;
			
		Carta teemo = new Carta ();
			teemo.ataque = 666;
			teemo.vida = 3000;
			teemo.descripcion = "Satanas en persona";
			teemo.nombre = "Teemo el puto tejon";
			teemo.numero=23;
			deck.add(teemo);
			i--;
			
		
			
		return deck;
			
	}
	
	
	
}
