
/**
 * Write a description of class Pollos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pollo extends Animales implements vacunarAnimal
{
    private int ptosVidaPollo;
    private int pesoPollo;

    /**
     * Constructor for objects of class Pollos
     */
    public Pollo()
    {
        ptosVidaPollo = ptosVidaIniciales;
        pesoPollo = 1;
    }

    public void comer()
    {
        pesoPollo = getPeso() + 1;
        ptosVidaPollo = getPuntosDeVida() - 10;
    }
    
    /**
     *Método que devuelve el peso de los pollos en kilogramos.
     */
    public int getPeso()
    {
        return pesoPollo;
    }
    
    /**
     * Método abstracto que devuelve los puntos de vida actuales de los pollos.
     */
    public int getPuntosDeVida()
    {
        return ptosVidaPollo;
    }
    
     public void emitirSonidoCaracteristico()
    {
        System.out.println("pio, pio");
    }
    
    public void vacunar()
    {
        ptosVidaPollo = getPuntosDeVida() + 10;
    }
}
