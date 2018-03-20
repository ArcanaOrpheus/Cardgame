public class Carta {
   
    public String nombre;
    public int imagen;
    public String pathimagen;
    public String descripcion;
    public int ataque;
    public int vida;
    public int mana;
    public int numero;
    
    /**
     * @author: Daniel Suñe (aka "Tilo")
     * @Version: 0.01
     *  nombre Nombre de la carta
     *  imagen imatge a la que correspon, no serveix per a res mes que per a guiarme jo
     *  pathimagen Path de la imatge (a implementar) de cada carta
     *  descripcion Descripcio de la carta
     *  ataque Valor de atac de una carta
     *  vida Valor de vida o resistencia de una carta per a quan es atacada
     *  numero ID de la carta
     */
 
   public String toString() {
	   return nombre;
   }
 
  /* SET public void setNombre(String newName)
   {
	   nombre = newName;
   }
   
   GET public String getNombre()
   {
	   return nombre;
   }*/
}