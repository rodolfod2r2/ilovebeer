package br.com.ilovebeer.model.dao;

import br.com.ilovebeer.model.entity.Produto;

import java.util.List;

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
    public List exibirDados(Produto produto) {
        return super.exibirDados(produto);
    }
}
