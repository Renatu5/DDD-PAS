package br.pucrs.nomeusuario.exemplo.application.usecases;

import org.springframework.stereotype.Component;

import br.pucrs.nomeusuario.exemplo.domain.services.ServicoDeProduto;

@Component
public class VenderProdutoDisponivelUC {
    private ServicoDeProduto produto;

    public VenderProdutoDisponivelUC(ServicoDeProduto produto) {
        this.produto = produto;
    }

    public double run(long idProduto, int quantidade) {
        return produto.venderProduto(idProduto, quantidade);
    }
}
