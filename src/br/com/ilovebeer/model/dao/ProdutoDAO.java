package br.com.ilovebeer.model.dao;

import br.com.ilovebeer.model.entity.Produto;

public class ProdutoDAO extends AbstractDAO<Produto> {

    @Override
    public void salvarDados(Produto produto) {
        super.salvarDados(produto);
    }

    @Override
    public void atualizarDados(Produto produto) {
        super.atualizarDados(produto);
    }

    @Override
    public void removerDados(Produto produto, int id) {
        super.removerDados(produto, id);
    }

    @Override
    public void exibirDados(Produto produto) {
        super.exibirDados(produto);
    }
}
