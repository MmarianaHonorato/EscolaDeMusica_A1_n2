
package escolademusica;

public class Violao extends InstrumentoMusical {
    private int numeroCordas;
    
    public Violao(String nome,String material, int numeroCordas){
    super( nome,material);
    this.numeroCordas=numeroCordas;
    }
    
    @Override
    public void tocar(){
    System.out.print("Tocando notas suaves" +getNome()+"com "+getNumeroCordas());
    System.out.print("Dedilhando melodia romantica");
    }
    
    @Override
    public void afinar(){
    super.mostrasInformacoes();
    System.out.print("Numero de cordas:"+getNumeroCordas());
    }

    public int getNumeroCordas() {
        return numeroCordas;
    }
    
    
}
