import java.util.Scanner;

public class FECHITA {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame el día: ");
        Integer di = teclado.nextInt();
        System.out.println("damee el mes: ");
        Integer me = teclado.nextInt();
        System.out.println("dame el año: ");
        Integer an = teclado.nextInt();
        Fecha fe = new Fecha(di, me, an);
        fe.aumentar();
        System.out.println(fe);
        System.out.println("cuantos vas a aumentar?");
        Integer au = teclado.nextInt();
        fe.aumentar(au);
        System.out.println(fe);
    }}