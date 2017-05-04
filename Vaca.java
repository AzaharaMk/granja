
/**
 * Write a description of class Vacas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vaca extends Animales implements vacunarAnimal
{
    public int ptosVidaVaca;
    public int pesoVaca;
    /**
     * Constructor for objects of class Vacas
     */
    public Vaca()
    {
     ptosVidaVaca = ptosVidaIniciales;
     pesoVaca=25;
    }

    public int getPeso()
    {
        return pesoVaca;
    }
    
    /**
     * Método abstracto que devuelve los puntos de vida actuales de las vacas.
     */
    public int getPuntosDeVida()
    {
        return ptosVidaVaca;
    }
    
    public void emitirSonidoCaracteristico()
    {
        System.out.println("Muuu, muu");
    }
    
    public void comer()
    {
        pesoVaca = getPeso() + 2;
        ptosVidaVaca = getPuntosDeVida() - 10;
    }
    
    public void vacunar()
    {
         ptosVidaVaca = getPuntosDeVida() + 30;
    }
    
  
    
}
