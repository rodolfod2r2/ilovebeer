package br.com.ilovebeer.model.dao;

import br.com.ilovebeer.model.entity.Carrinho;

import javax.persistence.Transient;

public class CarrinhoDAO extends AbstractDAO<Carrinho> {

    @Transient
    @Override
    public void salvarDados(Carrinho carrinho) {
        super.salvarDados(carrinho);
    }

    @Override
    public void atualizarDados(Carrinho carrinho) {
        super.atualizarDados(carrinho);
    }

    @Override
    public void removerDados(Carrinho carrinho, int id) {
        super.removerDados(carrinho, id);
    }

    @Override
    public void exibirDados(Carrinho carrinho) {
        super.exibirDados(carrinho);
    }

}
