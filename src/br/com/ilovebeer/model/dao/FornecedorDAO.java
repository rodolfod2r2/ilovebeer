package br.com.ilovebeer.model.dao;

import br.com.ilovebeer.model.entity.Fornecedor;

import java.util.List;

public class FornecedorDAO extends AbstractDAO<Fornecedor> {

    @Override
    public void salvarDados(Fornecedor fornecedor) {
        super.salvarDados(fornecedor);
    }

    @Override
    public void atualizarDados(Fornecedor fornecedor) {
        super.atualizarDados(fornecedor);
    }

    @Override
    public void removerDados(Fornecedor fornecedor, int id) {
        super.removerDados(fornecedor, id);
    }

    @Override
    public List exibirDados(Fornecedor fornecedor) {
        return super.exibirDados(fornecedor);
    }
}
