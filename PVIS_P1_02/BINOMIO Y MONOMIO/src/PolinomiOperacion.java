import java.util.Scanner;

public class PolinomiOperacion {
    public static void main(String[]args){
        Polinomio primero = new Polinomio();
        primero.adicionar(new Monomio(5, 2));
        primero.adicionar(new Monomio(7, 3));
        Polinomio segundo = new Polinomio();
        segundo.adicionar(new Monomio(3, 2));
        segundo.adicionar(new Monomio(1, 1));
        primero.adicionar(segundo);
        
        System.out.println(primero);
        
        primero.restar2(new Monomio(5, 2));
        primero.restar2(new Monomio(7, 3));
        
        segundo.restar2(new Monomio(3, 2));
        segundo.restar2(new Monomio(1, 1));
        primero.restar2(segundo);
        System.out.println(primero);
    }
}