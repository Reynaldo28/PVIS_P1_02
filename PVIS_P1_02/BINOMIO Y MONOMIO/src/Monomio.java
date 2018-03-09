public class Monomio {
    
    private Integer coeficiente;
    private Integer exponente;
    
    public Monomio(Integer c, Integer e){
    this.coeficiente=c;
    this.exponente=e;
    }
    public void setCoeficiente(Integer c){
        this.coeficiente = c;
    }
    public Integer getCoeficiente(){
        return this.coeficiente;
    }
    public void setExponente(Integer e){
        this.exponente = e;
    }
    public Integer getExponente(){
        return this.exponente;
    }
    public String toString(){
        if(coeficiente>0){
            return String.format("+%dx^%d",coeficiente,exponente);
            
        }else
            return String.format("%dx^%d",coeficiente, exponente);
    }
    
}
