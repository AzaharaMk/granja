
/**
 * Write a description of class Patos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pato extends Animales 
{
    private int ptosVidaPato;
    private int pesoPato;

    /**
     * Constructor for objects of class Pato
     */
    public Pato()
    {
        ptosVidaPato = ptosVidaIniciales;
        pesoPato = 2;
    }
    
    public void comer()
    {
        pesoPato = getPeso() + 1;
        ptosVidaPato = getPuntosDeVida() - 10;
    }
    
    /**
     *Método que devuelve el peso de los patos en kilogramos.
     */
    public int getPeso()
    {
        return pesoPato;
    }
    
    /**
     * Método abstracto que devuelve los puntos de vida actuales de los patos.
     */
    public int getPuntosDeVida()
    {
        return ptosVidaPato;
    }
    
     public void emitirSonidoCaracteristico()
    {
        System.out.println("cuac, cuac");
    }
    
}
