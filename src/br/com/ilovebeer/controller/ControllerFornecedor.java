package br.com.ilovebeer.controller;

import br.com.ilovebeer.model.dao.FornecedorDAO;
import br.com.ilovebeer.model.entity.Fornecedor;

import java.util.List;

public class ControllerFornecedor implements InterfaceControl<Fornecedor> {

    FornecedorDAO fornecedorDAO;

    public ControllerFornecedor() {
        fornecedorDAO = new FornecedorDAO();
    }

    @Override
    public void salvar(Fornecedor fornecedor) {
        fornecedorDAO.salvarDados(fornecedor);
    }

    @Override
    public void atualizar(Fornecedor fornecedor) {
        fornecedorDAO.atualizarDados(fornecedor);
    }

    @Override
    public void remover(Fornecedor fornecedor, int id) {
        fornecedorDAO.removerDados(fornecedor, id);
    }

    @Override
    public List exibir(Fornecedor fornecedor) {
        return fornecedorDAO.exibirDados(fornecedor);
    }
}
