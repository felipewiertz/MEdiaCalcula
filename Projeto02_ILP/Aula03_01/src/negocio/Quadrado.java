
package negocio;

/**
 *
 * @author dreis
 */
public class Quadrado extends Figura{
    
    private float lado;

    public void setLado(float lado) { this.lado = lado; }
    public float getLado() { return lado; }

    @Override
    public float calcularArea() {
        return lado * lado;
    }
    
}
