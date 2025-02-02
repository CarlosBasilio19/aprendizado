
public class Lutador {

private String nome;
private String nacionalidade;
private int    idade;
private float altura;
private float  peso;
private String categoria;
private int vitorias;   
private int derrotas;    
private int empates;    

    public Lutador(String nome, String nacionalidade, int idade, float peso,float altura, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.setPeso(peso);
        this.setAltura(altura);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    //Metodos publicos
    
 public void apresentar(){
        System.out.println("Lutador"+this.getNome());
        System.out.println("Origem"+this.getNacionalidade());
        System.out.println(this.getIdade()+"anos");
        System.out.println(this.getAltura()+"m de altura");
        System.out.println("Pesando"+this.getPeso()+"kg");
        System.out.println("Ganhou"+this.getVitorias());
        System.out.println("Perdeu"+this.getDerrotas());
        System.out.println("Empatou "+this.getEmpates());
 } 
 public void status(){
        System.out.println(this.getNome());
        System.out.println("E um peso"+this.getCategoria());
        System.out.println(this.getVitorias()+"vitorias");
        System.out.println(this.getDerrotas()+"derrotas");
        System.out.println(this.getEmpates()+"empates");
       
    
 } 
public void ganharLuta(){
 this.setVitorias(this.getVitorias() + 1);
    
} 
public void perderLuta(){
  this.setVitorias(this.getDerrotas() + 1);       
    

} 

public void empatarLuta(){
  this.setVitorias(this.getEmpates() + 1);       
    

} 



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
        if (this.getPeso()< 52.2) {
            this.categoria = "Invalido";
        }else if(this.getPeso()<=70.3){
            this.categoria = "Leve";
        }else if(this.getPeso()<= 83.9){
           this.categoria ="Medio"; 
        }else if(this.getPeso()<= 120.2){
            
        }else{
          this.categoria = "Invalido";  
        }
        
         
         
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
        
        
        
}
