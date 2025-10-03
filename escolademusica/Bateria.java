
package escolademusica;


public class Bateria extends InstrumentoMusical {
    private int Numeropecas;
    
    public Bateria(String nome,String material,int Numeropecas){
    super( nome,material);
    this.Numeropecas=Numeropecas;
    }
    
    @Override
    public void tocar(){
    System.out.print("Marcando o ritimo da" +super.getNome()+"com "+this.getNumeropecas());
    
    }
    
    @Override
    public void afinar(){
    super.afinar();
   System.out.print("Ajustandoa tensão das teles dos tambores");
    }
    @Override
     public void mostrasInformacoes(){
    super.mostrasInformacoes();
    System.out.print("Numero pecas:"+getNumeropecas());
    }

    public int getNumeropecas() {
        return Numeropecas;
    }
    
}
