package br.com.ilovebeer.model.dao;

import br.com.ilovebeer.model.entity.ItemCarrinho;

import java.util.List;

public class ItemCarrinhoDAO extends AbstractDAO<ItemCarrinho> {

    @Override
    public void salvarDados(ItemCarrinho itemCarrinho) {
        super.salvarDados(itemCarrinho);
    }

    @Override
    public void atualizarDados(ItemCarrinho itemCarrinho) {
        super.atualizarDados(itemCarrinho);
    }

    @Override
    public void removerDados(ItemCarrinho itemCarrinho, int id) {
        super.removerDados(itemCarrinho, id);
    }

    @Override
    public List exibirDados(ItemCarrinho itemCarrinho) {
        return super.exibirDados(itemCarrinho);
    }
}
