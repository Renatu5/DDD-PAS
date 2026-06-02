package br.pucrs.nomeusuario.exemplo.domain.services;

import org.springframework.stereotype.Service;

import br.pucrs.nomeusuario.exemplo.domain.models.ProdutoModel;
import br.pucrs.nomeusuario.exemplo.domain.models.VendaModel;
import br.pucrs.nomeusuario.exemplo.domain.persistence.IEstoqueRepositorio;
import br.pucrs.nomeusuario.exemplo.domain.persistence.IProdutoRepositorio;
import br.pucrs.nomeusuario.exemplo.domain.persistence.IVendaRepositorio;

@Service
public class ServicoDeProduto {
    private IProdutoRepositorio produtos;
    private IEstoqueRepositorio estoque;
    private IVendaRepositorio vendas;

    public ServicoDeProduto(IProdutoRepositorio produtos, IEstoqueRepositorio estoque, IVendaRepositorio vendas) {
        this.produtos = produtos;
        this.estoque = estoque;
        this.vendas = vendas;
    }

    public double venderProduto(long idProduto, int quantidade) {
        int quantidadeEstoque = estoque.quantidadeEmEstoque(idProduto);
        ProdutoModel produto = produtos.consultaPorId(idProduto);
        if (quantidadeEstoque >= quantidade) {
            estoque.baixaEstoque(idProduto, quantidade);
            vendas.venderProduto(new VendaModel(quantidade, idProduto, quantidadeEstoque));

            return calcularValorVenda(produto.getPrecoUnitario(), quantidade);
        } else {
            return -1;
        }
    }

    private double calcularValorVenda(double valor, int quantidade) {
        if (quantidade > 10)
            return (valor * 0.1) * 0.05;
        return valor * 0.05;
    }
}
