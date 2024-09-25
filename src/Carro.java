
public class Carro implements PainelCarro {

private String marca;
private String modelo;
private String ano;
private int velocidade;
private int freiar;    
private boolean ligado;    
private boolean pontomorto;
private boolean embreagem;

    public Carro(String marca,String modelo,String ano) {
    this.setMarca(marca);
    this.setModelo(modelo);
    this.setAno(ano);
    this.setLigado(false);
    this.setPontomorto(true);
    this.setvelocidade(0);
    }

   


    @Override
    public void DarPartida() {
    this.setLigado(true);
        System.out.println(marca+"Ligado");
    }

    @Override
    public void Desligar() {
        if (this.getvelocidade()==0 && this.isPontomorto() && this.isLigado()==true) {
            this.setPontomorto(true);
           System.out.println(marca+"igado");
        }
        
    
            }
    

    @Override
    public void PontoMorto() {
        if (this.isEmbreagem()==true) {
        this.setPontomorto(true);
            System.out.println("Ponto morto ativado");
        }

    }

    @Override
    public void PisarEmbreagem() {
        
            this.setEmbreagem(true);
            
            System.out.println("Pisou na embreagem");
          
    }

    @Override
    public void SetaEsquerda() {
        System.out.println("Seta esquerda ligada   <--  " );
       
    }

    @Override
    public void SetaDireita() {
    System.out.println("Seta esquerda ligada   -->  " );
    }

    @Override
    public void Marcha1() {
        if (this.isLigado() && this.isEmbreagem()) {
            this.setPontomorto(false);
            System.out.println("Primeira Marcha" );  
        }
    
    }

    @Override
    public void Marcha2() {
    if (this.isLigado() && this.isEmbreagem()) {
          this.setPontomorto(false); 
        System.out.println("segunda Marcha" );  
        }
    
    }

    @Override
    public void Marcha3() {
    if (this.isLigado() && this.isEmbreagem()) {
           this.setPontomorto(false);
        System.out.println("terceira Marcha" );  
        }
    }

    @Override
    public void Marcha4() {
    if (this.isLigado() && this.isEmbreagem()) {
          this.setPontomorto(false); 
        System.out.println("quarta Marcha" );  
        }
    }

    @Override
    public void Marcha5() {
    if (this.isLigado() && this.isEmbreagem()) {
          this.setPontomorto(false);
        System.out.println("quinta Marcha" );  
        }
    }

    @Override
    public void MarchaRé() {
    if (this.isLigado() && this.isEmbreagem()) {
          this.setPontomorto(false);
        System.out.println(" Marcha ré" );  
        }
    }

    @Override
    public void Acelerar() {
    if (this.isLigado() && this.isPontomorto()== false ) {
        this.setvelocidade(this.getvelocidade()+10);
        System.out.println("Acelerou"+"  Agora tem   "+ this.getvelocidade()+"Km" );  
        }
    }

    @Override
    public void Freiar() {
        if (this.isLigado() && this.getvelocidade()>0 ) {
          this.setvelocidade(0);
            System.out.println("Freiou");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getvelocidade() {
        return velocidade;
    }

    public void setvelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getFreiar() {
        return freiar;
    }

    public void setFreiar(int freiar) {
        this.freiar = freiar;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    

    public boolean isPontomorto() {
        return pontomorto;
    }

    public void setPontomorto(boolean pontomorto) {
        this.pontomorto = pontomorto;
    }

    public boolean isEmbreagem() {
        return embreagem;
    }

    public void setEmbreagem(boolean embreagem) {
        this.embreagem = embreagem;
    }

    @Override
    public void Status() {
        System.out.println("MARCA:");   
    System.out.println("MODELO;");   
    System.out.println("ANO:");
    System.out.println("VELOCIDADE");   
    
    
    }
}
