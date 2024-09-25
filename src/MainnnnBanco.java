
public class MainnnnBanco {
  public static void main (String[]args){
      ContaBanco c1 = new ContaBanco();
      c1.setNumeroDaConta(1111);
      c1.setDono("Lucas");
      c1.AbrirConta("CP");
      c1.Depositar(50);
      c1.PagarMensalidade();
      c1.EstadoAtual();
      
  }  
}
