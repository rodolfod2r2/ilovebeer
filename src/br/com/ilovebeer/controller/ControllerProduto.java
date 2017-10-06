package br.com.ilovebeer.controller;

import br.com.ilovebeer.model.dao.ProdutoDAO;
import br.com.ilovebeer.model.entity.Produto;

import java.util.List;

public class ControllerProduto implements InterfaceControl<Produto> {

    ProdutoDAO produtoDAO;

    public ControllerProduto() {
        produtoDAO = new ProdutoDAO();
    }

    @Override
    public void salvar(Produto produto) {
        produtoDAO.salvarDados(produto);
    }

    @Override
    public void atualizar(Produto produto) {
        produtoDAO.atualizarDados(produto);
    }

    @Override
    public void remover(Produto produto, int id) {
        produtoDAO.removerDados(produto, id);
    }

    @Override
    public List exibir(Produto produto) {
        return produtoDAO.exibirDados(produto);
    }

}
