
import java.util.Random;


public class Luta {
 
private Lutador Desafiado;    
private Lutador Desafiante;    
private int     rounds;    
private boolean aprovada; 

    
//Metodos Publicos

public void MarcarLuta(Lutador l1,Lutador l2 ){
    if (l1.getCategoria().equals(l2.getCategoria())&& l1 != l2)  {
     this.aprovada = true;
     this.Desafiado = l1;
     this.Desafiante = l2;       
    }else{
     this.aprovada = false;
     this.Desafiado = null;
     this.Desafiante = null;  
    }
    
    
    
}

public void Lutar(){
    if (this.aprovada==true) {
        System.out.println("###DESAFIADO###");
        this.Desafiado.apresentar();
        System.out.println("###DESAFIANTE###");
        this.Desafiante.apresentar();
        
        Random aleatoriedade = new Random();
        int vencedor = aleatoriedade.nextInt(3);
        switch (vencedor) {
          case 0:// empate
              System.out.println("EMPATE");
              this.Desafiado.empatarLuta();
              this.Desafiante.empatarLuta();
          break;
          case 1:// desafiado vence
          System.out.println("VITORIA DO" + this.getDesafiado() );
          this.Desafiado.ganharLuta();
          this.Desafiante.perderLuta();
          break;
          case 2:// desafiante ganha
        System.out.println("VITORIA DO" + this.getDesafiante() );
         
         this.Desafiante.ganharLuta();
          this.Desafiado.perderLuta();     
          break;
          
            
               
        
        
        
        
        
        
        
        
        
        
        
        
        }
        
        
        
    }
  
}












//Metodos Especiais

public Lutador getDesafiado() {
        return Desafiado;
    }

    public void setDesafiado(Lutador Desafiado) {
        this.Desafiado = Desafiado;
    }

    public Lutador getDesafiante() {
        return Desafiante;
    }

    public void setDesafiante(Lutador Desafiante) {
        this.Desafiante = Desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }













}
