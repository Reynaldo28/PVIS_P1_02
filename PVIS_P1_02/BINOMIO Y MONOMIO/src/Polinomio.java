import java.util.ArrayList;


    
public class Polinomio {
    private ArrayList<Monomio> elementos;
    public Polinomio(){
        elementos = new ArrayList<Monomio>();
    }
    
    public void adicionar(Monomio m){
      this.elementos.add(m);
      this.simplificar();
    }
    public void adicionar(Polinomio p){
       for(int i = 0; i < p.tamanio(); i++){
           Monomio aux = p.obtener(i);
           this.elementos.add(new Monomio(aux.getCoeficiente(), aux.getExponente()));
       }
       this.simplificar();
    }
    public void restar2(Monomio m){
        this.elementos.add(m);
        this.restar();
    }
     public void restar2(Polinomio p){
       for(int i = 0; i < p.tamanio(); i++){
           Monomio aux = p.obtener(i);
           this.elementos.add(new Monomio(aux.getCoeficiente(), aux.getExponente()));
       }
       this.restar();
    }
    public Integer tamanio(){
        return this.elementos.size();
    }
    public Monomio obtener(Integer i){
        return this.elementos.get(i);
    }
    public void simplificar(){
        ArrayList<Monomio> temp = new ArrayList<>();
        while(this.elementos.size()!=0){
            Monomio actual = this.elementos.remove(0);
            int i = 0;
            while(i < this.elementos.size()){
                Monomio comparar = this.elementos.get(i);
                if(actual.getExponente().compareTo(comparar.getExponente()) == 0){
                    actual.setCoeficiente(actual.getCoeficiente() + comparar.getCoeficiente());
                    this.elementos.remove(i);
                    
                }else{
                    i ++;
                }
            }
            temp.add(actual);
            
        }
        elementos = temp;
    }
    public void restar(){
        ArrayList<Monomio> temp = new ArrayList<>();
        while(this.elementos.size()!=0){
            Monomio actual = this.elementos.remove(0);
            int i = 0;
            while(i < this.elementos.size()){
                Monomio comparar = this.elementos.get(i);
                if(actual.getExponente().compareTo(comparar.getExponente()) == 0){
                    actual.setCoeficiente(actual.getCoeficiente() - comparar.getCoeficiente());
                    this.elementos.remove(i);
                    
                }else{
                    i ++;
                }
            }
            temp.add(actual);
            
        }
        elementos = temp;
    }
    public String toString(){
      String acumulador=" ";
      for(int i=0; i<this.elementos.size();i++){
        Monomio m =this.elementos.get(i);
        acumulador=acumulador+m.toString();
      }
      return acumulador;
    }
      
    
    
    
}