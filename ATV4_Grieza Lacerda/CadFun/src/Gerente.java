import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {
    List<Vendedor> vendedores = new ArrayList<>();
    
    private String setor;
    private double comissaoGerente;
    private double comissaoTotalGerente;

    public Gerente(String cpf, String nome, int idade, String cargo, double salario, String setor, double comissaoGerente, double comissaoTotalGerente) {
        super(cpf, nome, idade, cargo, salario);
        this.setor = setor;
        this.comissaoGerente = comissaoGerente;
        this.comissaoTotalGerente = comissaoTotalGerente;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getComissaoGerente() {
        return comissaoGerente;
    }

    public void setComissaoGerente(double comissaoGerente) {
        this.comissaoGerente = comissaoGerente;
    }

    public double getComissaoTotalGerente() {
        for(int i = 0; i < vendedores.size(); i++) {
            comissaoTotalGerente += vendedores.get(i).getTotalVendas() * comissaoGerente;
        }
        return comissaoTotalGerente;
    }

    public void setComissaoTotalGerente(double comissaoTotalGerente) {
        this.comissaoTotalGerente = comissaoTotalGerente;
    }

    @Override
    public String toString() {
        return super.toString() + ", Setor: " + setor + "\nComissão do Gerente: " + comissaoGerente + ", Comissao Total do Gerente: R$ " + comissaoTotalGerente + "\n";
    }
}
