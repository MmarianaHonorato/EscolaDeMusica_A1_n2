
package escolademusica;

public class Saxofone extends InstrumentoMusical {
    private String tipo;
    
    public Saxofone(String nome,String material, String tipo){
    super( nome,material);
    this.tipo=tipo;
    }
    
    @Override
    public void tocar(){
    System.out.print("Tocando jazz suaves" +super.getNome()+","+tipo);
    System.out.print(" melodia envolvente");
    }
    
    @Override
    public void afinar(){
    super.afinar();
    System.out.print("Ajustando embocadora e as chaves:");
    }
    
    @Override
    public void mostrasInformacoes(){
    super.mostrasInformacoes();
    System.out.print("tipo:"+tipo);
    }
}