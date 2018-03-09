import java.util.Scanner;

public class MAIN {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        //introducir los valores de hora
        
        System.out.println("INTRODUCE EL SEGUNDO: ");
        Integer se = teclado.nextInt();
        System.out.println("INTRODUCE LA HORA: ");
        Integer mi = teclado.nextInt();
        System.out.println("INTRODUCE EL MINUTO: ");
        Integer hor = teclado.nextInt();
        Hora ho = new Hora(se, mi, hor);
        //Introducir valores de fecha
        System.out.println("INTRODUCE EL DIA: ");
        Integer di = teclado.nextInt();
        System.out.println("INTRODUCE EL MES: ");
        Integer sem = teclado.nextInt();
        System.out.println("INTRODUCE EL AÑO: ");
        Integer ani = teclado.nextInt();
        Fecha fech = new Fecha(di, sem, ani);
        Resultado res = new Resultado(ho, fech);
        while(true){    
            res.aumentar();
            System.out.println(res);
        }
    }
}