
package ultraemonjicombat;

public class UltraEmonjiCombat {
    public static void main(String[] args) {
    Lutador  L[] = new Lutador[4];    
    L[0]=new Lutador("Anderson","Brasil",35,
            1.71f,68.9f,22,2,1);
    L[1]=new Lutador("Petter","Portugal",40,
            1.71f,66.9f,12,5,0);
    L[2]= new Lutador ("Jordan","Dinamarca",25,
            1.72f,67.9f,22,5,0);
    L[3]=new Lutador ("Mello","Mexico",30,
           1.75f,66.9f,11,10,1);
   //SE QUISER VER LUTADORES 
    /*L[0].apresentar();
    L[1].apresentar();
    L[2].apresentar();
    L[3].apresentar();*/
    
    //Marcar Luta entre lutadores
    Luta combate = new Luta();
    combate.marcarLuta(L[0],L[1]);
    combate.lutar();
   
   //Se quiser verifazer 
    
    //L[0].status();
    //L[1].status();
        
      
        
    }
    
}
