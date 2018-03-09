public class Fecha {
   private Integer dia;
   private Integer mes;
   private Integer anio;
   public Fecha(Integer dia, Integer mes, Integer anio){
       this.dia = dia;
       this.mes = mes;
       this.anio = anio;
   }
   public String toString(){
       return String.format("%d / %d / %d", dia, mes, anio);
   }
   
   private Integer diaMes(){
       switch(this.mes){
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
               return 31;
           case 4:
           case 6:
           case 9:
           case 11:
               return 30;
           case 2:
               if(this.anio % 4 == 0){
                   return 29;
               }else{
                   return 28;
               }
           default: return 0;
       }
       
   }
   public void setD(Integer dia){
        this.dia = dia;
    }
    public Integer getD(){
        return dia;
    }
    public void setM(Integer mes){
        this.mes = mes;
    }
    public Integer getM(){
        return mes;
    }
    public void setA(Integer anio){
        this.anio = anio;
    }
    public Integer getA(){
        return anio;
    }
    
    public void aumentar(){
        this.dia++;
        if(this.dia > this.diaMes()){
            this.dia = 1;
            this.mes++;
            if(this.mes > 12){
                this.mes = 1;
                this.anio++;
            }
        }
    }
    public void aumentar(Integer n){
        for (int i = 0; i < n; i++) {
            this.aumentar();
            
        }
    }
}