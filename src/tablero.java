

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
		
		public static int battletable[][]= {
				
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, //1
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,7,7,7,7,7,1}, //2
				{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,9,1,1,1,1,1,1,1,1,6,1,1,7,7,7,7,7,1}, //3
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,15,1,1,1,1,1,1,1,1,1,1,1,7,7,7,7,7,1}, //4
				{1,7,7,7,7,7,1,1,1,1,1,1,1,1,1,1,1,15,1,4,4,4,4,4,4,1,5,1,1,7,7,7,7,7,1}, //5
				{1,7,7,7,7,7,1,1,6,1,1,1,1,1,1,1,1,15,1,4,4,4,4,4,4,1,1,1,1,7,7,7,7,7,1}, //6
				{1,7,7,7,7,7,1,1,1,1,1,1,1,1,1,1,1,15,1,1,1,1,1,1,1,1,1,1,1,8,8,8,8,8,1}, //7
				{1,7,7,7,7,7,1,1,5,1,4,4,4,4,4,4,1,15,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, //8
				{1,7,7,7,7,7,1,1,1,1,4,4,4,4,4,4,1,10,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2}, //9
				{1,8,8,8,8,8,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, //10
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, //11
				{1,11,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,13,1}, //12
				{1,16,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,16,1}, //13
				{1,16,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,16,1}, //14
				{1,16,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,16,1}, //15
				{1,16,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,16,1}, //16
				{1,16,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,16,1}, //17
				{1,16,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,16,1}, //18
				{1,12,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,14,1}, //19
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, //20
				
		};
		
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		inicialitzarGUI();
		viewtable();
	}
	
    private static void inicialitzarGUI() {
    	t.setActimatges(true);  // /**  @param actimatges activo imatges
    	t.setActimgbackground(false);	/*/
       // t.setActimgbackground(true);/**  @param actimgbackground activo background
									//*/
       // t.setImgbackground("fondoprueba2.jpg");
        /**  @param setimgbackground Declaro el path del background
		*/
    	String[] imatges= {"" //0 empty
    			,"" //1 Empty
    			,"separador.jpg" //2 Separador horizontal verde
    			,"separador_menu.jpg" //3 Separador horizontal naranja
    			,"peloticavacia.jpg" //4 Redonda vacia
    			,"HP.jpg" //5
    			,"" //6 empty
    			,"entrenador.jpg", //7 entrenador
    			"rival.jpg", //8 ira el nombre
    			"up_down.jpg", //9 curva de izq-abajo verde
    			"down_up.jpg", //10 curva de arriba-der verde
    			"left_right.jpg", //11
    			"down_up_menu.jpg", //12
    			"up_down_menu.jpg", //13
    			"right_left.jpg", //14
    			"vertical.jpg", //15 Separador vertical verde
    			"vertical_menu+.jpg" //16 separador vertical naranja
    			};
    	t.setImatges(imatges); //Paso la string de imatges
    	
        t.setActcolors(false); //Desactivo els colors
       
	}
	
	public static void viewtable() {
		/*
		 * Funcio que dibuixa el tauler
		 */
		t.dibuixa(battletable);
	}
	
	public static void ready() {
		/*
		 * Funcio que inicialitza el tauler i la GUI
		 */
		inicialitzarGUI();
		viewtable();
	}
}
