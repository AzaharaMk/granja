
/**
 * Write a description of class Animales here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Animales extends Granja
{
    public int ptosVidaIniciales;

    /**
     * Constructor for objects of class Animales
     */
    public Animales()
    {
        ptosVidaIniciales = 100;
    }
    
    abstract void comer();
    
    abstract void emitirSonidoCaracteristico();
    
    abstract int getPeso();
    
    abstract int getPuntosDeVida();
    
}
