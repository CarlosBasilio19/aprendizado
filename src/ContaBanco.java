
import javax.swing.JOptionPane;

public class ContaBanco {
    public int NumeroDaConta;
    protected String Tipo;
    private String Dono;
    private Float Saldo;
    private boolean status;

    public ContaBanco() {
        this.Saldo = 0f;
        this.status = false;
    }

    public void EstadoAtual() {
        JOptionPane.showMessageDialog(null, this.getNumeroDaConta());
        JOptionPane.showMessageDialog(null, this.getTipo());
        JOptionPane.showMessageDialog(null, this.getDono());
        JOptionPane.showMessageDialog(null, this.getSaldo());
        JOptionPane.showMessageDialog(null, this.isStatus());
    }

    public int getNumeroDaConta() {
        return NumeroDaConta;
    }

    public void setNumeroDaConta(int NumeroDaConta) {
        this.NumeroDaConta = NumeroDaConta;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String t) {
        this.Tipo = t;
    }

    public String getDono() {
        return Dono;
    }

    public void setDono(String D) {
        this.Dono = D;
    }

    public Float getSaldo() {
        return Saldo;
    }

    public void setSaldo(Float S) {
        this.Saldo = S;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

    public void AbrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")) {
            this.setSaldo(50f);
        } else if (t.equals("CP")) {
            this.setSaldo(150f);
        }
        JOptionPane.showMessageDialog(null, "CONTA ABERTA COM SUCESSO");
    }

    public void FecharConta() {
        if (this.getSaldo() > 0) {
            JOptionPane.showMessageDialog(null, "ESSA CONTA TEM DINHEIRO");
        } else if (this.getSaldo() < 0) {
            JOptionPane.showMessageDialog(null, "ESTA EM DÉBITO");
        } else {
            this.setStatus(false);
        }
    }

    public void Depositar(float v) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
            JOptionPane.showMessageDialog(null, "DEPÓSITO REALIZADO COM SUCESSO");
        } else {
            JOptionPane.showMessageDialog(null, "IMPOSSÍVEL DEPOSITAR EM UMA CONTA FECHADA");
        }
    }

    public void Sacar(float v) {
        if (this.isStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                JOptionPane.showMessageDialog(null, "SAQUE REALIZADO COM SUCESSO");
            } else {
                JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE");
            }
        } else {
            JOptionPane.showMessageDialog(null, "CONTA FECHADA, IMPOSSÍVEL SACAR");
        }
    }

    public void PagarMensalidade() {
        int v = 0;
        if (this.getTipo().equals("CC")) {
            v = 12;
        } else if (this.getTipo().equals("CP")) {
            v = 20;
        }

        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - v);
            JOptionPane.showMessageDialog(null, "MENSALIDADE PAGA: " + this.getDono());
        } else {
            JOptionPane.showMessageDialog(null, "NÃO FOI POSSÍVEL PAGAR A MENSALIDADE");
        }
    }
}
