import java.util.Scanner;


public class Perimetropoligono {

    private Integer largo;
    private Integer y;

    public void setLargo(Integer larg){
        largo=larg;
    }
    public Integer getLargo(){
        return largo;
    }
    public Double Operacion(){
        double angulo = 72; 
        double anguloRadianes = Math.toRadians(angulo);
        Double valor = Math.tan(anguloRadianes);
        Double x = largo * valor;
        return  x*5;
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Perimetropoligono x = new Perimetropoligono();
        System.out.println("dame el  largo: ");
        x.setLargo(entrada.nextInt());
        System.out.println(" perimetro: " + x.Operacion());
    }
}