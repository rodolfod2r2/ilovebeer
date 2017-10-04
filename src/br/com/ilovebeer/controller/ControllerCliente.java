package br.com.ilovebeer.controller;

import br.com.ilovebeer.model.dao.ClienteDAO;
import br.com.ilovebeer.model.entity.Cliente;

public class ControllerCliente implements InterfaceControl<Cliente> {

    ClienteDAO clienteDAO;

    public ControllerCliente() {
        clienteDAO = new ClienteDAO();
    }

    @Override
    public void salvar(Cliente cliente) {
        clienteDAO.salvarDados(cliente);
    }

    @Override
    public void atualizar(Cliente cliente) {
        clienteDAO.atualizarDados(cliente);
    }

    @Override
    public void remover(Cliente cliente, int id) {
        clienteDAO.removerDados(cliente, id);
    }

    @Override
    public void exibir(Cliente cliente) {
        clienteDAO.exibirDados(cliente);
    }
}

