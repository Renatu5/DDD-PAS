package br.pucrs.nomeusuario.exemplo.domain.persistence;

import br.pucrs.nomeusuario.exemplo.domain.models.VendaModel;

public interface IVendaRepositorio {
    public VendaModel venderProduto(VendaModel venda);
}
