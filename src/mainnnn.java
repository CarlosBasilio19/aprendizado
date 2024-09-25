
public class mainnnn {

public static void main (String[]args){
    
     Cliente cliente1 = new Cliente();

        
        cliente1.setCpf("123.456.789-00");   
        cliente1.idade = 25;               
        cliente1.setEndereco("Rua Exemplo, 123");  
        cliente1.nome = "Carlos Eduardo";  

        
        cliente1.clienteNovo();

      
        cliente1.situacaoCliente();

      
        cliente1.ficha();
    }   

}
