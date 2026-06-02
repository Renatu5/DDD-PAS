package br.pucrs.nomeusuario.exemplo.domain.models;

public class VendaModel {
    private long id;
    private long idProduto;
    private ProdutoModel produto;
    private int quantidade;

    public VendaModel(long id, long idProduto, int quantidade) {
        this.id = id;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
    }

    public long getId() {
        return id;
    }

    public long getIdProduto() {
        return idProduto;
    }

    public ProdutoModel getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
