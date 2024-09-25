
public class Caneta {
    private String modelo;
    private String cor;
    private float ponta; 
    private int carga;
    private boolean tampada;
  
   
    public Caneta(String m, String c, float p) {
        this.setModelo(m); 
        this.setCor(c);     
        this.setPonta(p);   
        this.tampar();      
    }

    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;  
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String c) {
        this.cor = c;  
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;  
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int c) {
        this.carga = c;  
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean t) {
        this.tampada = t;  // Atribui o parâmetro ao atributo
    }
  
    // Outros métodos
    public void rabiscar() {
        if (isTampada()) {
            System.out.println("ERRO, ESTÁ TAMPADA. NÃO POSSO RABISCAR.");
        } else {
            System.out.println("Posso rabiscar.");
        }
    }

    public void status() {
        System.out.println("Esse é o modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Carga: " + this.getCarga());
        System.out.println("Está tampada? " + this.isTampada());
    }

    public void tampar() {
        this.setTampada(true);
    }

    public void destampar() {
        this.setTampada(false);
    }
}
