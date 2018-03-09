public class Resultado {
    private Hora hora;
    private Fecha fecha;

    public Resultado(Hora hora, Fecha fecha) {
        this.hora = hora;
        this.fecha = fecha;
    }

    public Resultado(int s, int m, int h, int d, int mm, int a){
        this.fecha= new Fecha(d, m , a);
        this.hora = new Hora(s, mm, h);
    }
    public void aumentar(){
        this.hora.aumentar();
        if((this.hora.getHora() == 0)&&(this.hora.getMinuto()==0)&&(this.hora.getSegundo() == 0)){
            this.fecha.aumentar();
        }
    }
    public String toString(){
        return "la fecha es: " + fecha + " y la hora es " + hora; 
    }
    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    
}