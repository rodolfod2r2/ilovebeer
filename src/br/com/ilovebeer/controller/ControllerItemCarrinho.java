package br.com.ilovebeer.controller;

import br.com.ilovebeer.model.dao.ItemCarrinhoDAO;
import br.com.ilovebeer.model.entity.ItemCarrinho;

public class ControllerItemCarrinho implements InterfaceControl<ItemCarrinho> {

    ItemCarrinhoDAO itemCarrinhoDAO;

    public ControllerItemCarrinho() {
        itemCarrinhoDAO = new ItemCarrinhoDAO();
    }

    @Override
    public void salvar(ItemCarrinho itemCarrinho) {
        itemCarrinhoDAO.salvarDados(itemCarrinho);
    }

    @Override
    public void atualizar(ItemCarrinho itemCarrinho) {
        itemCarrinhoDAO.atualizarDados(itemCarrinho);
    }

    @Override
    public void remover(ItemCarrinho itemCarrinho, int id) {
        itemCarrinhoDAO.removerDados(itemCarrinho, id);
    }

    @Override
    public void exibir(ItemCarrinho itemCarrinho) {

    }
}
