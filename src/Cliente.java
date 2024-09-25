

public class Cliente {
    String nome;
    double idade;
    private String cpf;         
    private String endereco;    
    boolean novoCliente;

   
    void ficha() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("É um novo cliente? " + this.novoCliente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isNovoCliente() {
        return novoCliente;
    }

    public void setNovoCliente(boolean novoCliente) {
        this.novoCliente = novoCliente;
    }

   
    void situacaoCliente() {
        if (novoCliente) {
            System.out.println("ESSE CLIENTE É NOVO");
        } else {
            System.out.println("JÁ É CLIENTE");
        }
    }

    
    void clienteNovo() {
        this.novoCliente = true;
    }

   
    void clienteAntigo() {
        this.novoCliente = false;
    }
}
