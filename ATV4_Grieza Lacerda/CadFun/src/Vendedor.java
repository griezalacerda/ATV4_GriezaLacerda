import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Funcionario {
    public Gerente gerente;
    private List<Vendas> vendas = new ArrayList<>();

    private double totalVendas;
    private double comissaoVendedor;
    private double totalComissao;

    public Vendedor(String cpf, String nome, int idade, String cargo, double salario, Gerente gerente, double totalVendas, double comissaoVendedor, double totalComissao) {
        super(cpf, nome, idade, cargo, salario);
        this.gerente = gerente;
        this.totalVendas = totalVendas;
        this.comissaoVendedor = comissaoVendedor;
        this.totalComissao = totalComissao;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public List<Vendas> getVendas() {
        return vendas;
    }

    public void setVendas(List<Vendas> vendas) {
        this.vendas = vendas;
    }

    public double getTotalVendas() {
        for(int i = 0; i < vendas.size(); i++) {
            totalVendas += vendas.get(i).valorVenda;
        }
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getComissaoVendedor() {
        return comissaoVendedor;
    }

    public void setComissaoVendedor(double comissaoVendedor) {
        this.comissaoVendedor = comissaoVendedor;
    }

    public double getTotalComissao() {
        totalComissao = totalVendas * comissaoVendedor;
        return totalComissao;
    }

    public void setTotalComissao(double totalComissao) {
        this.totalComissao = totalComissao;
    }

    @Override
    public String toString() {
        return "\n##### Funcionário: #####\n" + super.toString() +
               "\nVendas: " + vendas + ", Total das Vendas: R$ " + totalVendas +
               ", Comissão do Vendedor: " + comissaoVendedor + "%, Comissão Total: R$ " + totalComissao +
               "\n##### Gerente Responsável: #####\n" + gerente;
    }
}
