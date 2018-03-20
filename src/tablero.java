

public class tablero {
		static int size= 6;
		static int size2= 10;
		static Taulell t = new Taulell();
	    static Finestra f = new Finestra(t);
		public static int table[][]= {
				{ 1, 0, 0, 0, 0, 0, 0, 1, 9},
				{ 1, 0, 0, 0, 0, 0, 0, 0, 1},
				{ 1, 0, 0, 0, 0, 0, 0, 0, 1},
				{ 8, 1, 0, 0, 0, 0, 0, 0, 1},
		};
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		inicialitzarGUI();
		viewtable();
	}
	
    private static void inicialitzarGUI() {
    	t.setActimatges(true); /**  @param actimatges activo imatges
    							*/
        t.setActimgbackground(true);/**  @param actimgbackground activo background
		*/
        t.setImgbackground("fondoprueba2.jpg");
        /**  @param setimgbackground Declaro el path del background
		*/
    	String[] imatges= {"" //0 empty
    			,"dio.jpg" //1 Dio
    			,"","","","","","", //2-7 empty
    			"mimikyu.png", //8 mimikyu
    			"Shaman.png", //9 shaman hearthstone
    			"", //10 empty
    			"knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg",
    			"knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg",
    			"knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg",
    			"knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg",
    			"knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg",
    			"knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg",
    			"knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg", "knuckles.jpg",
    			"knuckles.jpg"//11-72 Uganda knuckles
    			}; 
    	t.setImatges(imatges); //Paso la string de imatges
        t.setActcolors(false); //Desactivo els colors
        t.setPAD(0); //Posso el PAD a 0
        f.setActetiquetes(false); //Desactivo etiquetes
	}
	
	public static void viewtable() {
		/*
		 * Funcio que dibuixa el tauler
		 */
		t.dibuixa(table);
	}
	
	public static void ready() {
		/*
		 * Funcio que inicialitza el tauler i la GUI
		 */
		inicialitzarGUI();
		viewtable();
	}
}
