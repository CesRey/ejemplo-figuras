
/**
 * Esta clase es una superclase para representar las caracteristicas
 * comunes de muchas figuras
 * 
 * @author César Reyes
 * @version 1.1(8-sep-17)
 */
public class Figura
{
    protected float area; // area de cada figura
   
    /**
    *Constructor de la clase figura 
    */
    public Figura()
    {
        area=0;
    }
   
    /**
    *Calcular el area de la figura
    */
    public void calcularArea()
    {
        System.out.println("No se como calcula el área, por que no se de que figura se trata.");
    }
   
    /**
    *Calcular el area de la figura
    */
    public void imprimirArea()
    {
        System.out.println("El área de la figura es: " + area);
    }
}
