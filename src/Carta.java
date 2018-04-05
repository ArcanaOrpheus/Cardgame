public class Carta {
   
    public String nombre;
    public int ataque1;
    public String atak1;
    public int ataque2;
    public String atak2;
    public int vida;
    public int numero;
    
    public Carta (int vida, int ataque1, String atak1, int ataque2, String atak2, String nombre, int numero){
    	this.vida=vida;
    	this.ataque1=ataque1;
    	this.atak1=atak1;
    	this.ataque2=ataque2;
    	this.atak2=atak2;
    	this.nombre=nombre;
    	this.numero=numero;
    	
    }
    
    /**
     * @author: Daniel Suñe (aka "Tilo")
     * @Version: 0.01
     *  nombre Nombre de la carta
     *  ataque Valor de atac de una carta
     *  vida Valor de vida o resistencia de una carta per a quan es atacada
     *  numero ID de la carta
     */
 
   public  String toString() {
	   return nombre;
   }
 

}