import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Gerente gerente01 = new Gerente("123.456.789-10", "Joana Silva", 30, "Gerente Recife", 3000.00, "Vendas Setor 01", 0.05, 1.00);
        Gerente gerente02 = new Gerente("234.567.890-01", "Luiz Oliveira", 28, "Gerente Olinda", 3800.00, "Vendas Setor 02", 0.05, 1.00);
        Vendedor vendedor01 = new Vendedor("147.258.369-12", "Marcela Campos", 20, "Vendedor Setor 01", 1200.00, gerente01, 0.00, 0.01, 1.00);
        Vendedor vendedor02 = new Vendedor("987.654.321-00", "Maria Nascimento", 19, "Vendedor Setor 02", 1200.00, gerente02, 0.00, 0.01, 1.00);
        
        List<Vendas> vendas01 = new ArrayList<>();
        List<Vendas> vendas02 = new ArrayList<>();
        Vendas produtoA = new Vendas(1000);
        Vendas produtoB = new Vendas(2000);
        Vendas produtoC = new Vendas(3000);
        Vendas produtoD = new Vendas(4000);
        Vendas produtoE = new Vendas(5000);
        Vendas produtoF = new Vendas(6000);
        vendas01.add(produtoA);
        vendas01.add(produtoB);
        vendas01.add(produtoC);
        vendas02.add(produtoD);
        vendas02.add(produtoE);
        vendas02.add(produtoF);

        vendedor01.setVendas(vendas01);
        vendedor02.setVendas(vendas02);
        vendedor01.getTotalVendas();
        vendedor01.getTotalComissao();
        vendedor02.getTotalVendas();
        vendedor02.getTotalComissao();
        gerente01.getComissaoTotalGerente();
        gerente02.getComissaoTotalGerente();

        System.out.println(vendedor01.toString() + vendedor02.toString());
    }
}
