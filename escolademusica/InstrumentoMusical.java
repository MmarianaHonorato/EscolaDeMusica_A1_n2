
package escolademusica;


public abstract class InstrumentoMusical {
    private String nome;
    private String material;
    
    public InstrumentoMusical(String nome,String material){
    this.nome=nome;
    this.material=material;
    }
    public abstract void tocar();
    
    public void afinar(){
    System.out.print("Afinando o"+getNome() );}
    
    public void mostrasInformacoes(){
        System.out.print("nome:"+getNome() );
        System.out.print("material:"+getMaterial() );
    }

   
    public String getNome() {
        return nome;
    }

  
    public String getMaterial() {
        return material;
    }
    
}
