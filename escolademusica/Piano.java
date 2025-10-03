
package escolademusica;

public class Piano extends InstrumentoMusical {
    private int Numerotelcas;
    
    public Piano(String nome,String material,int Numerotelcas){
    super( nome,material);
    this.Numerotelcas=Numerotelcas;
    }
    
    @Override
    public void tocar(){
    System.out.print("Soando uma bela melodia no "+super.getNome()+"com "+getNumerotelcas());
    System.out.print("Executando uma aonata classica");
    }
    
    @Override
    public void afinar(){
    super.afinar();
   System.out.print("Ajustandoa tensão das cordas internas do piano");
    }
    
    @Override
     public void mostrasInformacoes(){
    super.mostrasInformacoes();
    System.out.print("Numero teclas:"+getNumerotelcas());
    }

  
    public int getNumerotelcas() {
        return Numerotelcas;
    }
     
    
}
