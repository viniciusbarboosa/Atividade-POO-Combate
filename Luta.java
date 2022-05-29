
package ultraemonjicombat;

import java.util.Random;

public class Luta {
    //atributos
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;
    //metodos publicos
    
    public void marcarLuta(Lutador L1,Lutador L2){
        if(L1.getCategoria().equals(L2.getCategoria())
                && L1 != L2){
            this.aprovada=true;
            this.desafiado=L1;
            this.desafiante=L2;   
        }else{
           this.aprovada=false;
            this.desafiado=null;
            this.desafiante=null;   
        }
    }
    public void lutar(){
       if(this.aprovada){
          System.out.println("Status do Desafiante");
          System.out.println("-------------------------");
          this.desafiante.status();
          System.out.println("-------------------------");
          System.out.println("Status do Desafiado");
          System.out.println("-------------------------");
          this.desafiante.apresentar();
          System.out.println("-------------------------");
       }else{
        System.out.println("A luta nao pode acontecer");   
       }
       
       Random aleatorio = new Random ();
         int vencedor = aleatorio.nextInt(3);
       switch(vencedor){
           case 0://empate
               System.out.println("Empatou A LUTA");
               System.out.println("====================");
               this.desafiado.empatarLuta();
               this.desafiante.empatarLuta();
           break;    
           case 1://desafiado Vence
               System.out.println(this.desafiado.getNome()+" VENCEU A LUTA");
               this.desafiado.ganharLuta();
               this.desafiante.perderLuta();
           break;
           case 2://desafiante Vence
               System.out.println(this.desafiante.getNome()+" VENCEU A LUTA");
               this.desafiante.ganharLuta();
               this.desafiado.perderLuta();
           break;    
       }
    }
    
    //metodos especiais

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
}
