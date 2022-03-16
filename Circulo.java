
package tarea.corta.pkg3;

/**
 *
 * @author Diana
 */
public abstract class Circulo extends Figura {
    private double radio;
    private int cantidadLados=0;
    
     
    public Circulo(double pRadio){
        radio = pRadio;
    }
    
    public int getcantidadLados (){
        return cantidadLados;
    }
   
    public double calcularArea(){
        return 3.14*(radio*radio);
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
