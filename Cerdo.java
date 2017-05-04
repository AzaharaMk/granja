
/**
 * Write a description of class Cerdos here.
 * 
 * @author (Azahara) 
 * @version (a version number or a date)
 */
public class Cerdo extends Animales implements vacunarAnimal
{
    private int ptosVidaCerdo;
    private int pesoCerdo;

    /**
     * Constructor for objects of class Cerdo
     */
    public Cerdo()
    {
        ptosVidaCerdo = ptosVidaIniciales;
        pesoCerdo = 15;
    }

    public void comer()
    {
        pesoCerdo = getPeso() + 2;
        ptosVidaCerdo = getPuntosDeVida() - 10;
    }
    
    /**
     *Método que devuelve el peso de los cerdos en kilogramos.
     */
    public int getPeso()
    {
        return pesoCerdo;
    }
    
    /**
     * Método abstracto que devuelve los puntos de vida actuales de los cerdos.
     */
    public int getPuntosDeVida()
    {
        return ptosVidaCerdo;
    }
    
    public void emitirSonidoCaracteristico()
    {
        System.out.println("oing, oing");
    }
    
    public void vacunar()
    {
        ptosVidaCerdo = getPuntosDeVida() + 20;
    }
}
