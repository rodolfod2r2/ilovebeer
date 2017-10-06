package br.com.ilovebeer.controller;

import br.com.ilovebeer.model.dao.CarrinhoDAO;
import br.com.ilovebeer.model.entity.Carrinho;

import java.util.List;

public class ControllerCarrinho implements InterfaceControl<Carrinho> {

    CarrinhoDAO carrinhoDAO;

    public ControllerCarrinho() {
        carrinhoDAO = new CarrinhoDAO();
    }

    @Override
    public void salvar(Carrinho carrinho) {
        carrinhoDAO.salvarDados(carrinho);
    }

    @Override
    public void atualizar(Carrinho carrinho) {
        carrinhoDAO.atualizarDados(carrinho);
    }

    @Override
    public void remover(Carrinho carrinho, int id) {
        carrinhoDAO.removerDados(carrinho, id);
    }

    @Override
    public List exibir(Carrinho carrinho) {
        return carrinhoDAO.exibirDados(carrinho);
    }
}
