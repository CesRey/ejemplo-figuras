
/**
 * Esta clase representa objetos circulo con un radio
 * 
 * @author César Reyes
 * @version 1.0 (8-sep-17)
 */
public class Circulo extends Figura
{
    private float radio;
    
    public Circulo(float unRadio)
    {
        radio=unRadio;
    }
    
    @Override 
    public void calcularArea()
    {
        area = 3.14f * radio * radio;
    }
}
