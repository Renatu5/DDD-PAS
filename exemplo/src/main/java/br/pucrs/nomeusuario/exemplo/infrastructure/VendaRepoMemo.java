package br.pucrs.nomeusuario.exemplo.infrastructure;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.pucrs.nomeusuario.exemplo.domain.models.VendaModel;
import br.pucrs.nomeusuario.exemplo.domain.persistence.IVendaRepositorio;

@Repository
public class VendaRepoMemo implements IVendaRepositorio {
    private List<VendaModel> vendas;

    public VendaRepoMemo(List<VendaModel> vendas) {
        this.vendas = vendas;
    }

    public List<VendaModel> getVendas() {
        return vendas;
    }

    @Override
    public VendaModel venderProduto(VendaModel venda) {
        vendas.add(venda);
        return venda;
    }

}
