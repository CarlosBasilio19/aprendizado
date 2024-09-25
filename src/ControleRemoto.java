
public class ControleRemoto implements InterfaceControle  {
 
  private int volume;  
  private boolean ligado;   
  private boolean tocando;

    public ControleRemoto() {
    this.setVolume(50);
    this.setLigado(false);
    this.setTocando(false);
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }

    @Override
    public void ligar() {
    this.setLigado(true);
    }

    @Override
    public void desligar() {
    this.setLigado(false);
    }

    @Override
    public void AbrirMenu() {
        System.out.println("ESTA LIGADO ?" + this.getLigado());
        System.out.println("ESTA TOCANDO?" + this.getTocando());
        System.out.print("Vomume" + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("/");   
        }
    }

    @Override
    public void FecharMenu() {
        System.out.println("FECHANDO MENU......"); 
            
    }

    @Override
    public void maisVolume() {
         if (this.getLigado()) {
           this.setVolume(this.getVolume() + 5 );
        }System.out.println("Volume aumentado");
        
    }

    @Override
    public void MenosVolume() {
        if (this.getLigado()&& this.getVolume()>0) {
        this.setVolume(this.getVolume() - 5);
        }
        
    }

    @Override
    public void LigarMudo() {
    if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
             System.out.println("MUTADO");
     }
    }

    @Override
    public void DesligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
            System.out.println("DESMUTADO");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() &&! this.getTocando() ) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
           this.setTocando(false);
        }
    }



  
}
