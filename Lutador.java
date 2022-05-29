
package ultraemonjicombat;
public class Lutador {
    //atributos
  private String nome;
  private String nacionalidade;
  private int idade;
  private float altura;
  private float peso;
  private String categoria;
  private int vitorias;
  private int derrotas;
  private int empate;
//metodos publicos
public void apresentar(){
    System.out.println("---------------------------");
    System.out.println("Apresentacao ");
    System.out.println("Lutador "+this.getNome());
    System.out.println("Nacionalidade "+this.getNacionalidade());
    System.out.println("Idade "+this.getIdade());
    System.out.println("Pesando "+this.getPeso());
    System.out.println("Vitorias "+this.getVitorias());
    System.out.println("Derrotas "+this.getDerrotas());
    System.out.println("Empates "+this.getEmpate());
    System.out.println("-----------------------------"); 
}
public void status(){
    System.out.println("------------------");
    System.out.println("STATUS");
    System.out.println("Peso "+this.getPeso());
    System.out.println("Categoria "+this.getCategoria());
    System.out.println("Ganhou "+this.getVitorias()+" Vezes");
}
public void ganharLuta(){
 this.setVitorias(this.getVitorias()+1);   
}
public void perderLuta(){
  this.setDerrotas(this.getDerrotas()+1);
}
public void empatarLuta(){
  this.setEmpate(this.getEmpate()+1);  
}
//metodos construtor

public Lutador(String nome, String nacionalidade, 
        int idade, float altura, 
        float peso,int vitorias,
        int derrotas, int empate) {
      this.nome = nome;
      this.nacionalidade = nacionalidade;
      this.idade = idade;
      this.altura = altura;
      this.setPeso(peso);
      this.categoria = categoria;
      this.vitorias = vitorias;
      this.derrotas = derrotas;
      this.empate = empate;
    }
//metodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
        
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

   private void setCategoria() {
       if(this.peso<52.2){
         this.categoria = "INVALIDO";  
      }else if(this.peso<=70.3){
        this.categoria = "Peso Leve";   
      }else if(this.peso<=83.9){
        this.categoria="Categoria Media";
      }else if(this.peso<=120.2){
        this.categoria="Pesada";
      }else{
        this.categoria="Invalido";
      }
       
        
    }

    private int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getEmpate() {
        return empate;
    }

    private void setEmpate(int empate) {
        this.empate = empate;
    }

  
    
    
}
