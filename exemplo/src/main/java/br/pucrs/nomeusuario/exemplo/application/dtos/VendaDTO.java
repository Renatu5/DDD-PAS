package br.pucrs.nomeusuario.exemplo.application.dtos;

public class VendaDTO {
    private long codigoProduto;
    private int quantidade;
    private ProdutoDTO produto;

    public VendaDTO(long codigoProduto, int quantidade, ProdutoDTO produto) {
        this.codigoProduto = codigoProduto;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public long getCodigoProduto() {
        return codigoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public ProdutoDTO getProduto() {
        return produto;
    }

}
