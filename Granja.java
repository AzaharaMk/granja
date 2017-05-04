
/**
 * Write a description of class Granja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Granja
{

    /**
     * Constructor for objects of class Granja
     */
    public Granja()
    {
        
    }

    public void alimentar(Animales animal)
    {
        animal.comer();
    }
    
    public void vacunaAnimal(vacunarAnimal animal)
    {
            animal.vacunar();
    }
    
    public void hacerEmitirSonidoCaracterístico(Animales animal)
    {
       animal.emitirSonidoCaracteristico();
    }
   
    }
   
