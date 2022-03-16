
package tarea.corta.pkg3;

/**
 *
 * @author Diana
 */
public abstract class Triangulo extends Figura{
    private double base;
    private double altura;
    private int cantidadLados=3;
    
    public Triangulo(double pBase,double pAltura){
        base = pBase;
        altura = pAltura;
    }
    
    public int getcantidadLados (){
        return cantidadLados;
    }
    
    public double calcularArea(){
        return (base*altura)/2;
    }
    
    public int compareTo(Figura rectPorComparar){
        double areaPorComparar = rectPorComparar.calcularArea();
        double miArea = this.calcularArea();
        double ladosPorComparar = rectPorComparar.getCantidadLados();
        double misLados = this.getCantidadLados();
        if(miArea==areaPorComparar){
            if(misLados==ladosPorComparar){
                return 0;
            }
            if(misLados>ladosPorComparar){
                return 1;
            }
            else{
                return -1;
            }
        }
        else if (miArea > areaPorComparar){
            return 1;
        }
        else{
            return -1;
        }
    }

    
}
